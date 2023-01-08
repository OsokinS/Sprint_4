package ru.yandex.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowModalOrderNumber {

    public WindowModalOrderNumber(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final WebDriver webDriver;

    private By OrderData = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[4]");

    public void WindowModalOrderNumberDisplayed(){
        webDriver.findElement(OrderData).isDisplayed();

    }
}
