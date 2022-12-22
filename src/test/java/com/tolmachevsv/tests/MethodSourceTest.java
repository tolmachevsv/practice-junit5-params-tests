package com.tolmachevsv.tests;

import com.tolmachevsv.pages.WikipediaMainPage;
import com.tolmachevsv.pages.WikipediaPortalsPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MethodSourceTest {

    WikipediaMainPage wikipediaMainPage = new WikipediaMainPage();
    WikipediaPortalsPage wikipediaPortalsPage = new WikipediaPortalsPage();

    static Stream<Arguments> searchWithWikipedia() {
        return Stream.of(
                Arguments.of(
                        777, 5, "Портвейн 777"
                ),
                Arguments.of(
                        50, 1, "50 Cent"
                )
        );
    }

    @MethodSource()
    @ParameterizedTest(name = "Settings in Wikipedia")
    void searchWithWikipedia(int searchText, int index, String title) {
        wikipediaMainPage.openPage();
        wikipediaPortalsPage.openPage();
        wikipediaPortalsPage.searchByMethodSource(searchText, index, title);
    }
}
