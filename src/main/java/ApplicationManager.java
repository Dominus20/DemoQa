import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    HelperAlert alert;
    HelperSelect select;

    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://demoqa.com/");

        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        alert = new HelperAlert(wd);
        select = new HelperSelect(wd);
        returnAfterInstalledAdblock();

    }

    public void stop(){
        wd.quit();
    }

    public HelperAlert alert() {
        return alert;
    }

    public HelperSelect select() {
        return select;
    }

    private void returnAfterInstalledAdblock() {
        List<String> tabs = new ArrayList<>(wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1)).close();
        wd.switchTo().window(tabs.get(0));

    }


}
