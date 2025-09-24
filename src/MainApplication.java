import redBlackTreeOperations.RBNode;
import redBlackTreeOperations.TraversalType;

public class MainApplication {

    public static void main(String[] args) {
        RBNode root = new RBNode(5);

        root.insertNode(3);
        root.insertNode(7);
        root.insertNode(2);
        root.insertNode(4);
        root.insertNode(1);
        root.insertNode(10);
        root.insertNode(5);
        root.insertNode(6);
        root.insertNode(8);
        root.printTree();

        System.out.println("In-order traversal:");
        root.treeTraversal(TraversalType.IN_ORDER);

        System.out.println("Pre-order traversal:");
        root.treeTraversal(TraversalType.PRE_ORDER);

        System.out.println("Post-order traversal:");
        root.treeTraversal(TraversalType.POST_ORDER);
    }
}
