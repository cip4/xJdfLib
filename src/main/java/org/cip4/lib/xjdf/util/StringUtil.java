package org.cip4.lib.xjdf.util;

/**
 * Class for holding utility methods regarding String operations.
 */
public final class StringUtil {

    /**
     * Normalizes a String by replacing any non alphanumeric character (except '.') with an underscore.
     *
     * @param string The String to normalize.
     *
     * @return Normalized String.
     */
    public static String normalize(final String string) {
        return string.replaceAll("[^a-zA-Z0-9\\.(a-z)+]", "_");
    }
}
