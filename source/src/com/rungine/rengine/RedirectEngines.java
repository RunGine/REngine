package com.rungine.rengine;

/**
 * Helper for initializing and closing redirect engines in server environments.
 *
 * @author Neil Ren
 */
public abstract class RedirectEngines {

    public static final String NAME_DEFAULT = "default";

    protected static boolean isInitialized = false;

    public synchronized static void init(){
        //TODO...
    }
}
