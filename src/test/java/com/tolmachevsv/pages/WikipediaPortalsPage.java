package com.tolmachevsv.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.tolmachevsv.tests.MenuItem;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.*;

public class WikipediaPortalsPage extends WikipediaTitlePage {

    private final SelenideElement portalPage = $(".mw-parser-output");
    private final ElementsCollection searchSuggests = $$(".mw-searchSuggest-link");

    public void openPage() {
        $(".main-top").$(byTitle("Портал:Обзор")).click();
    }

    public void openTab(String tab, String name) {
        portalPage.$(byText(tab)).click();
        pageHeader.shouldHave(text(name));
    }

    public void switchTab(MenuItem enumWikipedia) {
        if (enumWikipedia != MenuItem.PORTALS) {
            $(byTitle(enumWikipedia.getTab())).click();
            pageHeader.shouldHave(text(enumWikipedia.getTab()));
        } else {
            pageHeader.shouldHave(text(enumWikipedia.getTab()));
        }
    }

    public void searchByMethodSource(int searchText, int index, String title) {
        searchField.sendKeys(String.valueOf(searchText));
        searchSuggests.get(index).click();
        pageHeader.shouldHave(text(title));
    }
}
