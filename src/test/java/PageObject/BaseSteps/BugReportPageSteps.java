package PageObject.BaseSteps;

import PageObject.BaseElements.BugReportElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;


public class BugReportPageSteps extends BugReportElements {

    public static void createBugReport(){

        createBugReportButton.shouldBe(visible, Duration.ofSeconds(60)).click();
        issueType.shouldBe(visible, Duration.ofSeconds(60)).click();
        summaryInput.shouldBe(visible, Duration.ofSeconds(60)).click();
        summaryInput.setValue("AutoTesting321");
        descriptionTxtButton.shouldBe(visible, Duration.ofSeconds(60)).click();
        description.shouldBe(visible, Duration.ofSeconds(60)).doubleClick();
        description.setValue("Description123");
        versionA.click();
        versionB.click();
        assignOnMe.click();
        createIssueSubmit.shouldBe(visible, Duration.ofSeconds(60)).click();
    }
    public static void changeStatus() {
        tasksHref.shouldBe(visible, Duration.ofSeconds(60)).click();
        reportedByMeTasks.shouldBe(visible, Duration.ofSeconds(60)).click();
        needToDoStatus.click();
        inWorkStatus.click();
        closedStatusDropdown.click();
        closedStatus.click();


    }




}
