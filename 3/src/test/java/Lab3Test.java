import io.restassured.RestAssured;
import org.joda.time.Instant;
import org.junit.After;
import org.junit.Before;
import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import pl.edu.pjwstk.Lab3;
import static org.junit.Assert.*;



public class Lab3Test {

    private Lab3 lab3;

    @Before
    public void setUp(){
        lab3 = new Lab3();
    }

    @After
    public void tearDown(){
        lab3 = null;
    }



    @Test
    public void addition_AddsTwoPositiveNumbers_ResultShouldByPositive() {
        assertEquals(7, lab3.addition(1, 6),0.001);
    }
    @Test
    public void addition_AddsTwoNegativeNumbers_ResultShouldByNegative() {
        assertEquals(-4, lab3.addition(-3, -1),0.001);
    }
    @Test
    public void addition_AddsNegativeAndPositiveNumbers_Calculated() {
        assertEquals(2, lab3.addition(3, -1),0.001);
    }
    @Test
    public void addition_Adds0AndPositiveNumbers_Calculated() {
        assertEquals(2, lab3.addition(2, 0),0.001);
    }
    @Test
    public void addition_AddsTwoNumbersTypeDouble_Result_ShouldByTypeDouble() {
        assertEquals(3.21, lab3.addition(2.04, 1.17),0.001);
    }


    @Test
    public void subtraction_SubtractTwoPositiveNumbers_Calculated() {
        assertEquals(-2, lab3.subtraction(2.05, 4.05),0.001);
    }
    @Test
    public void subtraction_SubtractTwoNegativeNumbers_Calculated() {
        assertEquals(2, lab3.subtraction(-2, -4),0.001);
    }
    @Test
    public void subtraction_SubtractZeroAnd4_ShouldByNegativeNumbers() {
        assertEquals(-4, lab3.subtraction(0, 4),0.001);
    }

    @Test
    public void multiplication_MultiplyZeroAnd4_ResultShouldByZero() {
        assertEquals(0, lab3.multiplication(4, 0), 0);
    }
    @Test
    public void multiplication_MultiplyTwoPositiveNumbers_ResultShouldByPositive() {
        assertEquals(50, lab3.multiplication(5, 10), 0);
    }
    @Test
    public void multiplication_MultiplyTwoNegativeNumbers_ResultShouldByPositive() {
        assertEquals(50, lab3.multiplication(-5, -10), 0);
    }
    @Test
    public void multiplication_MultiplyNegativeAndPositiveNumbers_ResultShouldByNegative() {
        assertEquals(-50, lab3.multiplication(-5, 10), 0);
    }
    @Test
    public void division_DivideTwoPositiveNumbers_ResultShouldByPositive() {
        assertEquals(5, lab3.division(50, 10), 0);
    }
    @Test
    public void division_DivideTwoNegativeNumbers_ResultShouldByPositive() {
        assertEquals(0.5, lab3.division(-5, -10), 0);
    }
    @Test
    public void division_DivideNegativeAndPositiveNumbers_ResultShouldByNegative() {
        assertEquals(-5, lab3.division(-50, 10), 0.001);
    }
    @Test
    public void division_DivideZeroAndAnotherNumber_ResultShouldByZero() {
        assertEquals(0, lab3.division(0, 10), 0.001);
    }
        @Test
    public void additionAndDivisionTest(){
            double result = lab3.division(9,lab3.addition(1,2));
        assertEquals(3,result,0);

    }
    @Test
    public void multiplicationAndDivisionTest(){
        double result = lab3.multiplication(9,lab3.division(9,3));
        assertEquals(27,result,0);

    }
    @Test
    public void subtractionAndAdditionTest(){
        double result = lab3.addition(5,lab3.subtraction(4,2));
        assertEquals(7,result,0);

    }

    @Test
    @DisplayName("Test modulo")
    public void modTest(){
        int result = lab3.mod(10,4);
        assertEquals(2,result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void modIllegalExceptionTest(){
        assertEquals(0,lab3.mod(0,0));
    }

    @Test
    public void greaterThanNullTest(){
        assertNull(lab3.greaterThan(0,0));
    }

    @Test
    public void squareTest(){
        assertEquals(144,lab3.square(12),0);
    }

    @Test
    public void lessThanTest(){
        assertFalse(lab3.lessThan(15,12));
    }


    @Test
    public void jodaYearNotNullTest(){
        assertNotNull(Instant.now().getChronology().year());
    }
    @Test
    public void jodaYearTest(){
       int result = Instant.now().toDateTime().getYear();
        assertEquals(2022, result);
    }
    @Test
    public void jodaMonthTest(){
        int result = Instant.now().toDateTime().getMonthOfYear();
        assertEquals(4, result);
    }
    @Test
    public void websiteStatusCodeTest(){
        int result = RestAssured.get("https://wp.pl").statusCode();
        assertEquals(200, result);
    }

}

