import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
public class TestCalculator {
    @Test
    public void GivenTwoIntegersAddReturnsAddition() {
        assertEquals(3,Calculator.add(2,2));
    }
}
