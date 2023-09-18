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
 * Style for all text (e.g. axis labels, legend box text etc.)
 *
 * @author The AIDA team (http://aida.freehep.org/)
 */

public interface ITextStyle extends IBrushStyle {

  /** 
   * Get list of fonts available in this implementation.
   */
    public String[] availableFonts();

  /**
   * Get current font size.
   */
    public double fontSize();

  /**
   * Set current font size.
   * @return false if size not supported by this implementation.
   */
    public boolean setFontSize(double size);

  /**
   * Get name of current font.
   */
    public String font();

  /**
   * Set current font, e.g. "timesNewRoman" or "courier".
   * @return false if font not supported by this implementation.
   */
    public boolean setFont(String font);

    public boolean isBold();

    public boolean isItalic();

    public boolean isUnderlined();

    public boolean setBold();
    public boolean setBold(boolean bold);

    public boolean setItalic();
    public boolean setItalic(boolean italic);

    public boolean setUnderlined();
    public boolean setUnderlined(boolean underlined);
} // class or interface
