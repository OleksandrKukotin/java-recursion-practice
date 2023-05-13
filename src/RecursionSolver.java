public class RecursionSolver {

    private int factorialHelper(int number, int result) {
        if (number == 1) {
            return result;
        }
        result *= number;
        return factorialHelper(number - 1, result);
    }

    public int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return factorialHelper(number, 1);
    }

    private int calculateFibonacci(int memberIndex, int currentIndex, int prePreviousMember, int previousMember) {
        if (currentIndex == memberIndex) {
            return previousMember;
        }
        return calculateFibonacci(memberIndex, currentIndex + 1, previousMember, prePreviousMember + previousMember);
    }

    public int findAFibonacciMember(int memberIndex) {
        return switch (memberIndex) {
            case 0 -> 0;
            case 1 -> 1;
            default -> calculateFibonacci(memberIndex, 1, 0, 1);
        };
    }
}
