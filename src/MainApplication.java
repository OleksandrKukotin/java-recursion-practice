import redBlackTreeOperations.RBNode;
import redBlackTreeOperations.TraversalType;

public class MainApplication {

    public static void main(String[] args) {
        RecursionSolver recursionSolver = new RecursionSolver();
        System.out.println(recursionSolver.factorial(5));
        int fibonacciIndex = 30;
        int fibonacciMember = recursionSolver.findAFibonacciMember(fibonacciIndex);
        System.out.println(String.format("Fibonacci member #%d: %d", fibonacciIndex, fibonacciMember));
        System.out.println(String.format("Sum of digits of the number 904060: %d", recursionSolver.sumOfNumbersDigits(904060)));
        float[] testArray = {4, 4, 2, 52, 4};
        int[] intTestArray = {4, 4, 2, 52, 4, 100, 8, 69, 138, 684, 0, 1, 1, 1, 5};
        System.out.println(String.format("Sum of elements of the test array: %f", recursionSolver.arraySum(testArray)));
        System.out.println(String.format("Max element of the test array: %d", recursionSolver.findArrayMax(intTestArray)));
        System.out.println(recursionSolver.reverseString("dlrow olleh : gnirtS desreveR"));
        System.out.println(String.format("Number of occurrences of %d in the test array: %d", 4, recursionSolver.arrayCount(intTestArray, 4)));
        System.out.println(String.format("The Greatest Common Divisor for 200 and 3564 is %d", recursionSolver.findGCD(200, 3564)));
        System.out.println(recursionSolver.isPalindrome("ab1121ba"));
        System.out.println(recursionSolver.power(3,3));
        RBNode root = new RBNode(5);

        root.insertNode(3);
        root.insertNode(7);
        root.insertNode(2);
        root.insertNode(4);
        root.insertNode(6);
        root.insertNode(8);

        System.out.println("Initial tree:");
        System.out.println(root);

        root.deleteNode(4);
        root.deleteNode(8);

        System.out.println("Tree after node deletion:");
        System.out.println(root);

        System.out.println("In-order traversal:");
        root.treeTraversal(TraversalType.IN_ORDER);

        System.out.println("Pre-order traversal:");
        root.treeTraversal(TraversalType.PRE_ORDER);

        System.out.println("Post-order traversal:");
        root.treeTraversal(TraversalType.POST_ORDER);
    }
}
