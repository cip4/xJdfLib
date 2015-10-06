package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.schema.IntentType;
import org.cip4.lib.xjdf.schema.Product;

/**
 * Utility for performing reoccuring operations on products.
 */
public final class ProductUtil {

    /**
     * Private constructor for utility class.
     */
    private ProductUtil() {
    }

    /**
     * Retrieve a specific intent from a product.
     *
     * @param product Product te read intent from.
     * @param intentType Type of the intent.
     * @param <T> Type of the intent.
     * @return Requested Intent or null if no matching intent was found.
     */
    @SuppressWarnings("unchecked")
    public static <T extends IntentType> T getIntent(final Product product, final Class<T> intentType) {
        for (Intent intent : product.getIntent()) {
            if (intent.getIntentType().getValue().getClass().isAssignableFrom(intentType)) {
                return (T) intent.getIntentType().getValue();
            }
        }
        return null;
    }

    public static String normalize(final String string) {
        return string.replaceAll("[^a-zA-Z0-9\\.(a-z)+]", "_");
    }
}
