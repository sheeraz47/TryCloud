package com.try_cloud.pages;

import com.try_cloud.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id="user")
    public WebElement userNameInput;

    @FindBy(id="password")
    public WebElement passwordInput;


    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void login(String userUname, String password){
        userNameInput.sendKeys(userUname);
        passwordInput.sendKeys(password, Keys.ENTER);
    }
}
