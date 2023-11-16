package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pom.RegistroPageCuatro;
import pom.RegistroPageDos;
import pom.RegistroPageTres;
import pom.RegistroPageUno;

import java.util.concurrent.TimeUnit;

public class TestRunner {

    WebDriver driver;
    String driverPath = "./src/test/resources/drivers/geckodriver.exe";
    String url = "https://canon-creators.com/inicio";


    @BeforeSuite
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test(description ="Caso de prueba 001 Informaciono de acceso", priority = 1)
    public void registroInformacionAcceso() throws Exception {
        RegistroPageUno registroPage = new RegistroPageUno(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        registroPage.clickRegistrar();

        registroPage.llenarCampasPaginaUno("QA-Automation@gmail.com", "QA-Automation9", "QA-Automation9");

       Select birthday = new Select(driver.findElement(By.id("birthDay")));
        birthday.selectByVisibleText("04");

       Select birthmonth = new Select(driver.findElement(By.id("birthMonth")));
        birthmonth.selectByVisibleText("Agosto");

        Select birthyear = new Select(driver.findElement(By.id("birthYear")));
        birthyear.selectByVisibleText("1992");


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        registroPage.clickSigPagUno();

    }

    @Test(description = "Caso de prueba 002 Informaciono basica", priority = 2)
    public  void registroInformacionBasica(){
        RegistroPageDos registroPageDos = new RegistroPageDos(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        registroPageDos.llenarCamposPainaDos("QARafael", "Recinos","55396823");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("Guatemala");

        registroPageDos.clickSigPagDos();


    }

    @Test(description = "Caso de prueba 003 Intereses", priority = 3)
    public void intereses(){
        RegistroPageTres intereses = new RegistroPageTres(driver);

        intereses.seleccionarTipo();
        intereses.clickSigPagTres();

    }

    @Test(description = "Caso de prueba 004 equipo", priority = 4)
    public void equiopo(){

        RegistroPageCuatro equipo = new RegistroPageCuatro(driver);

        Select equipment = new Select(driver.findElement(By.id("equipment")));
        equipment.selectByVisibleText("EOS Rebel T6");

        equipo.llenrCampos("4457848");
        equipo.botonRegistrar();

    }






}
