import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursionSolverTest {

    private final RecursionSolver solver = new RecursionSolver();

    @Test
    void factorial_basic() {
        assertEquals(1, solver.factorial(0));
        assertEquals(1, solver.factorial(1));
        assertEquals(120, solver.factorial(5));
    }

    @Test
    void fibonacci_basic() {
        assertEquals(0, solver.findAFibonacciMember(0));
        assertEquals(1, solver.findAFibonacciMember(1));
        assertEquals(1, solver.findAFibonacciMember(2));
        assertEquals(55, solver.findAFibonacciMember(10));
    }

    @Test
    void sum_of_digits() {
        assertEquals(0, solver.sumOfNumbersDigits(0));
        assertEquals(6, solver.sumOfNumbersDigits(123));
        assertEquals(9, solver.sumOfNumbersDigits(900000));
    }

    @Test
    void array_sum() {
        assertEquals(0.0f, solver.arraySum(new float[]{}));
        assertEquals(10.0f, solver.arraySum(new float[]{1, 2, 3, 4}), 0.0001f);
    }

    @Test
    void array_max() {
        assertEquals(0, solver.findArrayMax(new int[]{}));
        assertEquals(9, solver.findArrayMax(new int[]{1, 3, 9, 2}));
    }

    @Test
    void reverse_string() {
        assertEquals("", solver.reverseString(""));
        assertEquals("a", solver.reverseString("a"));
        assertEquals("cba", solver.reverseString("abc"));
    }

    @Test
    void array_count() {
        assertEquals(0, solver.arrayCount(new int[]{}, 1));
        assertEquals(3, solver.arrayCount(new int[]{1, 2, 1, 3, 1}, 1));
        assertEquals(0, solver.arrayCount(new int[]{1, 2, 3}, 4));
    }

    @Test
    void gcd_basic() {
        assertEquals(5, solver.findGCD(0, 5));
        assertEquals(7, solver.findGCD(7, 0));
        assertEquals(6, solver.findGCD(54, 24));
    }

    @Test
    void palindrome_basic() {
        assertTrue(solver.isPalindrome(""));
        assertTrue(solver.isPalindrome("a"));
        assertTrue(solver.isPalindrome("abba"));
        assertFalse(solver.isPalindrome("abca"));
    }

    @Test
    void power_basic() {
        assertEquals(1, solver.power(7, 0));
        assertEquals(3, solver.power(3, 1));
        assertEquals(27, solver.power(3, 3));
    }
}


