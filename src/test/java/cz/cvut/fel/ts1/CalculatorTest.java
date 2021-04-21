package cz.cvut.fel.ts1;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.Assertions;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setUp(){
        System.out.println("Running setUp");
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test secti 16 + 72 a dostan 88")
    @Order(2)
    public void addition_16plus72_88() {
        //ARRANGE
        int a = 16;
        int b = 72;
        int expected = 88;

        //ACT
        int result = calculator.add(a, b);

        //ASSERT
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("Test secti 19 - 14 a dostan 5")
    @Order(3)
    public void subtraction_19minus14_5() {
        //ARRANGE
        int a = 19;
        int b = 14;
        int expected = 5;

        //ACT
        int result = calculator.subtract(a, b);

        //ASSERT
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test secti 7 * 9 a dostan 63")
    @Order(4)
    public void multiply_7minus9_63() {
        //ARRANGE
        int a = 7;
        int b = 9;
        int expected = 63;

        //ACT
        int result = calculator.multiply(a, b);

        //ASSERT
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test secti 18/9 a dostan 2")
    @Order(5)
    public void division_18divide9_2() {
        //ARRANGE
        int a = 18;
        int b = 9;
        int expected = 2;

        //ACT
        int result = calculator.divide(a, b);

        //ASSERT
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Do metody pro dělení vložena do jmenovatele nula, bude výjimka")
    @Order(6)
    public void division_18divide0_exception() {
        //ARRANGE
        int a = 18;
        int b = 0;

        //ACT

        //ASSERT
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(a, b));
    }

    @Test
    @Order(1)
    public void throwAssertion_default_throwsAssertion(){
        System.out.println("Running throwAssertion_default_throwsAssertion");
        Assertions.assertThrows(Exception.class, () -> {
            calculator.throwAssertion();
        });
    }

}
