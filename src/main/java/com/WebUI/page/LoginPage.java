package com.WebUI.page;

import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {
    LoginPage login = new LoginPage();
    public void sendUsename(WebElement element,String name){
        login.sendkeys(element,name);
    }
}
