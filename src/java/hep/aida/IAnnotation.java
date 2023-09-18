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
 * The annotation holds arbitrary information represented with (key,value) pairs
 * of strings. A sticky bit is associated to every item to protect it (or not)
 * from a reset operation.
 * 
 * @author The AIDA team (http://aida.freehep.org/)
 * 
 */

public interface IAnnotation {

  /**
   * The list of the commonly accepted keys :
   * "Title" for the title.
   *
   */
    
  /**
   * Add a key/value pair with a given sticky flag.
   * If key alredy exists, override its value ?
   * @param key    The key to be added.
   * @param value  The key's value.
   *               not be removed when the method reset or removeItem are invoked.
   *               The default value for the sticky flag is <code>false</code>.
   * @throws       IllegalArgumentException If the key already exists.
   *
   */
    public void addItem(String key, String value) throws IllegalArgumentException;
  /**
   * The list of the commonly accepted keys :
   * "Title" for the title.
   *
   */
    
  /**
   * Add a key/value pair with a given sticky flag.
   * If key alredy exists, override its value ?
   * @param key    The key to be added.
   * @param value  The key's value.
   * @param sticky The key's sticky flag. If <code>true</code> the item will
   *               not be removed when the method reset or removeItem are invoked.
   *               The default value for the sticky flag is <code>false</code>.
   * @throws       IllegalArgumentException If the key already exists.
   *
   */
    public void addItem(String key, String value, boolean sticky) throws IllegalArgumentException;

  /**
   * Remove the item indicated by a given key.
   * @param key The key to be removed. If the key is flagged as "sticky" it
   *            will not be removed.
   * @throws    IllegalArgumentException If the key is sticky.
   *
   */
    public void removeItem(String key) throws IllegalArgumentException;

  /**
   * Retrieve the value for a given key.
   * @param key The key.
   * @return    The corresponding value.
   *
   */
    public String value(String key);

  /**
   * Set the value for a given key.  
   * @param key   The key whose vale is to be changed.
   * @param value The new value.
   *
   */
    public void setValue(String key, String value);

  /**
   * Set the sticky flag for a given key.
   * @param key    The key whose stick flag is to be set.
   * @param sticky The new sticky flag.
   *
   */
    public void setSticky(String key, boolean sticky);

  /**
   * Get the size of the IAnnotation, i.e. the number of keys contained in it.
   * @return The size of the IAnnotation.
   *
   */
    public int size();

  /**
   * Get the key at a given position within the IAnnotation.
   * @param index The key's position within the IAnnotation.
   * @return      The corresponding key.
   *
   */
    public String key(int index);

  /**
   * Get the value at a given position within the IAnnotation.
   * @param index The value's position within the IAnnotation.
   * @return      The corresponding value.
   *
   */
    public String value(int index);

  /**
   * Remove all the non-sticky items.
   *
   */
    public void reset();
} // class or interface

