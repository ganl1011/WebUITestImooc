package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SelectDriver {

    public WebDriver selectDr(String webdriver){
        if ("chrome".equals(webdriver)){
            System.setProperty("webdriver.chrome.driver","E:/chrome/chromedriver.exe");
            return new ChromeDriver();
        }
        else{
            System.setProperty("webdriver.chrome.driver","E:/chrome/chromedriver.exe");
            return new ChromeDriver();
        }
    }

}
