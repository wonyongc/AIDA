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
 * Factory for fitter and fit data objects.
 *
 * @author The AIDA team (http://aida.freehep.org/)
 *
 */

public interface IFitFactory {

    public IFitData createFitData();

    /**
     * Create a new IFitter.
     *                    - "CHI2" or "Chi2" or "ChiSquared" for chi squared fitter (this is the default),
     *                    - "ML" or "MaxLikelihood" for maximum likelihood fitter,
     *                    - "LS" or "LeastSquares" for Last Squares fitter.
     *                   specific implementation in use. The default is "" (the implementation specific default).
     * @return           The IFitter.
     * @throws           An IllegalArgumentException an argument is incorrect.
     *
     */
    public IFitter createFitter() throws IllegalArgumentException;
    /**
     * Create a new IFitter.
     * @param fitterType The type of fitter. The supported types are:
     *                    - "CHI2" or "Chi2" or "ChiSquared" for chi squared fitter (this is the default),
     *                    - "ML" or "MaxLikelihood" for maximum likelihood fitter,
     *                    - "LS" or "LeastSquares" for Last Squares fitter.
     *                   specific implementation in use. The default is "" (the implementation specific default).
     * @return           The IFitter.
     * @throws           An IllegalArgumentException an argument is incorrect.
     *
     */
    public IFitter createFitter(String fitterType) throws IllegalArgumentException;
    /**
     * Create a new IFitter.
     * @param fitterType The type of fitter. The supported types are:
     *                    - "CHI2" or "Chi2" or "ChiSquared" for chi squared fitter (this is the default),
     *                    - "ML" or "MaxLikelihood" for maximum likelihood fitter,
     *                    - "LS" or "LeastSquares" for Last Squares fitter.
     * @param engineType The type of optimization engine used by the fitter. The available types depend on the
     *                   specific implementation in use. The default is "" (the implementation specific default).
     * @return           The IFitter.
     * @throws           An IllegalArgumentException an argument is incorrect.
     *
     */
    public IFitter createFitter(String fitterType, String engineType) throws IllegalArgumentException;
    /**
     * Create a new IFitter.
     * @param fitterType The type of fitter. The supported types are:
     *                    - "CHI2" or "Chi2" or "ChiSquared" for chi squared fitter (this is the default),
     *                    - "ML" or "MaxLikelihood" for maximum likelihood fitter,
     *                    - "LS" or "LeastSquares" for Last Squares fitter.
     * @param engineType The type of optimization engine used by the fitter. The available types depend on the
     *                   specific implementation in use. The default is "" (the implementation specific default).
     * @param options    A string of options. The default is "".
     * @return           The IFitter.
     * @throws           An IllegalArgumentException an argument is incorrect.
     *
     */
    public IFitter createFitter(String fitterType, String engineType, String options) throws IllegalArgumentException;
} // class or interface
