package business;

import com.WebUI.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class Login {
    public void login(){
        DriverBase dr = new DriverBase("chrome");
        WebElement element = dr.dr.findElement(By.id("js-signin-btn"));
        element.click();
    }
    
}
