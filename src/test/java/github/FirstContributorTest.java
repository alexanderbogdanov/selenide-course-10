package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FirstContributorTest {

    @Test

    void firstContributorShouldBeAndreiSolntsev() {
        // Открыть страницу репозитория селенида
        open("https://github.com/selenide/selenide");
        // Навести курсор на первый элемент в обл. Contributors
//        $(".Layout-sidebar").$(byText("Contributors")).closest("div")
//                .$$("ul li").first().hover();
        $$(".Layout-sidebar .BorderGrid-row").find(text("Contributors"))
                .$$("ul li").first().hover();
        // В появившемся окошке(overlay) текст Andrei Solntsev
        $$(".Popover-message").find(visible).shouldHave(text("Andrei Solntsev"));

    }
}
