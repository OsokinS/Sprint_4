package ru.yandex.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowModalConfirmation {
    public WindowModalConfirmation(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final WebDriver webDriver;

    private By confirmationOrderButton = By.xpath("//div[@id='root']/div/div[2]/div[5]/div[2]/button[2]");



public void сlickConfirmationOrderButton(){

    webDriver.findElement(confirmationOrderButton).click();

}


}
