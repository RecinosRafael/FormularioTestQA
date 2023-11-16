package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void click(WebElement element) throws Exception {
        try {
            element.click();
        }catch (Exception e){
            throw new Exception("No se puede hacer clic en el elemento: " + element);
        }
    }

    public void informacion(WebElement element) throws Exception{
        try {
            element.sendKeys();
        }catch (Exception e){
            throw new Exception(" "+ element);
        }
    }

}
