// AID-GENERATED
// =========================================================================
// This class was generated by AID - Abstract Interface Definition          
// DO NOT MODIFY, but use the org.freehep.aid.Aid utility to regenerate it. 
// =========================================================================

//  This file is part of the AIDA library
//  Copyright (C) 2002 by the AIDA team.  All rights reserved.
//  This library is free software and under the terms of the
//  GNU Library General Public License described in the LGPL.txt 
package hep.aida;


/**
 *
 * Fitter performs fits, scans and computes contours.
 *
 * Fitter never stores association to the data and functions which are
 * used for fitting. Results of the fit are availabe in the IFitResult
 * object, which also remebers the initial fit configuration.
 *
 * @author The AIDA team (http://aida.freehep.org/)
 *
 */

public interface IFitter {

    /**
     * Fit an IFunction to an IFitData.
     * The result of the fit is an IFitResult.
     * @param fitData The IFitData to be fitted.
     * @param func    The IFunction to fit on the data.
     * @return        The IFitResult containing the results of the fit.
     *
     */
    public IFitResult fit(IFitData fitData, IFunction func);

    /**
     * Shortcut to fit an IBaseHistogram directly with an IFunction. 
     * The dimension of the IBaseHistogram must match the dimension of the IFunction.
     * IHistograms and IProfiles are for binned fits only, IClouds only for unbinned fits.
     * @param hist The IBaseHistogram to be fitted.
     * @param func The IFunction to fit on the data.
     * @return     The IFitResult containing the result of the fit.
     *
     */
    public IFitResult fit(IBaseHistogram hist, IFunction func);

    /**
     * Shortcut to fit an IBaseHistogram directly with an IFunction. 
     * The dimension of the IBaseHistogram must match the dimension of the IFunction.
     * IHistograms and IProfiles are for binned fits only, IClouds only for unbinned fits.
     * @param hist  The IBaseHistogram to be fitted.
     * @param model The string defining the function to be used.
     * @return      The IFitResult containing the result of the fit.
     *
     */
    public IFitResult fit(IBaseHistogram hist, String model);

    /**
     * Shortcut to fit an IBaseHistogram directly with an IFunction. 
     * The dimension of the IBaseHistogram must match the dimension of the IFunction.
     * IHistograms and IProfiles are for binned fits only, IClouds only for unbinned fits.
     * @param hist              The IBaseHistogram to be fitted.
     * @param model             The string defining the function to be used.
     * @param initialParameters The array of the initial parameter values; its size must match the number of
     *                          parameters in the function.
     * @return                  The IFitResult containing the result of the fit.
     *
     */
    public IFitResult fit(IBaseHistogram hist, String model, double[] initialParameters);

    /**
     * Shortcut to fit an IDataPointSet directly with an IFunction. 
     * The dimension of the IDataPointSet must be equal the dimension of the IFunction + 1.
     * This are binned fits only; the last coordinate of the IDataPointSet is used as
     * the "height" in a fit to an IBaseHistogram.
     * @param dataPointSet The IDataPointSet to be fitted.
     * @param func         The IFunction to fit on the data.
     * @return             The IFitResult containing the result of the fit.
     *
     */
    public IFitResult fit(IDataPointSet dataPointSet, IFunction f);

    /**
     * Shortcut to fit an IDataPointSet directly with an IFunction. 
     * The dimension of the IDataPointSet must be equal the dimension of the IFunction + 1.
     * This are binned fits only; the last coordinate of the IDataPointSet is used as
     * the "height" in a fit to an IBaseHistogram.
     * @param dataPointSet The IDataPointSet to be fitted.
     * @param model        The string defining the function to be used.
     * @return             The IFitResult containing the result of the fit.
     *
     */
    public IFitResult fit(IDataPointSet dataPointSet, String model);

    /**
     * Shortcut to fit an IDataPointSet directly with an IFunction. 
     * The dimension of the IDataPointSet must be equal the dimension of the IFunction + 1.
     * This are binned fits only; the last coordinate of the IDataPointSet is used as
     * the "height" in a fit to an IBaseHistogram.
     * @param dataPointSet      The IDataPointSet to be fitted.
     * @param model             The string defining the function to be used.
     * @param initialParameters The array of the initial parameter values; its size must match the number of
     *                          parameters in the function.
     * @return                  The IFitResult containing the result of the fit.
     *
     */
    public IFitResult fit(IDataPointSet dataPointSet, String model, double[] initialParameters);

