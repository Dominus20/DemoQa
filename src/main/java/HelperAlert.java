import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperAlert extends  HelperBase{

    public HelperAlert(WebDriver wd) {
        super(wd);
    }

    public void selectItemAlert(){
        scroll(0, 300);
        //click(By.id("close-fixedban"));
        click(By.xpath("//h5[.='Alerts, Frame & Windows']"));

    }
    public void selectAlerts() {
        click(By.xpath("//span[text()='Alerts']"));

    }

    public void clickButton1() {

        click(By.id("alertButton"));//-
        pause(4000);
        wd.switchTo().alert().accept();

    }

    public void clickButton2() {
        click(By.id("timerAlertButton"));

        Alert alert = new WebDriverWait(wd, 10).until(ExpectedConditions.alertIsPresent());
        wd.switchTo().alert();
        alert.accept();


    }

    public void clickButton3() {
        click(By.id("confirmButton"));
        //cancel

        Alert alert =  wd.switchTo().alert();
        pause(20000);
        alert.dismiss();//cancel button

    }

    public void clickButton4() {
        click(By.id("promtButton"));
        Alert alert = wd.switchTo().alert();
        alert.sendKeys("Hello!");
        pause(2000);
        String text = alert.getText();
        System.out.println(text);
        alert.accept();//ok button
    }

}
