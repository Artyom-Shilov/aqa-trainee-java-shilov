import com.shilov.task3.NumberProcessor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NumberProcessorTests {

    private NumberProcessor numberProcessor;

    @BeforeMethod
    public void setUp() {
        numberProcessor = new NumberProcessor();
    }

    @Test
    public void shouldFindMultiplesOfBaseNumber() {
        Assert.assertEquals(numberProcessor.findMultiplesOfNumber(List.of(3, 4, -6, 12, 3, 0)), List.of(3, -6, 12, 3));
    }

    @Test
    public void shouldFindMultiplesWhenInputIsEmpty() {
        Assert.assertEquals(
                numberProcessor.findMultiplesOfNumber(List.of()), new ArrayList<>()
        );
    }
}
