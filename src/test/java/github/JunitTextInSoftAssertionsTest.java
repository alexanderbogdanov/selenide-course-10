package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class JunitTextInSoftAssertionsTest {

    @Test

    void softAssertionsHasJUnitText() {

        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".markdown-body").shouldHave(Condition.text("Soft assertions"));
        $(".markdown-body ul li", 6).$("a").click();
        $(".highlight-source-java pre").shouldHave(Condition.text("public class Tests {\n" +
                "  @Test\n" +
                "  public void test()"));
    }
}
