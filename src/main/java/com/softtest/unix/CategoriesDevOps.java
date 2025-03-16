package com.softtest.unix;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class CategoriesDevOps {

    @Step("select the button UNIX")
    public UnixPage UNIXButton() {
        $x("//a[contains(text(),'UNIX')]").click();
        return new UnixPage();
    }
}
