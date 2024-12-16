package example;

import org.testng.annotations.Test;
import example.example.HomePage;
import example.example.SearchResultPage;
import static com.codeborne.selenide.Selenide.*;
import io.qameta.allure.Description;

   public class BookingTest {
       @Test    
       @Description("Проверка поиска и фильтрации отелей на Booking.com для города Анталья")
       public void bookingTest() {
           // Открыть сайт
           open("https://www.booking.com/");

           // Создать объекты страниц
           HomePage homePage = new HomePage();
           homePage.enterDestination("Анталья");
           
           SearchResultPage searchResultPage = homePage.clickSearchButton();
           // Проверка, что в поиске отображается Анталья
           assert searchResultPage.isDestinationDisplayed("Анталья") : "Не совпадает имя города в поиске";

           // Примениние фильтра на все отели на странице, имеют ли они рейтинг 5 звёзд
           assert searchResultPage.applyFiveStarFilter().areAllHotelsFiveStar() : "Не все отели имеют рейтинг в 5 звезд.";
       }
   }