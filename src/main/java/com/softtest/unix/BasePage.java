package com.softtest.unix;


import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public abstract class BasePage {

    @Step("Return to the previous page")
    public void goBack() {
        Selenide.back();
    }
}
