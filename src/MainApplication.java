public class MainApplication {

    public static void main(String[] args) {
        RecursionSolver recursionSolver = new RecursionSolver();
        System.out.println(recursionSolver.factorial(5));
        int fibonacciIndex = 30;
        int fibonacciMember = recursionSolver.findAFibonacciMember(fibonacciIndex);
        System.out.println(String.format("Fibonacci member #%d: %d", fibonacciIndex, fibonacciMember));
        System.out.println(String.format("Sum of digits of the number 904060: %d", recursionSolver.sumOfNumbersDigits(904060)));
        float[] testArray = {4, 4, 2, 52, 4};
        System.out.println(String.format("Sum of elements of the test array: %f", recursionSolver.arraySum(testArray)));
    }
}
