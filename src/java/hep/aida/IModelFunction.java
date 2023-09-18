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
 * Interface of model function for fitting (for advanced users).
 *
 * OPEN QUESTIONS:
 *
 * How to treat normalization at user level? Two possibilities:
 * - we have "Gauss" and "NormalizedGauss", the first one user cannot
 *   use for ML fit
 * - we have only one "Gauss" function, but it's smart and when normalized,
 *   gets rid of one of its parameters
 *
 * Normalization range might be set directly on the function by the user?
 * Now we set it in the data pipe, Victor thinks that it is not very clear
 * and should be on the function ;)
 *
 * @author  The AIDA team (http://aida.freehep.org/)
 *
 */

public interface IModelFunction extends IFunction {

  /// Return false if function does not provide the normalization capability.
    public boolean providesNormalization();

  /**
   * Normalize by internally adjusting some of the parameters.
   * When normalization is on then integral of the function in
   * the normalization range equals to 1.
   */
    public void normalize(boolean on);

  /**
   * Return true if normalization is currently switched on.
   */
    public boolean isNormalized();

  /**
   * Compute gradient with respect to parameters.
   */
    public double[] parameterGradient(double[] x);

  /**
   * Return true if provides parameter gradient.
   */
    public boolean providesParameterGradient();

  /**
   * Set the normalization range from -inf to +inf in the i-th
   * axis (dimension).
   *
   * Full range is the default if not set otherwise.
   * It is still possible to evaluate function outside of the
   * normalization range.
   *
   * PENDING: no methods to retrieve current range!
   */
    public IRangeSet normalizationRange(int iAxis);

  /**
   * Set full range in all axes.
   */
    public void includeNormalizationAll();

  /**
   * Set empty range in all axes.
   */
    public void excludeNormalizationAll();
} // class or interface
