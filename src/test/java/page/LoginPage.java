package page;

import base.ProUtil;
import com.WebUI.page.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LoginPage extends PageBase {
    String username = "login.username";
    String path="E:\\workspace\\WebUITest\\src\\test\\java\\File\\element.properties";
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public WebElement findUsername(){
        ProUtil pro = new ProUtil(path);
        LoginPage loginPage = new LoginPage(dr);
        return loginPage.element(pro.proBy(username));
    }
}
