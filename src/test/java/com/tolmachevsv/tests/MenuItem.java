package com.tolmachevsv.tests;

public enum MenuItem {
    BEGINNERS("Википедия:Помощь начинающим"),
    COMMUNITY("Википедия:Страницы сообщества"),
    PORTALS("Портал:Обзор"),
    FAVORITE("Портал:Избранное содержание"),
    PROJECTS("Википедия:Проекты"),
    REQUESTS("Википедия:Запросы"),
    ASSESSMENT("Википедия:Оценивание");

    private String tab;

    MenuItem(String tab) {
        this.tab = tab;
    }

    public String getTab() {
        return tab;
    }
}
