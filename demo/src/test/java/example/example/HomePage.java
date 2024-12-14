package example.example;

import com.codeborne.selenide.SelenideElement;
   import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;


   public class HomePage {
    
       private SelenideElement searchInput = $("#\\:rh\\:");
       
       private SelenideElement searchButton = $("#indexsearch > div.hero-banner-searchbox > div > form > div > div.e22b782521.d12ff5f5bf > button");
;
       public HomePage enterDestination(String destination) {
        Configuration.timeout = 20000;
           searchInput.setValue(destination);
           searchInput.shouldHave(Condition.value(destination));
           return this;
       }

       public SearchResultPage clickSearchButton() {
        Configuration.timeout = 20000;
           searchButton.click();    
           return new SearchResultPage();
       }
   }