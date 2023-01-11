package scootertests;

import org.junit.Test;
import org.openqa.selenium.By;
import ru.yandex.practicum.MainPage;

import static org.junit.Assert.assertTrue;


public class ImportantQuestions extends TestBase {


  @Test
    public void сheckImportantQuestions0() {

    MainPage mainPage = new MainPage(driver);

    mainPage.open();
    mainPage.clickCookieButton();
    mainPage.clickAccordionHeading0();
    mainPage.isDisplayedAccordionPanel0();

  }

  @Test
  public void сheckImportantQuestions1() {

    MainPage mainPage = new MainPage(driver);

    mainPage.open();
    mainPage.clickCookieButton();
    mainPage.clickAccordionHeading1();
    mainPage.isDisplayedAccordionPanel1();

  }

  @Test
  public void сheckImportantQuestions2() {

    MainPage mainPage = new MainPage(driver);

    mainPage.open();
    mainPage.clickCookieButton();
    mainPage.clickAccordionHeading2();
    mainPage.isDisplayedAccordionPanel2();

  }

  @Test
  public void сheckImportantQuestions3() {

    MainPage mainPage = new MainPage(driver);

    mainPage.open();
    mainPage.clickCookieButton();
    mainPage.clickAccordionHeading3();
    mainPage.isDisplayedAccordionPanel3();

  }

  @Test
  public void сheckImportantQuestions4() {

    MainPage mainPage = new MainPage(driver);

    mainPage.open();
    mainPage.clickCookieButton();
    mainPage.clickAccordionHeading4();
    mainPage.isDisplayedAccordionPanel4();

  }

  @Test
  public void сheckImportantQuestions5() {

    MainPage mainPage = new MainPage(driver);

    mainPage.open();
    mainPage.clickCookieButton();
    mainPage.clickAccordionHeading5();
    mainPage.isDisplayedAccordionPanel5();

  }

  @Test
  public void сheckImportantQuestions6() {

    MainPage mainPage = new MainPage(driver);

    mainPage.open();
    mainPage.clickCookieButton();
    mainPage.clickAccordionHeading6();
    mainPage.isDisplayedAccordionPanel6();

  }

  @Test
  public void сheckImportantQuestions7() {

    MainPage mainPage = new MainPage(driver);

    mainPage.open();
    mainPage.clickCookieButton();
    mainPage.clickAccordionHeading7();
    mainPage.isDisplayedAccordionPanel7();

  }



}



