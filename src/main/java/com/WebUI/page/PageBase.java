package com.WebUI.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {
    public WebDriver dr ;

    public PageBase() {
    }

    public PageBase(WebDriver driver) {
        this.dr = driver;
    }

    /**
     * 封装定位对象
     * @param by
     * @return
     */
    public WebElement findelement(By by){
       WebElement element = dr.findElement(by);
       return element;
    }
    public void sendkeys(WebElement element,String str){
        assert (null!=element):"对象为空，未定位到";
        element.sendKeys(str);
    }
    /**
     * 封装点击事件
     * @param element
     */
    public void click(WebElement element){
        assert (null!=element):"对象为空，未定位到";
        element.click();
    }
}
