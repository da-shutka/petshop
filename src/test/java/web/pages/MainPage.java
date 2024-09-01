package web.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    @Step("Открыть главную страницу https://www.rigla.ru/")
    public void openPage() {
        open("/");
        $("h1").shouldHave(text("Онлайн-аптека «Ригла»"));
        sleep(5000);
    }
}