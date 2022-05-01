package PageObject.BaseElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class FindElements {


    public static SelenideElement issueCount = $x("(//div[@class='ghx-issue-count'])[3]");
    public static SelenideElement hrefProject = $x("(//a[@href='/browse/TEST'])[1]");
    public static SelenideElement hrefTestProject = $x("//a[@id='admin_main_proj_link_lnk']");
    public static SelenideElement tasks = $x("//span[@class='aui-icon aui-icon-large agile-icon-plan aui-iconfont-backlog']");
    public static SelenideElement findTask =$x("//input[@aria-label='Поиск задач']");
    public static SelenideElement testSeleniumTask = $x("//div[@title=\"TestSelenium\"]");
    public static SelenideElement statusSeleniumTask = $x("//span[@id='status-val']");
    public static SelenideElement versionSeleniumTask = $x("(//span[@class='shorten'])[1]");
    public static SelenideElement createBugReportButton = $x("//a[@id='create_link']");
    public static SelenideElement issueType = $x("//div[@id='issuetype-single-select']");
    public static SelenideElement summaryInput = $x("//input[@id = 'summary']");
    public static SelenideElement createIssueSubmit = $x("//input[@id = 'create-issue-submit']");
    public static SelenideElement tasksHref = $x("//a[@id='find_link']");
    public static SelenideElement reportedByMeTasks = $x(" //a[@id='filter_lnk_reported_lnk']");
    public static SelenideElement needToDoStatus = $x("(//span[@class='trigger-label'])[4]");
    public static SelenideElement inWorkStatus = $x("(//span[@class='trigger-label'])[5]");
    public static SelenideElement closedStatusDropdown = $x("( //span[@class='dropdown-text'])[2]");
    public static SelenideElement closedStatus= $x("(//aui-item-link[@class='issueaction-workflow-transition'])[1]");


   // public static SelenideElement iframe = $x("//iframe[@id='mce_0_ifr']");
  // public static SelenideElement iframe = $x("//div[@class='tox tox-tinymce jira-editor-container']");
   public static SelenideElement description = $x("//textarea[@id='description']");
   public static SelenideElement descriptionTxtButton= $x("(//button[@class='aui-button' and @aria-pressed='true'])[1]");

}
