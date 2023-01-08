package scootertests;

import org.junit.Test;
import org.openqa.selenium.By;
import ru.yandex.practicum.MainPage;

import static org.junit.Assert.assertTrue;


public class ImportantQuestions extends TestBase {


  @Test
    public void CheckImportantQuestions(){

    MainPage mainPage = new MainPage(driver);

      mainPage.open();
      mainPage.clickCookieButton();
      mainPage.clickAccordionHeading0();
      mainPage.isDisplayedAccordionPanel0();

      mainPage.clickAccordionHeading1();
      mainPage.isDisplayedAccordionPanel1();

      mainPage.clickAccordionHeading2();
      mainPage.isDisplayedAccordionPanel2();

      mainPage.clickAccordionHeading3();
      mainPage.isDisplayedAccordionPanel3();

      mainPage.clickAccordionHeading4();
      mainPage.isDisplayedAccordionPanel4();

      mainPage.clickAccordionHeading5();
      mainPage.isDisplayedAccordionPanel5();

      mainPage.clickAccordionHeading6();
      mainPage.isDisplayedAccordionPanel6();

      mainPage.clickAccordionHeading7();
      mainPage.isDisplayedAccordionPanel7();








    //  for (int i=0; i<=7; i = i+1){
    //  driver.findElement(By.xpath("//div[@id='accordion__heading-'"[i]"']")).click();
    //  boolean isDisplayedPanel= driver.findElement(By.id("accordion__panel-[i]")).isDisplayed();
    //  assertTrue(isDisplayedPanel);
    //}



      // driver.findElement(By.xpath("//div[@id='accordion__heading-0']")).click();
      // boolean isDisplayedPanel0 = driver.findElement(By.id("accordion__panel-0")).isDisplayed();
      // assertTrue(isDisplayedPanel0);

      // driver.findElement(By.xpath("//div[@id='accordion__heading-1']")).click();
      // boolean isDisplayedPanel1 = driver.findElement(By.id("accordion__panel-1")).isDisplayed();
      // assertTrue(isDisplayedPanel1);

      //driver.findElement(By.xpath("//div[@id='accordion__heading-2']")).click();
      //boolean isDisplayedPanel2 = driver.findElement(By.id("accordion__panel-2")).isDisplayed();
      //assertTrue(isDisplayedPanel2);

      //driver.findElement(By.xpath("//div[@id='accordion__heading-3']")).click();
      //boolean isDisplayedPanel3 = driver.findElement(By.id("accordion__panel-3")).isDisplayed();
      //assertTrue(isDisplayedPanel3);

      //driver.findElement(By.xpath("//div[@id='accordion__heading-4']")).click();
      //boolean isDisplayedPanel4 = driver.findElement(By.id("accordion__panel-4")).isDisplayed();
      //assertTrue(isDisplayedPanel4);

     // driver.findElement(By.xpath("//div[@id='accordion__heading-5']")).click();
      //boolean isDisplayedPanel5 = driver.findElement(By.id("accordion__panel-5")).isDisplayed();
      //assertTrue(isDisplayedPanel5);

      //driver.findElement(By.xpath("//div[@id='accordion__heading-6']")).click();
      //boolean isDisplayedPanel6 = driver.findElement(By.id("accordion__panel-6")).isDisplayed();
      //assertTrue(isDisplayedPanel6);

      //driver.findElement(By.xpath("//div[@id='accordion__heading-7']")).click();
      //boolean isDisplayedPanel7 = driver.findElement(By.id("accordion__panel-7")).isDisplayed();
      //assertTrue(isDisplayedPanel7);


  }






}
