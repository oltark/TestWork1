import Hooks.WebHooks;
import org.junit.jupiter.api.Test;

import static PageObject.BaseSteps.BugReportPageSteps.*;
import static PageObject.BaseSteps.LoginSteps.*;
import static PageObject.BaseSteps.MainPageSteps.*;
import static com.codeborne.selenide.Selenide.open;

public class AutoTest extends WebHooks {


    @Test
    public void Test1(){
        open("https://edujira.ifellow.ru/login.jsp");
        checkPageOpened();
        login();
        authorizeCheck();
    }

    @Test
    public void Test2(){
        open("https://edujira.ifellow.ru/login.jsp");
        checkPageOpened();
        login();
        hrefProject();
        numberOfTasks();
        testSeleniumTask();
    }

    @Test
    public void Test3(){
        open("https://edujira.ifellow.ru/login.jsp");
        checkPageOpened();
        login();
        createBugReport();
       // changeStatus();
    }


    }


