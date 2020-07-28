package testbase;

import base.ProUtil;
import business.Login;
import org.testng.annotations.Test;

public class LoginTestCase {
    @Test
    public void loginTest() throws InterruptedException {
        Login login = new Login();
        Thread.sleep(10);
        login.loginOption();
    }
}
