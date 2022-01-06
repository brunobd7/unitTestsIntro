import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void itShouldAddUpTwoNumbers(){

        Calculator calc = new Calculator();
        Integer testSum = calc.sum(3,7);
        Assertions.assertEquals(10,testSum);
    }
}
