import org.Ex_Demonstracao.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testAddPositiveNumbers(){
        assertEquals(5,calculator.add(2,3));
    }

    @Test
    public void testAddNegativeNumbers(){
        assertEquals(-30,calculator.add(-20,-10));
    }

}
