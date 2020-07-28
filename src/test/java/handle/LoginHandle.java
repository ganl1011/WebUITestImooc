package handle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.LoginPage;

public class LoginHandle {
    WebDriver dr;
    LoginPage loginPage;
    public LoginHandle(WebDriver webDriver) {
        this.dr = webDriver;
        loginPage =  new LoginPage(dr);
    }

    public void loginUsername(){
        WebElement ele=loginPage.findUsername();
        ele.clear();
        loginPage.sendkeys(ele,"15222895636");
    }
}
