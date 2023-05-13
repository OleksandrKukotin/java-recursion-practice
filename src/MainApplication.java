public class MainApplication {

    public static void main(String[] args) {
        RecursionSolver recursionSolver = new RecursionSolver();
        System.out.println(recursionSolver.factorial(5));
        int fibonacciIndex = 30;
        int fibonacciMember = recursionSolver.findAFibonacciMember(fibonacciIndex);
        System.out.println(String.format("Fibonacci member #%d: %d", fibonacciIndex, fibonacciMember));
    }
}
