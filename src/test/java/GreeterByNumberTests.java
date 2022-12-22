import com.shilov.exceptions.TaskException;
import com.shilov.task1.GreeterByNumber;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GreeterByNumberTests {

    private GreeterByNumber greeter;

    @BeforeMethod
    public void setUp() {
        greeter = new GreeterByNumber();
    }

    @Test()
    public void shouldGreetWhenInputMoreThanKeyValueInteger() {
        Assert.assertEquals(greeter.sayHelloIfNumberSuits(8), "Привет");
    }

    @Test()
    public void shouldGreetWhenInputMoreThanKeyValueFloatingPoint() {
        Assert.assertEquals(greeter.sayHelloIfNumberSuits(7.1), "Привет");
    }

    @Test()
    public void shouldNotGreetWhenInputLessThanKeyValueFloatingPoint() {
        Assert.assertNotEquals(greeter.sayHelloIfNumberSuits(-0.5), "Привет");
    }

    @Test()
    public void shouldNotGreetWhenInputLessThanKeyValueInteger() {
        Assert.assertNotEquals(greeter.sayHelloIfNumberSuits(6), "Привет");
    }

    @Test()
    public void shouldNotGreetWhenInputEqualsKeyValue() {
        Assert.assertNotEquals(greeter.sayHelloIfNumberSuits(7), "Привет");
    }
}
