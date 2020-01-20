package com.try_cloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {

        @FindBy(css = "[id='appmenu'] li")
        public WebElement pageSubTitle;
}
