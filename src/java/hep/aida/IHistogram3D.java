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
 * User level interface to 3D Histogram.
 *
 * @author The AIDA team (http://aida.freehep.org/)
 *
 */

public interface IHistogram3D extends IHistogram {

    /**
     * Fill the IHistogram3D with a triplet of values and the
     * corresponding weight.
     * @param x      The x value to be filled in.
     * @param y      The y value to be filled in.
     * @param z      The z value to be filled in.
     * @throws       IllegalArgumentException If the weight is <0 or >1 (?).
     *
     */
    public void fill(double x, double y, double z) throws IllegalArgumentException;
    /**
     * Fill the IHistogram3D with a triplet of values and the
     * corresponding weight.
     * @param x      The x value to be filled in.
     * @param y      The y value to be filled in.
     * @param z      The z value to be filled in.
     * @param weight The corresponding weight (by default 1).
     * @throws       IllegalArgumentException If the weight is <0 or >1 (?).
     *
     */
    public void fill(double x, double y, double z, double weight) throws IllegalArgumentException;

    /**
     * The weighted mean along the x axis of a given bin.
     * @param indexX The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexY The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexZ The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The mean of the corresponding bin along the x axis.
     * @throws      IllegalArgumentException If the indexes are not a valid bin number.
     *
     */
    public double binMeanX(int indexX, int indexY, int indexZ) throws IllegalArgumentException;

    /**
     * The weighted mean the y axis of a given bin.
     * @param indexX The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexY The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexZ The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The mean of the corresponding bin along the y axis.
     * @throws      IllegalArgumentException If the indexes are not a valid bin number.
     *
     */
    public double binMeanY(int indexX, int indexY, int indexZ) throws IllegalArgumentException;

    /**
     * The weighted mean the z axis of a given bin. 
     * @param indexX The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexY The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexZ The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The mean of the corresponding bin along the z axis.
     * @throws      IllegalArgumentException If the indexes are not a valid bin number.
     *
     */
    public double binMeanZ(int indexX, int indexY, int indexZ) throws IllegalArgumentException;

    /**
     * Number of entries in the corresponding bin (ie the number of times fill was called for this bin).
     * @param indexX The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexY The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexZ The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return       The number of entries in the corresponding bin. 
     * @throws       IllegalArgumentException If the indexes are not a valid bin number.
     *
     */
    public int binEntries(int indexX, int indexY, int indexZ) throws IllegalArgumentException;

    /**
     * Sum of all the entries of the bins along a given x bin.
     * This is equivalent to <tt>projectionXY().binEntriesX(index)</tt>.
     * @param index The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The number of entries in the corresponding set of bins. 
     * @throws      IllegalArgumentException If the index id not a valid bin number.
     *
     */
    public int binEntriesX(int index) throws IllegalArgumentException;

    /**
     * Sum of all the entries of the bins along a given y bin.
     * This is equivalent to <tt>projectionXY().binEntriesY(index)</tt>.
     * @param index The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The number of entries in the corresponding set of bins. 
     * @throws      IllegalArgumentException If the index id not a valid bin number.
     *
     */
    public int binEntriesY(int index) throws IllegalArgumentException;

    /**
     * Sum of all the entries of the bins along a given z bin.
     * This is equivalent to <tt>projectionXZ().binEntriesZ(index)</tt>.
     * @param index The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The number of entries in the corresponding set of bins. 
     * @throws      IllegalArgumentException If the index id not a valid bin number.
     *
     */
    public int binEntriesZ(int index) throws IllegalArgumentException;

    /**
     * Total height of a give bin (ie the sum of the weights in this bin).
     * @param indexX The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexY The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexZ The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return       The height of the corresponding bin.
     * @throws       IllegalArgumentException If the indexes are not a valid bin number.
     *
     */
    public double binHeight(int indexX, int indexY, int indexZ) throws IllegalArgumentException;

    /**
     * Sum of all the heights of the bins along a given x bin.
     * This is equivalent to <tt>projectionXY().binHeightX(index)</tt>.
     * @param index The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The sum of the heights in the corresponding set of bins. 
     * @throws      IllegalArgumentException If the index id not a valid bin number.
     *
     */
    public double binHeightX(int index) throws IllegalArgumentException;

    /**
     * Sum of all the heights of the bins along a given y bin.
     * This is equivalent to <tt>projectionXY().binHeightY(index)</tt>.
     * @param index The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The sum of the heights in the corresponding set of bins. 
     * @throws      IllegalArgumentException If the index id not a valid bin number.
     *
     */
    public double binHeightY(int index) throws IllegalArgumentException;

    /**
     * Sum of all the heights of the bins along a given z bin.
     * This is equivalent to <tt>projectionXZ().binHeightZ(index)</tt>.
     * @param index The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return      The sum of the heights in the corresponding set of bins. 
     * @throws      IllegalArgumentException If the index id not a valid bin number.
     *
     */
    public double binHeightZ(int index) throws IllegalArgumentException;

    /**
     * The error of a given bin.
     * @param indexX The x bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexY The y bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @param indexZ The z bin number (0...N-1) or OVERFLOW or UNDERFLOW.
     * @return       The error on the corresponding bin.
     * @throws       IllegalArgumentException If the indexes are not a valid bin number.
     *
     */
    public double binError(int indexX, int indexY, int indexZ) throws IllegalArgumentException;

    /**
     * The mean of the IHistogram3D along the x axis.
     * @return The mean of the IHistogram3D along the x axis.
     *
     */
    public double meanX();

    /**
     * The mean of the IHistogram3D along the y axis.
     * @return The mean of the IHistogram3D along the y axis.
     *
     */
    public double meanY();

    /**
     * The mean of the IHistogram3D along the z axis.
     * @return The mean of the IHistogram3D along the z axis.
     *
     */
    public double meanZ();

    /**
     * The RMS of the IHistogram3D along the x axis.
     * @return The RMS if the IHistogram3D along the x axis.
     *
     */
    public double rmsX();

    /**
     * The RMS of the IHistogram3D along the y axis.
     * @return The RMS if the IHistogram3D along the y axis.
     *
     */
    public double rmsY();

    /**
     * The RMS of the IHistogram3D along the z axis.
     * @return The RMS if the IHistogram3D along the z axis.
     *
     */
    public double rmsZ();

    /**
     * Get the x axis of the IHistogram3D.
     * @return The x coordinate IAxis.
     *
     */
    public IAxis xAxis();

    /**
     * Get the y axis of the IHistogram3D.
     * @return The y coordinate IAxis.
     *
     */
    public IAxis yAxis();

    /**
     * Get the z axis of the IHistogram3D.
     * @return The z coordinate IAxis.
     *
     */
    public IAxis zAxis();

    /**
     * Get the bin number corresponding to a given coordinate along the x axis.
     * This is a convenience method, equivalent to <tt>xAxis().coordToIndex(coord)</tt>.
     * @see IAxis#coordToIndex(double)
     * @param coord The coordinalte along the x axis.
     * @return      The corresponding bin number.
     *
     */
    public int coordToIndexX(double coord);

    /**
     * Get the bin number corresponding to a given coordinate along the y axis.
     * This is a convenience method, equivalent to <tt>yAxis().coordToIndex(coord)</tt>.
     * @see IAxis#coordToIndex(double)
     * @param coord The coordinalte along the y axis.
     * @return      The corresponding bin number.
     *
     */
    public int coordToIndexY(double coord);

    /**
     * Get the bin number corresponding to a given coordinate along the z axis.
     * This is a convenience method, equivalent to <tt>zAxis().coordToIndex(coord)</tt>.
     * @see IAxis#coordToIndex(double)
     * @param coord The coordinalte along the z axis.
     * @return      The corresponding bin number.
     *
     */
    public int coordToIndexZ(double coord);

    /**
     * Add to this IHistogram3D the contents of another IHistogram3D.
     * @param hist The IHistogram3D to be added to this IHistogram3D.
     * @throws     IllegalArgumentException If the IHistogram3Ds binnings are incompatible.
     *
     */
    public void add(IHistogram3D hist) throws IllegalArgumentException;
} // class or interface

