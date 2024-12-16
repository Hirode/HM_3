package example;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

   public class HotelPage{
    private SelenideElement hotelPageName = $x("//*[@id=\"hp_hotel_name\"]/div/h2");
    private SelenideElement meanPageScore = $x("//*[@id=\"js--hp-gallery-scorecard\"]/a/div/div/div/div[1]/div");
    private SelenideElement numPageFeedback = $x("//*[@id=\"js--hp-gallery-scorecard\"]/a/div/div/div/div[2]/div[2]");
    private SelenideElement hotelPagePrice = $x("//*[@id=\"hprt-table\"]/tbody/tr[1]/td[3]/div/div[1]/div[1]/div[2]/div/span[1]");
    /*public HotelPage saveDataHotelPage() {
      sleep(5000);
      String hotelpagename = hotelPageName.getText();
      String meanpagescore = meanPageScore.getText();
      String numpagefeedback = numPageFeedback.getText();
      String hotelpageprice = hotelPagePrice.getText();
      System.out.println(hotelpagename);
      System.out.println("Кол-во звезд = " + pageRating);
      System.out.println(meanpagescore);
      System.out.println(numpagefeedback);
      System.out.println(hotelpageprice);
      return this;
    }*/
    //*[@id="hp_hotel_name"]/span/div/div/span/div/span
    
    public String getHotelPageName() {
      String hotelpagename = hotelPageName.getText();
      System.out.println(hotelpagename);
      return hotelpagename;
    }
    public int getPageRating() {
      int pageRating = $$x("//*[@id=\"hp_hotel_name\"]/span/div/div/span/div/span").size();
      System.out.println("Кол-во звезд = " + pageRating);
      return pageRating;
    }
    public String getMeanPageScore() {
      String meanpagescore = meanPageScore.getText();
      System.out.println(meanpagescore);
      return meanpagescore;
    }
    public String getNumPageFeedback() {
      String numpagefeedback = numPageFeedback.getText();
      System.out.println(numpagefeedback);
      return numpagefeedback;
    }
    public String getHotelPagePrice() {
      String hotelpageprice = hotelPagePrice.getText();
      System.out.println(hotelpageprice);
      return hotelpageprice;
    }
  }

