package ru.yandex.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Text;

public class PageInputPersonData {

    public PageInputPersonData(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    private final WebDriver webDriver;

    private By addFirstName = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[1]/input");

    private By addLastName = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[2]/input");

    private By addAddress = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/input");

    private By addMetro = By.className("select-search__input");


    private By addTelefon = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[5]/input");

    private By buttonFurther = By.xpath("//div[@id='root']/div/div[2]/div[3]/button");



    public void addFirstName(String Firstname){
        webDriver.findElement(addFirstName).sendKeys(Firstname);
    }

    public void addLastName(String Lastname){
        webDriver.findElement(addLastName).sendKeys(Lastname);
    }

    public void addAddress(String Address){
        webDriver.findElement(addAddress).sendKeys(Address);
    }

    public void addMetro(int Metro){
        webDriver.findElement(addMetro).click();
        webDriver.findElement(By.className("select-search__select")).isDisplayed();
        webDriver.findElement(By.xpath("//ul/li[@data-value = " + Metro + "]")).click();


    }

    public void addTelefon(String Telefon){
        webDriver.findElement(addTelefon).sendKeys(Telefon);
    }

    public void clickButtonFurther(){
        webDriver.findElement(buttonFurther).click();
    }


}