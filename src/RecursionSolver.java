import java.util.Arrays;

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

    private int sumDigit (int number, int sum) {
        if (number < 10) {
            sum += number;
            return sum;
        }
        return sumDigit(number / 10, sum + number % 10);
    }

    public int sumOfNumbersDigits(int number) {
        return sumDigit(number, 0);
    }

    private float sumArrayElement(float[] array, float result) {
        int arrayLength = array.length;
        if (arrayLength == 0) {
            return result;
        }
        float[] newArray = Arrays.copyOf(array, arrayLength - 1);
        return sumArrayElement(newArray, result + newArray[newArray.length]);
    }

    public float arraySum(float[] array) {
        if (array.length == 0) {
            return 0;
        }
        return sumArrayElement(array, 0);
    }
}
