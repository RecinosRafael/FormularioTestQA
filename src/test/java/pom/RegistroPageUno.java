package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistroPageUno {

    @FindBy(xpath = "//a[contains(text(),'Registro')]")
    WebElement btnRegistro;

    @FindBy (id = "email")
    WebElement txtCorreo;

    @FindBy (id = "password")
    WebElement txtPassword;

    @FindBy (id = "userName")
    WebElement txtUsuario;

    @FindBy (id = "step1")
    WebElement btnSigPaginaUno;



    WebDriver driver;


   public RegistroPageUno(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickRegistrar(){
        btnRegistro.click();
    }

    public void llenarCampasPaginaUno(String correo, String password, String nombreUsuario){
        txtCorreo.sendKeys(correo);
        txtPassword.sendKeys(password);
        txtUsuario.sendKeys(nombreUsuario);


    }


    public void clickSigPagUno(){
        btnSigPaginaUno.click();
    }




}
