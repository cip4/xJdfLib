package org.cip4.lib.xjdf.util;

import org.cip4.lib.xjdf.schema.Intent;
import org.cip4.lib.xjdf.schema.ProductIntent;
import org.cip4.lib.xjdf.schema.Product;

/**
 * Utility for performing reoccuring operations on products.
 */
public final class Products {

    /**
     * Private constructor for utility class.
     */
    private Products() {
    }

    /**
     * Retrieve a specific intent from a product.
     *
     * @param product Product te read intent from.
     * @param productIntent Type of the intent.
     * @param <T> Type of the intent.
     *
     * @return Requested Intent or null if no matching intent was found.
     */
    @SuppressWarnings("unchecked")
    public static <T extends ProductIntent> T getIntent(final Product product, final Class<T> productIntent) {
        for (Intent intent : product.getIntent()) {
            if (intent.getProductIntent().getValue().getClass().isAssignableFrom(productIntent)) {
                return (T) intent.getProductIntent().getValue();
            }
        }
        return null;
    }
}
