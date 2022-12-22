package com.tolmachevsv.tests;

import com.tolmachevsv.pages.WikipediaMainPage;
import com.tolmachevsv.pages.WikipediaPortalsPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumSourceTest {

    WikipediaMainPage wikipediaMainPage = new WikipediaMainPage();
    WikipediaPortalsPage wikipediaPortalsPage = new WikipediaPortalsPage();

    @EnumSource(MenuItem.class)
    @ParameterizedTest(name = "Enum search in Wikipedia {0}")
    public void WikipediaSearchWithEnumSource(MenuItem enumWikipedia) {
        wikipediaMainPage.openPage();
        wikipediaPortalsPage.openPage();
        wikipediaPortalsPage.switchTab(enumWikipedia);
    }
}
