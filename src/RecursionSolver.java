public class RecursionSolver {

    private int factorialHelper(int number, int result) {
        if (number == 0) {
            return 1;
        }
        if (number == 1) {
            return result;
        }
        result *= number;
        return factorialHelper(number - 1, result);
    }

    public int factorial(int number) {
        return factorialHelper(number, 1);
    }
}
