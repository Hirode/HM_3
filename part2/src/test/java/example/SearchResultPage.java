package example;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

   public class SearchResultPage {
       private SelenideElement FindOnMap = $("#bodyconstraint-inner > div:nth-child(8) > div > div.af5895d4b2 > div.df7e6ba27d > div.b4b4b2787f > div.b546c9ed2b > div > div > div > div > button");
       
       public MapPage applyFindOnMap() {
           sleep(8000);
           FindOnMap.click();
           return new MapPage();
       }
   }