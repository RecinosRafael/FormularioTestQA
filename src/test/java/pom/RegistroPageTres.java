package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistroPageTres {

    @FindBy(xpath = "//figcaption[contains(text(),'Artística')]")
    WebElement clicTipo;

    @FindBy (xpath = "//div[@id='test-form-3']//button[@class='btn btn-primary btn-block btn-next-form'][contains(text(),'Siguiente')]")
    WebElement btnSigPaginaTres;

    WebDriver driver;

    public RegistroPageTres(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void seleccionarTipo(){
        clicTipo.click();
    }

    public void clickSigPagTres(){
        btnSigPaginaTres.click();
    }



}
