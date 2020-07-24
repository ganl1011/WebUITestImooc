package com.WebUI.base;

import org.openqa.selenium.By;

public class ProUtil {
    public By proBy(String type , String value){
        if("name".equals(type)){
           return By.name(value);
        }
        if("id".equals(type)){
            return By.id(value);
        }
        if ("classname".equals(type)){
            return By.className(value);
        }
        if("xpath".equals(type)) {
            return By.xpath(value);
        }
        return null;
    }
}
