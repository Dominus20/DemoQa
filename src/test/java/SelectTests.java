import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectTests extends TestBase{
    @BeforeMethod
    public void precondition() {
        app.select().selectItemWidgets();
        app.select().clickSelectMenu();

    }

    @Test
    public void testFirst(){

    }
}
