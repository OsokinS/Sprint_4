package ru.yandex.practicum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    public MainPage (WebDriver webDriver){
        this.webDriver = webDriver;
    }
    private final WebDriver webDriver;

    private By CookieButton = By.className("App_CookieButton__3cvqF");
    private By accordionHeading0 = By.xpath("//div[@id='accordion__heading-0']");
    private By accordionHeading1 = By.xpath("//div[@id='accordion__heading-1']");
    private By accordionHeading2 = By.xpath("//div[@id='accordion__heading-2']");
    private By accordionHeading3 = By.xpath("//div[@id='accordion__heading-3']");
    private By accordionHeading4 = By.xpath("//div[@id='accordion__heading-4']");
    private By accordionHeading5 = By.xpath("//div[@id='accordion__heading-5']");
    private By accordionHeading6 = By.xpath("//div[@id='accordion__heading-6']");
    private By accordionHeading7 = By.xpath("//div[@id='accordion__heading-7']");

    private By orderButtonHeader = By.className("Button_Button__ra12g");

    private By orderButtonCenter = By.className("Button_Button__ra12g Button_Middle__1CSJM");


    public void clickCookieButton(){
        webDriver.findElement(CookieButton).click();
    }

    public void clickAccordionHeading0() {
        webDriver.findElement(accordionHeading0).click();

    }

    public void clickAccordionHeading1() {
        webDriver.findElement(accordionHeading1).click();

    }

    public void clickAccordionHeading2() {
        webDriver.findElement(accordionHeading2).click();

    }

    public void clickAccordionHeading3() {
        webDriver.findElement(accordionHeading3).click();

    }

    public void clickAccordionHeading4() {
        webDriver.findElement(accordionHeading4).click();

    }

    public void clickAccordionHeading5() {
        webDriver.findElement(accordionHeading5).click();

    }

    public void clickAccordionHeading6() {
        webDriver.findElement(accordionHeading6).click();

    }

    public void clickAccordionHeading7() {
        webDriver.findElement(accordionHeading7).click();

    }

    public void clickButtonOrderHeader() {
        webDriver.findElement(orderButtonHeader).click();

    }

    public void clickButtonOrderCenter() {
        webDriver.findElement(orderButtonCenter).click();

    }


    public boolean isDisplayedAccordionPanel0(){

        return webDriver.findElement(By.id("accordion__panel-0")).isDisplayed();
    }

    public boolean isDisplayedAccordionPanel1(){

        return webDriver.findElement(By.id("accordion__panel-1")).isDisplayed();
    }

    public boolean isDisplayedAccordionPanel2(){

        return webDriver.findElement(By.id("accordion__panel-2")).isDisplayed();
    }

    public boolean isDisplayedAccordionPanel3(){

        return webDriver.findElement(By.id("accordion__panel-3")).isDisplayed();
    }

    public boolean isDisplayedAccordionPanel4(){

        return webDriver.findElement(By.id("accordion__panel-4")).isDisplayed();
    }

    public boolean isDisplayedAccordionPanel5(){

        return webDriver.findElement(By.id("accordion__panel-5")).isDisplayed();
    }

    public boolean isDisplayedAccordionPanel6(){

        return webDriver.findElement(By.id("accordion__panel-6")).isDisplayed();
    }

    public boolean isDisplayedAccordionPanel7(){

        return webDriver.findElement(By.id("accordion__panel-7")).isDisplayed();
    }

    public void open(){
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
    }



}
