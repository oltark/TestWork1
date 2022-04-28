import Hooks.WebHooks;
import PageObject.BaseSteps.BaseSteps;
import org.junit.jupiter.api.Test;

import static PageObject.BaseSteps.BaseSteps.*;
import static com.codeborne.selenide.Selenide.open;

public class SomeTest extends WebHooks {
    @Test
    public void Test1(){
        open("https://edujira.ifellow.ru/login.jsp");
        clicktoSmth();

    }
    @Test
    public void Test2(){
        authorizeAssertion();
    }

    @Test
    public void Test3(){
        hrefTasksClick();
        issueCounting();
    }

    @Test
    public void Test4() {
        taskTestSelenium();
    }
    @Test
    public void Test5() {
        createBugReport();
    }

}
