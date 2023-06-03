package redBlackTreeOperations;

/**
 * Enumeration representing the rotation conditions in a red-black tree.
 * The rotation conditions determine the type of rotation required to balance the tree.
 */
public enum RotateCondition {

    LL, // Left-Left rotation condition
    LR, // Left-Right rotation condition
    RR, // Right-Right rotation condition
    RL, // Right-Left rotation condition
    NN // No need to rotate
}