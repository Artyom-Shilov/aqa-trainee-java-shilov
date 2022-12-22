import com.shilov.exceptions.TaskException;
import com.shilov.task2.GreeterByName;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GreeterByNameTests {

    private GreeterByName greeter;

    @BeforeMethod
    public void setUp() {
        greeter = new GreeterByName();
    }

    @Test
    public void shouldGreetWhenInputEqualsKeyName() throws TaskException {
        Assert.assertEquals(greeter.sayHelloIfNameSuits("Вячеслав"), "Привет, Вячеслав");
    }

    @Test
    public void shouldGreetWhenInputIsKeyNameWithSpaces() throws TaskException {
        Assert.assertEquals(greeter.sayHelloIfNameSuits(" Вячеслав "), "Привет, Вячеслав");
    }

    @Test
    public void shouldReturnUnknownNameMessageWhenInputIsNotEqualsKeyName() {
        Assert.assertEquals(greeter.sayHelloIfNameSuits("Вася"), "Нет такого имени");
    }
}
