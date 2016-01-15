package org.cip4.lib.xjdf.xml.internal;

import java.util.Collections;
import java.util.List;

/**
 * Result of document validation.
 */
class ValidationResult {

    /**
     * List of validation messages.
     */
    private final List<String> messages;

    /**
     * Constructor.
     *
     * @param messages List of validation messages.
     */
    ValidationResult(final List<String> messages) {
        this.messages = messages;
    }

    /**
     * Constructor.
     */
    ValidationResult() {
        messages = Collections.emptyList();
    }

    /**
     * Getter for messages as single text.
     *
     * @return the messages
     */
    final String getMessagesText() {
        if (isValid()) {
            return null;
        } else {
            StringBuilder builder = new StringBuilder();
            builder.append("XJDF Document is invalid:");

            for (String msg : messages) {
                builder.append("\n");
                builder.append(msg);
            }

            return builder.toString();
        }

    }


    /**
     * Check if the document was valid.
     *
     * @return true if document is valid. False otherwise.
     */
    boolean isValid() {
        return messages.isEmpty();
    }
}
