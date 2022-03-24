
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    public CalculatorTest() {
    }


    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void addition_AddsTwoPositiveNumbers_ResultShouldByPositive() {
        assertEquals(7, calculator.addition(1, 6),0.001);
    }
    @Test
    public void addition_AddsTwoNegativeNumbers_ResultShouldByNegative() {
        assertEquals(-4, calculator.addition(-3, -1),0.001);
    }
    @Test
    public void addition_AddsNegativeAndPositiveNumbers_Calculated() {
        assertEquals(2, calculator.addition(3, -1),0.001);
    }
    @Test
    public void addition_Adds0AndPositiveNumbers_Calculated() {
        assertEquals(2, calculator.addition(2, 0),0.001);
    }
    @Test
    public void addition_AddsTwoNumbersTypeDouble_Result_ShouldByTypeDouble() {
        assertEquals(3.21, calculator.addition(2.04, 1.17),0.001);
    }


    @Test
    public void subtraction_SubtractTwoPositiveNumbers_Calculated() {
        assertEquals(-2, calculator.subtraction(2.05, 4.05),0.001);
    }
    @Test
    public void subtraction_SubtractTwoNegativeNumbers_Calculated() {
        assertEquals(2, calculator.subtraction(-2, -4),0.001);
    }
    @Test
    public void subtraction_SubtractZeroAnd4_ShouldByNegativeNumbers() {
        assertEquals(-4, calculator.subtraction(0, 4),0.001);
    }

    @Test
    public void multiplication_MultiplyZeroAnd4_ResultShouldByZero() {
        assertEquals(0, calculator.multiplication(4, 0), 0);
    }
    @Test
    public void multiplication_MultiplyTwoPositiveNumbers_ResultShouldByPositive() {
        assertEquals(50, calculator.multiplication(5, 10), 0);
    }
    @Test
    public void multiplication_MultiplyTwoNegativeNumbers_ResultShouldByPositive() {
        assertEquals(50, calculator.multiplication(-5, -10), 0);
    }
    @Test
    public void multiplication_MultiplyNegativeAndPositiveNumbers_ResultShouldByNegative() {
        assertEquals(-50, calculator.multiplication(-5, 10), 0);
    }
    @Test
    public void division_DivideTwoPositiveNumbers_ResultShouldByPositive() {
        assertEquals(5, calculator.division(50, 10), 0);
    }
    @Test
    public void division_DivideTwoNegativeNumbers_ResultShouldByPositive() {
        assertEquals(0.5, calculator.division(-5, -10), 0);
    }
    @Test
    public void division_DivideNegativeAndPositiveNumbers_ResultShouldByNegative() {
        assertEquals(-5, calculator.division(-50, 10), 0.001);
    }
    @Test
    public void division_DivideZeroAndAnotherNumber_ResultShouldByZero() {
        assertEquals(0, calculator.division(0, 10), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideException_CannotBeDividedByZero() {
        calculator.division(2, 0);
    }

}