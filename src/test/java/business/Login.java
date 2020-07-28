package business;

import base.ProUtil;
import com.WebUI.base.DriverBase;
import com.WebUI.page.LoginPage;
import handle.LoginHandle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Login {
    WebDriver dr;
    String url = "http://www.imooc.com/user/newlogin";
    public Login() {
        this.dr =  new DriverBase("chrome").dr;
    }

    public void loginOption(){
        dr.get(url);
        LoginHandle handle= new LoginHandle(dr);
        handle.loginUsername();
    }
    
}
