import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase{
    @BeforeMethod
    public void alertTest(){
        app.alert().selectItemAlert();
        app.alert().selectAlerts();
    }
    @Test
    public void testWithAlert(){
        app.alert().clickButton1();
        app.alert().clickButton2();
        app.alert().clickButton3();
        app.alert().clickButton4();

    }
}
