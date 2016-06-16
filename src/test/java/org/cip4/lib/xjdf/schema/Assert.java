package org.cip4.lib.xjdf.schema;

import org.junit.ComparisonFailure;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Assert {

    public static void assertNodeCollectionEquals(final Collection<Node> expected, final Collection<Node> actual) {
        if (!isSubset(expected, actual) || !isSubset(actual, expected)) {
            throw new ComparisonFailure(
                null,
                nodeCollectionToString(expected),
                nodeCollectionToString(actual)
            );
        }
    }

    private static boolean isSubset(final Collection<Node> subset, final Collection<Node> superSet) {
        for (Node needle : subset) {
            if (!contains(needle, superSet)) {
                return false;
            }
        }
        return true;
    }

    private static boolean contains(final Node needle, final Collection<Node> collection) {
        for (Node candidate : collection) {
            if (needle.isEqualNode(candidate)) {
                return true;
            }
        }
        return false;
    }

    private static String nodeCollectionToString(Collection<Node> nodes) {
        StringBuilder strBuf = new StringBuilder("<");
        for (Node node : nodes) {
            strBuf.append(nodeToString(node)).append(", ");
        }
        return strBuf.append(">").toString();
    }

    private static String nodeToString(Node node) {
        if ("attribute".equals(node.getLocalName())) {
            return String.format(
                "[%s:%s]",
                node.getLocalName(),
                node.getAttributes().getNamedItem("name").getNodeValue()
            );
        } else if ("element".equals(node.getLocalName())) {
            return String.format(
                "[%s:%s]",
                node.getLocalName(),
                node.getAttributes().getNamedItem("ref").getNodeValue()
            );
        } else {
            return node.toString();
        }
    }

}
