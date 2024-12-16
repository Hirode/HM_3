package example;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Condition;

public class HomePage {
    
    private SelenideElement searchInput = $("#\\:rh\\:");
    private SelenideElement searchSelect = $("#autocomplete-result-0 > div");
    private SelenideElement arrivalButton = $("#indexsearch > div.hero-banner-searchbox > div > form > div > div:nth-child(2) > div > div > button:nth-child(2)");
    private SelenideElement arrivalInput = $("#calendar-searchboxdatepicker > div > div.a10b0e2d13.c807ff2d48 > div > div:nth-child(1) > table > tbody > tr:nth-child(4) > td:nth-child(1) > span");
    private SelenideElement departureInput = $("#calendar-searchboxdatepicker > div > div.a10b0e2d13.c807ff2d48 > div > div:nth-child(1) > table > tbody > tr:nth-child(4) > td:nth-child(7) > span");
    private SelenideElement searchButton = $("#indexsearch > div.hero-banner-searchbox > div > form > div > div.e22b782521.d12ff5f5bf > button");

    public HomePage enterDestination(String destination) {
        searchInput.setValue(destination);
        searchInput.shouldHave(Condition.value(destination));
        //searchSelect.shouldBe(Condition.visible);
        //searchSelect.click();
        return this;
    }
    public HomePage clickArrivalButton() {
        arrivalButton.click();    
        return this;
    }
    public HomePage enterArrival() {
        arrivalInput.click();
        return this;
    }
    public HomePage enterDeparture() {
           departureInput.click();
           return this;
    }
    public SearchResultPage clickSearchButton() {
        searchButton.click();    
        return new SearchResultPage();
    }
}