package com.rungine.rengine;

/**
 * Provides access to all the services that expose the Redirect Engine operations.
 *
 * @author Neil Ren
 */
public interface RedirectEngine extends EngineServices {

    /** the version of the REngine library */
    public static String VERSION = "0.0.0.1";

    /** The name as specified in 'redirect-engine-name' in
     * the rengine.cfg.xml configuration file.
     * The default name for a process engine is 'default */
    String getName();

    void close();
}
