package org.cip4.lib.xjdf.schema;

import org.junit.ComparisonFailure;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Assert {

    public static void assertNodeCollectionEquals(final Collection<Node> expected, final Collection<Node> actual) {
        List<Node> expectedList = sortNodesByName(expected);
        List<Node> actualList = sortNodesByName(actual);
        if (!isSubset(expectedList, actualList) || !isSubset(actualList, expectedList)) {
            throw new ComparisonFailure(
                null,
                nodeCollectionToString(expectedList),
                nodeCollectionToString(actualList)
            );
        }
    }

    private static List<Node> sortNodesByName(final Collection<Node> nodes) {
        ArrayList<Node> nodeList = new ArrayList<>(nodes);
        Collections.sort(nodeList, new Comparator<Node>() {
            @Override
            public int compare(final Node o1, final Node o2) {
                return nodeToString(o1).compareTo(nodeToString(o2));
            }
        });
        return nodeList;
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
                "[%s:%s%s]",
                node.getLocalName(),
                node.getAttributes().getNamedItem("name").getNodeValue(),
                "required".equals(node.getAttributes().getNamedItem("use").getNodeValue()) ? "" : "?"
            );
        } else if ("element".equals(node.getLocalName())) {
            return String.format(
                "[%s:%s{%s,%s}]",
                node.getLocalName(),
                node.getAttributes().getNamedItem("ref").getNodeValue(),
                node.getAttributes().getNamedItem("minOccurs").getNodeValue(),
                node.getAttributes().getNamedItem("maxOccurs").getNodeValue()
            );
        } else {
            return node.toString();
        }
    }

}
