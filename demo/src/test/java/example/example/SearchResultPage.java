package example.example;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;


   public class SearchResultPage {
       private SelenideElement destinationLabel = $("#bodyconstraint-inner > div:nth-child(8) > div > div.af5895d4b2 > div.df7e6ba27d > div.bcbf33c5c3 > div.efdb2b543b.e4b7a69a57.fe7b9a9999 > h1");
       private SelenideElement fiveStarFilter = $("#filter_group_class_\\:r20\\: > fieldset > div:nth-child(12) > label");
       private ElementsCollection hotels =  $$("#bodyconstraint-inner > div:nth-child(8) > div > div.af5895d4b2 > div.df7e6ba27d > div.bcbf33c5c3 > div.dcf496a7b9.bb2746aad9 > div.d4924c9e74 > div.c82435a4b8.a93e0e54e8.f36a496177.a18aeea94d.d794b7a0f7.f53e278e95.c6710787a4");
       public SearchResultPage applyFiveStarFilter() {
           fiveStarFilter.click();
           return this;
       }

       public boolean isDestinationDisplayed(String destination) {
           return destinationLabel.getText().contains(destination);
       }

    
       public boolean areAllHotelsFiveStar() {
           for (SelenideElement hotel : hotels) {
               if (!hotel.getText().contains("5 из 5")) {
                   return false;
               }
           }
           return true;
       }
   }