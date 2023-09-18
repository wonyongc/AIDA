// -*- C++ -*-
// AID-GENERATED
// =========================================================================
// This class was generated by AID - Abstract Interface Definition          
// DO NOT MODIFY, but use the org.freehep.aid.Aid utility to regenerate it. 
// =========================================================================
#ifndef AIDA_IHISTOGRAM3D_H
#define AIDA_IHISTOGRAM3D_H 1

//  This file is part of the AIDA library
//  Copyright (C) 2002 by the AIDA team.  All rights reserved.
//  This library is free software and under the terms of the
//  GNU Library General Public License described in the LGPL.txt 

#include "AIDA/IHistogram.h"

namespace AIDA {

class IAxis;

/**
 * User level interface to 3D Histogram.
 *
 * @author The AIDA team (http://aida.freehep.org/)
 *
 */

class IHistogram3D : virtual public IHistogram {

public: 
    /// Destructor.
    virtual ~IHistogram3D() { /* nop */; }

    /**
     * Fill the IHistogram3D with a triplet of values and the
     * corresponding weight.
     * @param x      The x value to be filled in.
     * @param y      The y value to be filled in.
     * @param z      The z value to be filled in.
     * @param weight The corresponding weight (by default 1).
     * @return false If the weight is <0 or >1 (?).
     *
     */
    virtual bool fill(double x, double y, double z, double weight = 1.) = 0;

    /**
     * The weighted mean along the x axis of a given bin.
     * @param indexX The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexY The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexZ The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The mean of the corresponding bin along the x axis.
     *
     */
    virtual double binMeanX(int indexX, int indexY, int indexZ) const = 0;

    /**
     * The weighted mean the y axis of a given bin.
     * @param indexX The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexY The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexZ The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The mean of the corresponding bin along the y axis.
     *
     */
    virtual double binMeanY(int indexX, int indexY, int indexZ) const = 0;

    /**
     * The weighted mean the z axis of a given bin. 
     * @param indexX The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexY The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexZ The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The mean of the corresponding bin along the z axis.
     *
     */
    virtual double binMeanZ(int indexX, int indexY, int indexZ) const = 0;

    /**
     * Number of entries in the corresponding bin (ie the number of times fill was called for this bin).
     * @param indexX The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexY The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexZ The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return       The number of entries in the corresponding bin. 
     *
     */
    virtual int binEntries(int indexX, int indexY, int indexZ) const = 0;

    /**
     * Sum of all the entries of the bins along a given x bin.
     * This is equivalent to <tt>projectionXY().binEntriesX(index)</tt>.
     * @param index The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The number of entries in the corresponding set of bins. 
     *
     */
    virtual int binEntriesX(int index) const = 0;

    /**
     * Sum of all the entries of the bins along a given y bin.
     * This is equivalent to <tt>projectionXY().binEntriesY(index)</tt>.
     * @param index The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The number of entries in the corresponding set of bins. 
     *
     */
    virtual int binEntriesY(int index) const = 0;

    /**
     * Sum of all the entries of the bins along a given z bin.
     * This is equivalent to <tt>projectionXZ().binEntriesZ(index)</tt>.
     * @param index The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The number of entries in the corresponding set of bins. 
     *
     */
    virtual int binEntriesZ(int index) const = 0;

    /**
     * Total height of a give bin (ie the sum of the weights in this bin).
     * @param indexX The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexY The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexZ The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return       The height of the corresponding bin.
     *
     */
    virtual double binHeight(int indexX, int indexY, int indexZ) const = 0;

    /**
     * Sum of all the heights of the bins along a given x bin.
     * This is equivalent to <tt>projectionXY().binHeightX(index)</tt>.
     * @param index The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The sum of the heights in the corresponding set of bins. 
     *
     */
    virtual double binHeightX(int index) const = 0;

    /**
     * Sum of all the heights of the bins along a given y bin.
     * This is equivalent to <tt>projectionXY().binHeightY(index)</tt>.
     * @param index The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The sum of the heights in the corresponding set of bins. 
     *
     */
    virtual double binHeightY(int index) const = 0;

    /**
     * Sum of all the heights of the bins along a given z bin.
     * This is equivalent to <tt>projectionXZ().binHeightZ(index)</tt>.
     * @param index The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The sum of the heights in the corresponding set of bins. 
     *
     */
    virtual double binHeightZ(int index) const = 0;

    /**
     * The error of a given bin.
     * @param indexX The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexY The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexZ The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return       The error on the corresponding bin.
     *
     */
    virtual double binError(int indexX, int indexY, int indexZ) const = 0;

    /**
     * The mean of the IHistogram3D along the x axis.
     * @return The mean of the IHistogram3D along the x axis.
     *
     */
    virtual double meanX() const = 0;

    /**
     * The mean of the IHistogram3D along the y axis.
     * @return The mean of the IHistogram3D along the y axis.
     *
     */
    virtual double meanY() const = 0;

    /**
     * The mean of the IHistogram3D along the z axis.
     * @return The mean of the IHistogram3D along the z axis.
     *
     */
    virtual double meanZ() const = 0;

    /**
     * The RMS of the IHistogram3D along the x axis.
     * @return The RMS if the IHistogram3D along the x axis.
     *
     */
    virtual double rmsX() const = 0;

    /**
     * The RMS of the IHistogram3D along the y axis.
     * @return The RMS if the IHistogram3D along the y axis.
     *
     */
    virtual double rmsY() const = 0;

    /**
     * The RMS of the IHistogram3D along the z axis.
     * @return The RMS if the IHistogram3D along the z axis.
     *
     */
    virtual double rmsZ() const = 0;

    /**
     * Get the x axis of the IHistogram3D.
     * @return The x coordinate IAxis.
     *
     */
    virtual const IAxis & xAxis() const = 0;

    /**
     * Get the y axis of the IHistogram3D.
     * @return The y coordinate IAxis.
     *
     */
    virtual const IAxis & yAxis() const = 0;

    /**
     * Get the z axis of the IHistogram3D.
     * @return The z coordinate IAxis.
     *
     */
    virtual const IAxis & zAxis() const = 0;

    /**
     * Get the bin number corresponding to a given coordinate along the x axis.
     * This is a convenience method, equivalent to <tt>xAxis().coordToIndex(coord)</tt>.
     * @see IAxis#coordToIndex(double)
     * @param coord The coordinalte along the x axis.
     * @return      The corresponding bin number.
     *
     */
    virtual int coordToIndexX(double coord) const = 0;

    /**
     * Get the bin number corresponding to a given coordinate along the y axis.
     * This is a convenience method, equivalent to <tt>yAxis().coordToIndex(coord)</tt>.
     * @see IAxis#coordToIndex(double)
     * @param coord The coordinalte along the y axis.
     * @return      The corresponding bin number.
     *
     */
    virtual int coordToIndexY(double coord) const = 0;

    /**
     * Get the bin number corresponding to a given coordinate along the z axis.
     * This is a convenience method, equivalent to <tt>zAxis().coordToIndex(coord)</tt>.
     * @see IAxis#coordToIndex(double)
     * @param coord The coordinalte along the z axis.
     * @return      The corresponding bin number.
     *
     */
    virtual int coordToIndexZ(double coord) const = 0;

    /**
     * Add to this IHistogram3D the contents of another IHistogram3D.
     * @param hist The IHistogram3D to be added to this IHistogram3D.
     * @return false If the IHistogram3Ds binnings are incompatible.
     *
     */
    virtual bool add(const IHistogram3D & hist) = 0;
}; // class
} // namespace AIDA
#endif /* ifndef AIDA_IHISTOGRAM3D_H */
