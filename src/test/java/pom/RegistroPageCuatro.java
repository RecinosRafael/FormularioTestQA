package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistroPageCuatro {


    @FindBy (id = "serialNumber")
    WebElement txtNumeroSerie;

    @FindBy (id = "step3")
    WebElement btnRegistrarce;

    WebDriver driver;

    public RegistroPageCuatro(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void llenrCampos(String serie){
        txtNumeroSerie.sendKeys(serie);
    }

    public void botonRegistrar(){
        btnRegistrarce.click();
    }

}
