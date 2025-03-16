package com.softtest.unix;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class UnixPage {
    @Step("Opened Unix page")
    public String titleUnixPage(){
       return $x("//h1[contains(.,'Linux/Unix Tutorial')]").getText();
    }
}
