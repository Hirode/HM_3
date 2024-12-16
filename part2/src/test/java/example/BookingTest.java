package example;
import org.testng.annotations.Test;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;
import io.qameta.allure.Description;

   public class BookingTest {
        static {
            Configuration.timeout = 10000; // Устанавливаем глобальный тайм-аут в 10 секунд
            Configuration.browserSize = "1920x1080";
            Configuration.holdBrowserOpen = true;
        }

       @Test    
       @Description("Проверка поиска и получения информации об отелях на Booking.com для города Лондон")
       public void bookingTest() {
           open("https://www.booking.com/");
           HomePage homePage = new HomePage();;
           homePage.enterDestination("Лондон");
           homePage.clickArrivalButton();
           homePage.enterArrival();
           homePage.enterDeparture();
           SearchResultPage searchResultPage = homePage.clickSearchButton();
           MapPage mapPage = searchResultPage.applyFindOnMap();
           sleep(10000);
           mapPage.hoverFirstCard();
           mapPage.getHotelName();
           mapPage.getRating();
           mapPage.getMeanScore();
           mapPage.getNumFeedback();
           mapPage.getHotelPrice();
           sleep(10000);
           HotelPage hotelPage = mapPage.clickOnMarker();
           switchTo().window(1);
           sleep(5000);
           hotelPage.getHotelPageName();
           hotelPage.getPageRating();
           hotelPage.getMeanPageScore();
           hotelPage.getNumPageFeedback();
           hotelPage.getHotelPagePrice();
           System.out.println("Сравнение данных:");
           System.out.println("Название отеля: " + (mapPage.getHotelName().equals(hotelPage.getHotelPageName()) ? "Совпадает" : "Не совпадает"));
           System.out.println("Рейтинг: " + (mapPage.getRating() == hotelPage.getPageRating() ? "Совпадает" : "Не совпадает"));
           System.out.println("Средний балл: " + (mapPage.getMeanScore().equals(hotelPage.getMeanPageScore()) ? "Совпадает" : "Не совпадает"));
           System.out.println("Количество отзывов: " + (mapPage.getNumFeedback().equals(hotelPage.getNumPageFeedback()) ? "Совпадает" : "Не совпадает"));
           System.out.println("Цена: " + (mapPage.getHotelPrice().equals(hotelPage.getHotelPagePrice()) ? "Совпадает" : "Не совпадает"));
       }
   }