import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redBlackTreeOperations.Color;
import redBlackTreeOperations.RBNode;
import redBlackTreeOperations.TraversalType;

import static org.junit.jupiter.api.Assertions.*;

public class RBNodeTest {

    private RBNode node;

    @BeforeEach
    public void setUp() {
        node = new RBNode(5);
    }

    @Test
    public void testInsertNode() {
        assertTrue(node.insertNode(3));
        assertTrue(node.insertNode(7));
        assertFalse(node.insertNode(7)); // Duplicate value
        assertTrue(node.insertNode(1));
        assertTrue(node.insertNode(9));

        // Verify the tree structure after insertion
        assertEquals(5, node.getValue());
        assertEquals(3, node.getLeftChild().getValue());
        assertEquals(7, node.getRightChild().getValue());
        assertEquals(1, node.getLeftChild().getLeftChild().getValue());
        assertEquals(9, node.getRightChild().getRightChild().getValue());
    }

    @Test
    public void testDeleteNode() {
        assertTrue(node.insertNode(3));
        assertTrue(node.insertNode(7));
        assertTrue(node.insertNode(1));
        assertTrue(node.insertNode(9));

        assertTrue(node.deleteNode(7));
        assertFalse(node.deleteNode(7)); // Node already deleted
        assertTrue(node.deleteNode(3));
        assertTrue(node.deleteNode(1));
        assertTrue(node.deleteNode(9));

        // Verify the tree structure after deletion
        assertEquals(5, node.getValue());
        assertTrue(node.getLeftChild().isLeaf());
        assertTrue(node.getRightChild().isLeaf());
    }

    @Test
    public void testRotate() {
        assertTrue(node.insertNode(3));
        assertTrue(node.insertNode(7));
        assertTrue(node.insertNode(1));

        // Perform left rotation
        assertTrue(node.rotate());

        // Verify the tree structure after rotation
        assertEquals(3, node.getValue());
        assertEquals(1, node.getLeftChild().getValue());
        assertEquals(5, node.getRightChild().getValue());
        assertEquals(7, node.getRightChild().getRightChild().getValue());
    }

    @Test
    public void testFixColor() {
        assertTrue(node.insertNode(3));
        assertTrue(node.insertNode(7));
        assertTrue(node.insertNode(1));

        assertTrue(node.fixColor());

        assertEquals(Color.BLACK, node.getNodeColor());
    }

    @Test
    public void testIsBalanced() {
        assertTrue(node.insertNode(3));
        assertTrue(node.insertNode(7));
        assertTrue(node.insertNode(1));

        assertTrue(node.isBalanced());

        assertTrue(node.insertNode(9));

        assertFalse(node.isBalanced());
    }

    @Test
    public void testTreeTraversal() {
        assertTrue(node.insertNode(3));
        assertTrue(node.insertNode(7));
        assertTrue(node.insertNode(1));
        assertTrue(node.insertNode(9));

        // Pre-order traversal: 5 -> 3 -> 1 -> 7 -> 9
        node.treeTraversal(TraversalType.PRE_ORDER);

        // Post-order traversal: 1 -> 3 -> 9 -> 7 -> 5
        node.treeTraversal(TraversalType.POST_ORDER);

        // In-order traversal: 1 -> 3 -> 5 -> 7 -> 9
        node.treeTraversal(TraversalType.IN_ORDER);
    }

    @Test
    public void testPrintTree() {
        assertTrue(node.insertNode(3));
        assertTrue(node.insertNode(7));
        assertTrue(node.insertNode(1));
        assertTrue(node.insertNode(9));

        node.printTree();
    }
}
