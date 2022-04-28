package PageObject.BaseSteps;

import PageObject.BaseElements.FindElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static org.junit.Assert.assertTrue;

public class BaseSteps extends FindElements {
    public static void clicktoSmth(){
        loginPath.shouldBe(visible, Duration.ofSeconds(60)).click();
        loginPath.setValue("otarkhanov");
        passwordPath.shouldBe(visible, Duration.ofSeconds(60)).click();
        passwordPath.setValue("123Qwerty");
        enterPath.click();
    }
    public static void authorizeAssertion(){
        authorizeAssert.shouldBe(visible);
        authorizeAssert.shouldHave(attribute("title", "Пользовательский профиль для otarkhanov"));
    }
    public static void hrefTasksClick(){
        hrefProject.click();
        hrefTestProject.click();
        tasks.click();
    }
     public static void issueCounting(){
        System.out.print(issueCount.getText());
    }

    public static void taskTestSelenium(){
        testSeleniumTask.click();
        String actualStatusString = statusSeleniumTask.getText();
        System.out.println(actualStatusString);
        assertTrue(actualStatusString.contains("В РАБОТЕ"));
        String actualVersString = versionSeleniumTask.getText();
        System.out.println(actualVersString);
        assertTrue(actualVersString.contains("Version 2.0"));

    }

    public static void createBugReport(){

        createBugReportButton.click();
        issueType.click();
        summaryInput.shouldBe(visible, Duration.ofSeconds(60)).click();
        summaryInput.setValue("AutoTesting123");
        createIssueSubmit.click();
    }

}
