package com.tolmachevsv.tests;

import com.tolmachevsv.pages.WikipediaMainPage;
import com.tolmachevsv.pages.WikipediaPortalsPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvSourceTest {

    WikipediaMainPage wikipediaMainPage = new WikipediaMainPage();
    WikipediaPortalsPage wikipediaPortalsPage = new WikipediaPortalsPage();

    @CsvSource(value = {
            "Сообщество, Страницы сообщества",
            "Избранное, Избранное содержание"
    })
    @ParameterizedTest(name = "Open tabs {0} in Wikipedia")
    void WikipediaSearchWithCsvSourceTest(String tab, String name) {
        wikipediaMainPage.openPage();
        wikipediaPortalsPage.openPage();
        wikipediaPortalsPage.openTab(tab, name);
    }
}
