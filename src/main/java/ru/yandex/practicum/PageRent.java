package ru.yandex.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageRent {
    public PageRent(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final WebDriver webDriver;


    private By addDate = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[1]/div[1]/div/input");

    private By addRentalPeriod = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[2]");

    private By addColorBlack = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/label[1]");

    private By addColorGray = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/label[2]");

    private By addComment = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[4]");

    private By orderButton = By.xpath("//div[@id='root']/div/div[2]/div[3]/button[2]");


    public void addDate(){

        webDriver.findElement(addDate).sendKeys("09.12.23");
        webDriver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[6]")).click();
    }

    public void addRentalPeriod(){
        webDriver.findElement(addRentalPeriod).click();
        webDriver.findElement(By.className("Dropdown-menu")).isDisplayed();
        webDriver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div[1]")).click();
    }

    public void addColor(){
        webDriver.findElement(addColorBlack).click();
        webDriver.findElement(addColorGray).click();
    }

    public void clickOrderButton(){
        webDriver.findElement(orderButton).click();
    }

}
