package com.softtest.unix;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class CategoriesMenu {
    @Step("get Attribute DevOps Value")
    public CategoriesDevOps DevOpsButton() {
        $x("//div[@id='categories']/div/div/ul/li[4]").click();
        return new CategoriesDevOps();

}
}
