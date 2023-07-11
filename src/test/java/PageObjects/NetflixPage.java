package PageObjects;

import Definitions.Hooks;
import Utilities.Credentials;
import Utilities.BaseUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NetflixPage extends BaseUtil {

    public NetflixPage(WebDriver driver) {
        super(driver);
    }
    private final String url = Credentials.userProperty("web.page.url");
    private final By btn_singIn_home = By.xpath("//a[@href='/co/login']");
    private final By txt_emailOrPhone = By.id("id_userLoginId");
    private final By lbl_emailOrPhone_error = By.xpath("//form/div[1]/div[@class='inputError']");
    private final By txt_password = By.id("id_password");
    private final By lbl_password_error = By.xpath("//form/div[2]/div[@class='inputError']");
    private final By lbl_errorMessage = By.xpath("//div[@class='ui-message-contents']");

    private final By btn_singIn_login = By.xpath("//button[contains(text(),'Iniciar sesión')]");


    public void navigateToNetflix() {
        driver.get(url);

    }
    public void maximizeScreen(){
        driver.manage().window().maximize();
    }

    public void printTitle() {

        System.out.println("Title: " + driver.getTitle());
    }

    public void printURL() {
        String currentURL = driver.getCurrentUrl();
        System.out.println("URL: " + currentURL);
        Assert.assertEquals("https://www.netflix.com/co/",currentURL);
    }

    public void clickSingInHome(){
        click(btn_singIn_home);
    }
    public void textEmailOrPhone(String emailOrPhone){
        type(emailOrPhone,txt_emailOrPhone,20);
    }
    public void textPassword(String password){
        type(password,txt_password);
    }
    public void validateMessageEmailOrPhone(String expected){
        validateText(expected,lbl_emailOrPhone_error,11);
    }
    public void validateMessagePassword(String expected){
        validateText(expected,lbl_password_error,12);
    }
    public void validateMessageWrongCredentials(String expected){
        validateText(expected,lbl_errorMessage,17);
    }

    public void clickSingInLogin(){
        click(btn_singIn_login,15);
    }


}