    /// Shortcut for the predefined models.
    public IFitResult fit(IFitData d, String model);

    public IFitResult fit(IFitData d, String model, double[] initialParameters);

    /**
     * Set the optimization engine which is used internally for fitting.
     * @param name The name of the optimizer engine.
     *             Examples of predefined engines: "minuit". The engine name is case-insensitive.
     *             Different engines are provided by different implementations.
     * @throws     IllegalArgumentException If the name does not correspond to a valid engine.
     *
     */
    public void setEngine(String name) throws IllegalArgumentException;

    /**
     * Get the name of the engine currently in use.
     * @return The name of the optimizer engine used by the IFitter.
     *
     */
    public String engineName();

    /**
     * Access to fit parameter settings. FitParameterSettings object belongs to
     * and is managed by the fitter. Fitter implementation takes care that the
     * returned reference is valid thru the lifetime of fitter.
     * User can set the settings of the parameters independently of the
     * parameters of the fitted function.
     * Setting for parameters unknown in the function and set in the
     * fitter are ignored in the fit.
     * If settings are not explicitly set in the fitter, their default
     * values are attached to function parameters during the fit.
     */
    public IFitParameterSettings fitParameterSettings(String name);

    /**
     * Get a vector of names of all parameter settings defined in the fitter.
     */
    public String[] listParameterSettings();

    /**
     * Reset all parameter settings which fitter remebers.
     */
    public void resetParameterSettings();

    /**
     * Set a general constraint in the parameter space. The constraint
     * is a parsed expression. PENDING: The syntax to be fixed.
     */
    public void setConstraint(String expr) throws IllegalArgumentException;

    /// Get the list of all constraints.
    public String[] constraints();

    /**
     * Reset all the constraints.
     */
    public void resetConstraints();

    /**
     * Set the fit method type. Examples of pre-defined methods: "chi2", "ml".
     * The method names are case-insensitive.
     * @param name The name of the fit method.
     * @throws     IllegalArgumentException If the name does not correspond to a valid fit method.
     *
     */
    public void setFitMethod(String name) throws IllegalArgumentException;

    /**
     * Get the name of the fit method currently in use.
     * @return The name of the fit method.
     *
     */
    public String fitMethodName();

    /// Create a 1D scan of the fit quality for given parameter 'par' of
    /// the function.
    /// User must make sure that the returned vector is properly deleted
    /// after use.
    /// The vector containes 'npts' points which are evenly sampled in the
    /// interval ('pmin','pmax').
    public IDataPointSet createScan1D(IFitData d, IFunction f, String par, int npts, double pmin, double pmax);

    /// Create a 2D contour spanned on 'par1' and 'par2',
    /// with given number of npts points. Contour is create using previously
    /// obtained fit results. Argument 'up' tells the vertical distance of
    /// the contour plane above the minimal fit quality value.
    public IDataPointSet createContour(IFitData d, IFitResult r, String par1, String par2, int npts, double up);

    /**
     * Choose between using or not using the
     * analytical derivatives if provided by the function.
     * @param useGrad If <code>true</code> the IFitter will use the
     *                analytical derivatives if provided by the IFunction.
     *
     */
    public void setUseFunctionGradient(boolean useGrad);

    /**
     * Check if the IFitter is set to use the analytical derivatives provided
     * by the IFunction.
     * @return <code>true</code> if the IFitter uses the analytical derivatives.
     *
     */
    public boolean useFunctionGradient();

    /**
     * @link association
     * @directed
     * @label <<create>>
     */
    /*#  IFitResult lnkIFitResult; */

    /** @link dependency */
    /*#  IFitData lnkIFitData; */

    /** @link aggregation
     * @supplierRole <<internal copy>>*/
    /*#  IFitParameterSettings lnkIFitParameter; */

    /** @link dependency
     * @label fitter uses function for fitting*/
    /*#  IFunction lnkIFunction; */
} // class or interface
