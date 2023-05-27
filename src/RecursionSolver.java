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

    private int sumDigit(int number, int sum) {
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
        return sumArrayElement(newArray, result + array[newArray.length]);
    }

    public float arraySum(float[] array) {
        if (array.length == 0) {
            return 0;
        }
        return sumArrayElement(array, 0);
    }

    private int findMax(int[] array, int max) {
        int arrayLength = array.length;
        if (arrayLength == 0) {
            return max;
        }
        int[] newArray = Arrays.copyOf(array, arrayLength - 1);
        if (array[newArray.length] > max) {
            max = array[newArray.length];
        }
        return findMax(newArray, max);
    }

    public int findArrayMax(int[] array) {
        return findMax(array, 0);
    }

    private String reverseLetter(char[] targetChars, String result) {
        int targetLength = targetChars.length;
        if (targetLength == 0) {
            return result;
        }
        char[] newTargetChars = Arrays.copyOf(targetChars, targetLength - 1);
        return reverseLetter(newTargetChars, result + targetChars[targetLength - 1]);
    }

    public String reverseString(String target) {
        if (target.isEmpty()) {
            return "";
        }
        if (target.length() == 1) {
            return target;
        }
        return reverseLetter(target.toCharArray(), "");
    }

    private int count(int[] array, int currentIndex, int wanted, int counter) {
        if (currentIndex + 1 > array.length) {
            return counter;
        }
        if (wanted == array[currentIndex]) {
            counter += 1;
        }
        return count(array, currentIndex + 1, wanted, counter);
    }

    public int arrayCount(int[] array, int wanted) {
        if (array.length == 0) {
            return 0;
        }
        return count(array, 0, wanted, 0);
    }

    public int findGCD(int firstNumber, int secondNumber) {
        if (firstNumber == 0) {
            return secondNumber;
        }
        if (secondNumber == 0) {
            return firstNumber;
        }
        return findGCD(secondNumber, firstNumber % secondNumber);
    }

    public boolean isPalindrome(String text) {
        int length = text.length();
        if (length == 0 || length == 1) {
            return true;
        }
        if (text.substring(0, 1).equals(text.substring(length - 1))) {
            return isPalindrome(text.substring(1, length - 1));
        } else {
            return false;
        }
    }

    public int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        return base * power(base, exponent - 1);
    }
}
