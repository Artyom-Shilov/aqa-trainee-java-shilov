import com.shilov.exceptions.TaskException;
import com.shilov.util.DataFormatter;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataFormatterTests {

    @Test(dataProvider = "validNames")
    public void shouldAcceptAsName(String name) {
        try {
            DataFormatter.checkIfStringHasNameFormat(name);
        } catch (TaskException e) {
            Assert.fail("exception was thrown using valid name");
        }
    }

    @DataProvider(name = "validNames")
    public Object[][] validNamesProvider() {
        return new Object[][]{
                {"Вячеслав"},
                {"ВячеСлав"},
                {"Игорь"},
                {"Tom"},
                {"tom"},
        };
    }

    @Test(dataProvider = "invalidNames")
    public void shouldThrowExceptionCheckingInvalidName(String name) {
        Assert.assertThrows(TaskException.class, () -> DataFormatter.checkIfStringHasNameFormat(name));
    }

    @DataProvider(name = "invalidNames")
    public Object[][] InvalidNamesProvider() {
        return new Object[][]{
                {""},
                {" "},
                {"&Ton"},
                {"Tom."},
                {"@"},
                {"1234"}
        };
    }

    @Test(dataProvider = "validStrings")
    public void shouldParseStringToIntegerList(String string) {
        try {
            DataFormatter.parseStringToIntegerList(string);
        } catch (TaskException e) {
            Assert.fail("exception was thrown using valid string");
        }
    }

    @DataProvider(name = "validStrings")
    public Object[][] validStringsWithIntegersProvider() {
        return new Object[][]{
                {"1 2 3"},
                {"1"},
                {"-2 4"},
                {" 4 5 "},
                {"23444444"}
        };
    }

    @Test(dataProvider = "invalidStrings")
    public void shouldThrowExceptionParsingInvalidString(String string) {
        Assert.assertThrows(TaskException.class, () -> DataFormatter.parseStringToIntegerList(string));
    }

    @DataProvider(name = "invalidStrings")
    public Object[][] invalidStringsWithIntegersProvider() {
        return new Object[][]{
                {"1 2 3.4"},
                {"test"},
                {"-2, 4"},
                {" "},
                {""}
        };
    }
}
