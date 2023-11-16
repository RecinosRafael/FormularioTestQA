package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistroPageDos {

    @FindBy(id = "name")
    WebElement txtNombre;

    @FindBy (id = "lastName")
    WebElement txtApellido;

    @FindBy (id = "phoneNumber")
    WebElement txtNumeroTelefono;

    @FindBy (xpath = "//button[@id='step2']")
    WebElement btnSigPaginaDos;

    WebDriver driver;

    public RegistroPageDos(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void llenarCamposPainaDos(String nombre, String apellido, String noTelefono){

        txtNombre.sendKeys(nombre);
        txtApellido.sendKeys(apellido);
        txtApellido.sendKeys(noTelefono);

    }

    public void clickSigPagDos(){
        btnSigPaginaDos.click();
    }

}
