package com.baeldung.selenide;

import org.junit.jupiter.api.Test;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * this code is quoted from a Baeldung article:
 * https://www.baeldung.com/selenide
 */
public class SearchLiveTest {

    @Test
    public void searchBaeldung() throws Exception {
        open("https://duckduckgo.com/");

        SelenideElement searchbox = $(By.id("searchbox_input"));
        searchbox.click();
        searchbox.sendKeys("Baeldung");
        searchbox.pressEnter();

        SelenideElement firstResult = $(By.id("r1-0"));
        firstResult.shouldHave(text("Baeldung"));
        //firstResult.shouldHave(text("In-depth, to-the-point tutorials on Java, Spring, Spring Boot, Security, and REST."));
    }
}
