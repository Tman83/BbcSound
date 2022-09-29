package com.bbcSound.pages;

import com.bbcSound.utilities.ConfigurationReader;
import com.bbcSound.utilities.Driver;
import org.openqa.selenium.By;

public class LoginPage extends BbcBasePage {

    public static void bbcSound() {
        String username= ConfigurationReader.getProperty("username");
        System.out.println(username);
        String password= ConfigurationReader.getProperty("password");
        System.out.println(password);
        Driver.getDriver().get(ConfigurationReader.getProperty("bbcSound.url"));

        Driver.getDriver().findElement(By.name("USER_LOGIN")).sendKeys(username);
        Driver.getDriver().findElement(By.name("USER_PASSWORD")).sendKeys(password);
        Driver.getDriver().findElement(By.className("login-btn")).click();
    }
}
