package example.example;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Condition;


   public class HomePage {
       private SelenideElement searchInput = $("#\\:rh\\:");
       private SelenideElement searchSelect = $("#autocomplete-result-0 > div");
       private SelenideElement searchButton = $("#indexsearch > div.hero-banner-searchbox > div > form > div > div.e22b782521.d12ff5f5bf > button");

       public HomePage enterDestination(String destination) {
        searchInput.setValue(destination);
        searchInput.shouldHave(Condition.value(destination));
        searchSelect.shouldBe(Condition.visible);
        searchSelect.click();
        return this;
       }
       
       public SearchResultPage clickSearchButton() {
        searchButton.click();    
        return new SearchResultPage();
       }
   }