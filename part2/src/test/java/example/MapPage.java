package example;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Condition;

   public class MapPage {
      private SelenideElement firstCard = $x("//*[@class=\"ced4498db9\"]/li[1]");
      private SelenideElement hotelName = $x("//*[@class=\"ced4498db9\"]/li[1]/*/div[2]/div[1]/div[1]/div/h2");
      private SelenideElement meanScore = $x("//*[@class=\"ced4498db9\"]/li[1]/*/div[2]/div[2]/div/div[1]/div");
      private SelenideElement numFeedback = $x("//*[@class=\"ced4498db9\"]/li[1]/*/div[2]/div[2]/div/div[2]/div[2]");
      private SelenideElement hotelPrice = $x("//*[@class=\"ced4498db9\"]/li[1]/*/div[2]/div[5]/div[2]/span[2]");
      private SelenideElement selectdMarker = $x("//*[@id=\"b_map_tiles\"]//div[contains(@class, 'dd34cbd78f ecc4ffd6fd')]");
      public MapPage hoverFirstCard() {
         firstCard.hover();
         sleep(5000);
         return this;
     }
     /*public MapPage saveDataFirstCard() {
      sleep(10000);
      String hotelname = hotelName.getText();
      String meanscore = meanScore.getText();
      String numfeedback = numFeedback.getText();
      String hotelprice = hotelPrice.getText();
      System.out.println(hotelname);
      System.out.println("Кол-во звезд = " + Rating);
      System.out.println(meanscore);
      System.out.println(numfeedback);
      System.out.println(hotelprice);
      return this;
      }*/
      public String getHotelName() {
         String hotelname = hotelName.getText();
         System.out.println(hotelname);
         return hotelname;
       }
       public int getRating() {
        int Rating = $$x("//*[@id=\"hp_hotel_name\"]/span/div/div/span/div/span").size();
        System.out.println("Кол-во звезд = " + Rating);
        return Rating;
       }
       public String getMeanScore() {
         String meanscore = meanScore.getText();
         System.out.println(meanscore);
         return meanscore;
       }
       public String getNumFeedback() {
         String numfeedback = numFeedback.getText();
         System.out.println(numfeedback);
         return numfeedback;
       }
       public String getHotelPrice() {
         String hotelprice = hotelPrice.getText();
         System.out.println(hotelprice);
         return hotelprice;
       }
      public HotelPage clickOnMarker() {
         sleep(10000);
         selectdMarker.shouldBe(Condition.exist).click();
         return new HotelPage();
      }
   }
