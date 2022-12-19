package org.cip4.lib.xjdf.builder;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import org.cip4.lib.xjdf.xml.internal.JAXBContextFactory;
import org.w3c.dom.Node;

/**
 * Abstract Builder implementation where all builders are derived from.
 */
public abstract class AbstractNodeBuilder<T> {

    private final T node;

    /**
     * Default constructor.
     */
    protected AbstractNodeBuilder(T node) {
        // initialize node
        this.node = node;
    }

    /**
     * Custom constructor. Accepting a Node object for initializing. !! THIS NODE MUST BE NAMESPACE AWARE !!
     *
     * @param node Namespace aware node object.
     *
     * @throws JAXBException Is thrown in case an exception.
     */
    protected AbstractNodeBuilder(Node node, Class<T> typeResourceClass) throws JAXBException {

        Unmarshaller u = JAXBContextFactory.getInstance().createUnmarshaller();
        JAXBElement<T> element = u.unmarshal(node, typeResourceClass);
        this.node = element.getValue();
    }

    /**
     * Getter for node attribute.
     *
     * @return the node
     */
    protected T getNode() {
        return node;
    }

    /**
     * Build and return the Node.
     *
     * @return Node as DOM tree.
     */
    public final T build() {
        return node;
    }
}
