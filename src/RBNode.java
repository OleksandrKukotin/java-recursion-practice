public class RBNode {

    private int value;
    private boolean isLeaf;
    private Color nodeColor;
    private RBNode leftChild;
    private RBNode rightChild;

    public RBNode(int value) {
        this.value = value;
        this.isLeaf = false;
        this.leftChild = new RBNode();
        this.rightChild = new RBNode();
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
                return true;
            }
            else {
                this.rightChild.insertNode(value);
            }
        }
        else {
            if (this.leftChild.isLeaf) {
                this.leftChild = new RBNode(value);
                return true;
            }
            else {
                this.leftChild.insertNode(value);
            }
        }
        return true;
    }

    public boolean deleteNode(int value) {
        // TODO: implement
        return true;
    }


    private boolean rotate() {
        // TODO: implement
        return true;
    }

    private boolean isBalanced() {
        // TODO: implement
        return true;
    }

    public void treeTraversal() {
        // TODO: implement
    }

    @Override
    public String toString() {
        return "RBNode {\n" +
            "value=" + value +
            ", \nisLeaf=" + isLeaf +
            ", \nnodeColor=" + nodeColor +
            ", \nleftChild=" + leftChild +
            ", \nrightChild=" + rightChild +
            "}";
    }
}
