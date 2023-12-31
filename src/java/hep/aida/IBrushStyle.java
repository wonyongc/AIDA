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
 * Superclass for anything which can be drawn in different 
 * colours and with (possibly) transparent/opaque/translucent effect.
 *
 * @author The AIDA team (http://aida.freehep.org/)
 */

public interface IBrushStyle extends IBaseStyle {

  /**
   * Get a list of the colours supported by this implementation.
   */
    public String[] availableColors();

  /** 
   * Current colour of this brush style.
   */
    public String color();

  /** 
   * Current opacity (alpha) of this brush style.
   */
    public double opacity();

  /** 
   * Set current colour, e.g. "darkGreen"
   * @return false if colour not recognised by the implementation.
   */
    public boolean setColor(String newColor);

  /**
   * Set opacity (alpha), e.g. 0 (transparent), 
   * 1 (opaque), 0.5 (halfway).
   * @return false if value not supported by the implementation.
   */
    public boolean setOpacity(double newOpacity);
} // class or interface

