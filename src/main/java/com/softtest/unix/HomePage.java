package com.softtest.unix;


import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import lombok.Getter;
import static com.softtest.unix.PropertyUtil.getHomePageUrl;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class HomePage extends BasePage {

    @Step("Opened home page")
    public HomePage open()  {
try{
        Selenide.open(getHomePageUrl());
        return this;

    } catch (Exception e) {
    Selenide.open(getHomePageUrl());
    return this;
    //throw new RuntimeException(e);
}}
    @Step("get Attribute category Value")
        public CategoriesMenu category() {
        $x("//button[contains(.,'Category')]").click();
        return new CategoriesMenu();
    }

}
