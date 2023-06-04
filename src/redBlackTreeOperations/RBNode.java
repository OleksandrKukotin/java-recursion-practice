package redBlackTreeOperations;

public class RBNode {

    private int value;
    private boolean isLeaf;
    private Color nodeColor;
    private RBNode leftChild;
    private RBNode rightChild;
    private RBNode parent;

    public RBNode(int value) {
        this.value = value;
        this.isLeaf = false;
        this.leftChild = new RBNode();
        this.rightChild = new RBNode();
        this.parent = null;
        this.nodeColor = Color.RED;
    }

    // Leaf node constructor
    private RBNode() {
        this.isLeaf = true;
    }

    public boolean insertNode(int value) {
        if (value >= this.value) {
            if (this.rightChild.isLeaf) {
                this.rightChild = new RBNode(value);
                this.rightChild.parent = this;
                return true;
            }
            else {
                this.rightChild.insertNode(value);
            }
        }
        else {
            if (this.leftChild.isLeaf) {
                this.leftChild = new RBNode(value);
                this.leftChild.parent = this;
                return true;
            }
            else {
                this.leftChild.insertNode(value);
            }
        }
        return true;
    }

    public boolean deleteNode(int value) {
        if (value >= this.value) {
            if (this.rightChild.value == value) {
                this.rightChild = new RBNode();
                return true;
            }
            else {
                this.rightChild.deleteNode(value);
            }
        }
        else {
            if (this.leftChild.value == value) {
                this.leftChild = new RBNode();
                return true;
            }
            else {
                this.leftChild.deleteNode(value);
            }
        }
        return false;
    }

    RotateCondition determineRotateCondition() {
        if (this.nodeColor == Color.RED) {
            if (this.leftChild.nodeColor == Color.RED) {
                if (this.leftChild.leftChild.nodeColor == Color.RED) {
                    return RotateCondition.LL;
                }
                if (this.leftChild.rightChild.nodeColor == Color.RED) {
                    return RotateCondition.LR;
                }
            }
            if (this.rightChild.nodeColor == Color.RED) {
                if (this.rightChild.rightChild.nodeColor == Color.RED) {
                    return RotateCondition.RR;
                }
                if (this.rightChild.leftChild.nodeColor == Color.RED) {
                    return RotateCondition.RL;
                }
            }
        }
        return RotateCondition.NN;
    }
    private boolean rotate() {
        RotateCondition condition = this.determineRotateCondition();
        if (condition == RotateCondition.LL || condition == RotateCondition.RL) {
            return this.rightRotate();
        } else if (condition == RotateCondition.LR || condition == RotateCondition.RR) {
            return this.leftRotate();
        }
        return false;
    }

    private boolean leftRotate() {
        if (this.rightChild.isLeaf) {
            return false; // Cannot perform left rotation if the right child is a leaf node
        }

        RBNode newRoot = this.rightChild;
        this.rightChild = newRoot.leftChild;
        newRoot.leftChild = this;

        if (!this.isRoot()) {
            if (this.isLeftChild()) {
                this.parent.leftChild = newRoot;
            } else {
                this.parent.rightChild = newRoot;
            }
        } else {
            // If the current node is the root, update the root reference
            this.setRoot(newRoot);
        }

        return true;
    }

    private boolean isLeftChild() {
        return this.parent.leftChild == this;
    }

    private boolean isRoot() {
        return this.parent == null;
    }

    private boolean rightRotate() {
        // TODO: implement
        return true;
    }

    private boolean fixColor() {
        if (this.leftChild.nodeColor == Color.RED || this.rightChild.nodeColor == Color.RED) {
            this.nodeColor = Color.BLACK;
            return true;
        }
        return false;
    }

    private boolean isBalanced() {
        if (this.isLeaf) {
            return true;
        }

        int leftHeight = this.leftChild.getHeight();
        int rightHeight = this.rightChild.getHeight();

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        return this.leftChild.isBalanced() && this.rightChild.isBalanced();
    }

    private int getHeight() {
        if (this.isLeaf) {
            return 0;
        }
        int leftHeight = this.leftChild.getHeight();
        int rightHeight = this.rightChild.getHeight();

        return 1 + Math.max(leftHeight, rightHeight);
    }

    private void preOrderTraversal(RBNode node) {
        if (node.isLeaf) {
            return;
        }

        System.out.println(node.value);

        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
    }

    private void postOrderTraversal(RBNode node) {
        if (node.isLeaf) {
            return;
        }

        postOrderTraversal(node.leftChild);
        postOrderTraversal(node.rightChild);

        System.out.println(node.value);
    }

    private void inOrderTraversal(RBNode node) {
        if (node.isLeaf) {
            return;
        }

        inOrderTraversal(node.leftChild);

        System.out.println(node.value);

        inOrderTraversal(node.rightChild);
    }

    public void treeTraversal(TraversalType type) {
        switch (type) {
            case PRE_ORDER -> preOrderTraversal(this);
            case POST_ORDER -> postOrderTraversal(this);
            case IN_ORDER -> inOrderTraversal(this);
            default -> System.out.println("Invalid traversal type.");
        }
    }

    public void printTree() {
        printTreeHelper(this, "");
    }

    private void printTreeHelper(RBNode node, String indent) {
        if (node.isLeaf) {
            System.out.println(indent + "- LEAF");
            return;
        }

        System.out.println(indent + "- " + node.value + " (" + node.nodeColor + ")");

        if (node.leftChild != null) {
            System.out.print(indent + "  L: ");
            printTreeHelper(node.leftChild, indent + "     ");
        }

        if (node.rightChild != null) {
            System.out.print(indent + "  R: ");
            printTreeHelper(node.rightChild, indent + "     ");
        }
    }
}
