import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperSelect extends HelperBase{

    public HelperSelect(WebDriver wd) {
        super(wd);
    }
    public void selectItemWidgets() {

        click(By.xpath("//div//h5[text()='Widgets']"));
    }

    public void clickSelectMenu() {

        scroll(0, 600);
        hideFooter();
        click(By.xpath("//span[.='Select Menu']"));
    }
}
