public class RBNode {

    private int value;
    private Color nodeColor;
    public enum Color {
        RED,
        BLACK
    }
    private RBNode leftChild;
    private RBNode rightChild;

    public RBNode(int value) {
        this.value = value;
    }

    public boolean addNode(RBNode node) {
        if (node.value > value) {
            rightChild = node;
        } else {
            leftChild = node;
        }
        return true;
    }
}
