package com.tolmachevsv.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WikipediaMainPage {

    public final SelenideElement searchField = $("#searchInput");

    public void openPage() {
        open("https://ru.wikipedia.org");
        $(".main-top-header").shouldHave(text("Добро пожаловать в Википедию"));
    }

    public void searchRequiredTitle(String searchText) {
        searchField.sendKeys(searchText);
        searchField.submit();
    }
}
