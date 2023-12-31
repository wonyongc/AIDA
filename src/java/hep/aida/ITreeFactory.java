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

import java.io.IOException;

/**
 * The creator of trees.
 *
 * @author The AIDA team (http://aida.freehep.org/)
 */
 
public interface ITreeFactory {

    /**
     * Creates a new tree that is not associated with a store.
     */
    public ITree create();

    /**
     * Creates a new tree and associates it with a store.
     * The store is assumed to be read/write.
     * The store will be created if it does not exist.
     * @param storeName The name of the store, if empty (""), the tree is created
     *                  in memory and therefore will not be associated with a file.
     * @throws IOException if the store already exists
     * @throws IllegalArgumentException
     *
     */
    public ITree create(String storeName) throws IllegalArgumentException, IOException;
    /**
     * Creates a new tree and associates it with a store.
     * The store is assumed to be read/write.
     * The store will be created if it does not exist.
     * @param storeName The name of the store, if empty (""), the tree is created
     *                  in memory and therefore will not be associated with a file.
     * @param storeType Implementation specific string, may control store type
     * @throws IOException if the store already exists
     * @throws IllegalArgumentException
     *
     */
    public ITree create(String storeName, String storeType) throws IllegalArgumentException, IOException;
    /**
     * Creates a new tree and associates it with a store.
     * The store is assumed to be read/write.
     * The store will be created if it does not exist.
     * @param storeName The name of the store, if empty (""), the tree is created
     *                  in memory and therefore will not be associated with a file.
     * @param storeType Implementation specific string, may control store type
     * @param readOnly If true the store is opened readonly, an exception if it does not exist
     * @throws IOException if the store already exists
     * @throws IllegalArgumentException
     *
     */
    public ITree create(String storeName, String storeType, boolean readOnly) throws IllegalArgumentException, IOException;
    /**
     * Creates a new tree and associates it with a store.
     * The store is assumed to be read/write.
     * The store will be created if it does not exist.
     * @param storeName The name of the store, if empty (""), the tree is created
     *                  in memory and therefore will not be associated with a file.
     * @param storeType Implementation specific string, may control store type
     * @param readOnly If true the store is opened readonly, an exception if it does not exist
     * @param createNew If false the file must exist, if true the file will be created
     * @throws IOException if the store already exists
     * @throws IllegalArgumentException
     *
     */
    public ITree create(String storeName, String storeType, boolean readOnly, boolean createNew) throws IllegalArgumentException, IOException;
    /**
     * Creates a new tree and associates it with a store.
     * The store is assumed to be read/write.
     * The store will be created if it does not exist.
     * @param storeName The name of the store, if empty (""), the tree is created
     *                  in memory and therefore will not be associated with a file.
     * @param storeType Implementation specific string, may control store type
     * @param readOnly If true the store is opened readonly, an exception if it does not exist
     * @param createNew If false the file must exist, if true the file will be created
     * @param options Other options, currently are not specified
     * @throws IOException if the store already exists
     * @throws IllegalArgumentException
     *
     */
    public ITree create(String storeName, String storeType, boolean readOnly, boolean createNew, String options) throws IllegalArgumentException, IOException;
} // class or interface

