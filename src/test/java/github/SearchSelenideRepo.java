package github;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepo {

    @Test
    void shouldFindSelenideRepositoryInGithub() {
        // открыть страницу github.com
        open("https://github.com/");
        // ввести в поле поиска selenide и нажать Enter
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        // нажать на линк первого результата поиска
//        $$("ul.repo-list li").shouldHave(CollectionCondition.size(10));
        $$("ul.repo-list li").first().$("a").click();
        // check: в заголовке есть selenide/selenide
        $("h1").shouldHave(text("selenide / selenide"));

//        sleep(5000);
    }

}

