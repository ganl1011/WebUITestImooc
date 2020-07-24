package testbase;

import base.ProUtil;
import business.Login;
import org.testng.annotations.Test;

public class LoginTestCase {
    @Test
    public void loginTest(){
        String field = null;
        ProUtil pro = new ProUtil("E:\\workspace\\WebUITest\\src\\test\\java\\File\\element.properties");
        field = pro.getPro("login.username");
        System.out.println(field);
    }
}
