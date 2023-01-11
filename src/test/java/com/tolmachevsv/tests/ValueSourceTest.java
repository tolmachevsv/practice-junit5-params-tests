package com.tolmachevsv.tests;

import com.tolmachevsv.pages.WikipediaMainPage;
import com.tolmachevsv.pages.WikipediaTitlePage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValueSourceTest {

    static WikipediaMainPage wikipediaMainPage = new WikipediaMainPage();
    static WikipediaTitlePage wikipediaTitlePage = new WikipediaTitlePage();

    @ValueSource(strings = {
            "Теория графов",
            "Щелкунчик",
            "Толстой"
    })
    @ParameterizedTest(name = "Search title {0} in Wikipedia")
    void WikipediaSearchWithValueSourceTest(String text) {
        wikipediaMainPage.openPage();
        wikipediaMainPage.searchRequiredTitle(text);
        wikipediaTitlePage.checkIfCorrectTitle(text);
    }
}
