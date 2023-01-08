package scootertests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.practicum.*;


@RunWith(Parameterized.class)


    public class OrderScooterButton extends TestBase {

    private final String Firstname;
    private final String Lastname;
    private final String Address;
    private final int Metro;
    private final String Telefon;

        public OrderScooterButton(String Firstname, String Lastname, String Address, int Metro, String Telefon) {

            this.Firstname = Firstname;
            this.Lastname = Lastname;
            this.Address = Address;
            this.Metro = Metro;
            this.Telefon = Telefon;
        }

        @Parameterized.Parameters
        public static Object[][] data() {
            return new Object[][]{
                    {"Иван", "Иванов", "город Москва, улица Народная, дом 4, квартира 1", 3, "79999999999"},
                    {"Дмитрий", "Дмитриев", "город Москва, улица Ленина, дом 9, квартира 6", 4,"79998888888"},
            };
        }


        @Test
        public void checkButtonHeader() {


            MainPage mainPage = new MainPage(driver);

            mainPage.open();
            mainPage.clickCookieButton();
            mainPage.clickButtonOrderHeader();

            PageInputPersonData pageInputPersonData = new PageInputPersonData(driver);

            pageInputPersonData.addFirstName(Firstname);
            pageInputPersonData.addLastName(Lastname);
            pageInputPersonData.addAddress(Address);
            pageInputPersonData.addMetro(Metro);
            pageInputPersonData.addTelefon(Telefon);
            pageInputPersonData.clickButtonFurther();

            PageRent pageRent = new PageRent(driver);

            pageRent.addDate();
            pageRent.addRentalPeriod();
            pageRent.addColor();
            pageRent.clickOrderButton();

            WindowModalConfirmation windowModalConfirmation = new WindowModalConfirmation(driver);

            windowModalConfirmation.ClickConfirmationOrderButton();

            WindowModalOrderNumber windowModalOrderNumber = new WindowModalOrderNumber(driver);

            windowModalOrderNumber.WindowModalOrderNumberDisplayed();


        }



    @Test
    public void checkButtonCenter() {


        MainPage mainPage = new MainPage(driver);

        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickButtonOrderHeader();

        PageInputPersonData pageInputPersonData = new PageInputPersonData(driver);

        pageInputPersonData.addFirstName(Firstname);
        pageInputPersonData.addLastName(Lastname);
        pageInputPersonData.addAddress(Address);
        pageInputPersonData.addMetro(Metro);
        pageInputPersonData.addTelefon(Telefon);
        pageInputPersonData.clickButtonFurther();

        PageRent pageRent = new PageRent(driver);

        pageRent.addDate();
        pageRent.addRentalPeriod();
        pageRent.addColor();
        pageRent.clickOrderButton();

        WindowModalConfirmation windowModalConfirmation = new WindowModalConfirmation(driver);

        windowModalConfirmation.ClickConfirmationOrderButton();

        WindowModalOrderNumber windowModalOrderNumber = new WindowModalOrderNumber(driver);

        windowModalOrderNumber.WindowModalOrderNumberDisplayed();


    }

    }
