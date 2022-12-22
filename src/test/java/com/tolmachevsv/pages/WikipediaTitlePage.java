package com.tolmachevsv.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class WikipediaTitlePage extends WikipediaMainPage {

    public final SelenideElement pageHeader = $("#firstHeading");

    public void checkIfCorrectTitle(String searchText) {
        pageHeader.shouldHave(text(searchText));
    }
}
