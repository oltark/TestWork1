import Hooks.WebHooks;
import org.junit.jupiter.api.Test;

import static PageObject.BaseSteps.LoginSteps.login;
import static com.codeborne.selenide.Selenide.open;

public class AutoTest extends WebHooks {


    @Test
    public void Test1(){
        open("https://edujira.ifellow.ru/login.jsp");
        login();

    }

  /*  @Test
    public void Test2(){
        open("https://edujira.ifellow.ru/login.jsp");
        login();
        mainPageMethod();

    }

   // @Test
    public void Test3(){
        open("https://edujira.ifellow.ru/login.jsp");
        login();
        mainPageMethod();
        projectPageMethod();

    }
   // @Test
    public void Test4() {
        open("https://edujira.ifellow.ru/login.jsp");
        login();
        mainPageMethod();
        projectPageMethod();
        taskPageMethod();
   */
    }


