package base;

import com.WebUI.base.SelectDriver;
import org.openqa.selenium.WebDriver;

public class DriverBase {
    public WebDriver dr ;

    public DriverBase(String webDriver) {
        SelectDriver driver = new SelectDriver();
        dr = driver.selectDr(webDriver);
        dr.manage().window().maximize();
    }
    public WebDriver driver(){
        return dr;
    }
    public void stop(){
        dr.close();
        System.out.println("浏览器已关闭");
    }
}
