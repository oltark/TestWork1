package PageObject.BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FindElements {
   // public static SelenideElement inputPath = $x("//input[@aria-label='Запрос']");
   // public static SelenideElement findButton = $x("//span[text()='Найти']/parent::button");

    public static SelenideElement loginPath = $x("//input[@id='login-form-username']");
    public static SelenideElement passwordPath = $x("//input[@id='login-form-password']");
    public static SelenideElement enterPath = $x("//input[@id='login-form-submit']");
    public static SelenideElement authorizeAssert=$x("//a[@title='Пользовательский профиль для otarkhanov']");
    public static SelenideElement issueCount = $x("(//div[@class='ghx-issue-count'])[2]");
    public static SelenideElement hrefProject = $x("(//a[@href='/browse/TEST'])[1]");
    public static SelenideElement hrefTestProject = $x("//a[@id='admin_main_proj_link_lnk']");
    public static SelenideElement tasks = $x("//span[@class='aui-icon aui-icon-large agile-icon-plan aui-iconfont-backlog']");
    public static SelenideElement testSeleniumTask = $x("//a[contains(@href,'/browse/TEST-374')]");
    public static SelenideElement statusSeleniumTask = $x("//span[@id='status-val']");
    public static SelenideElement versionSeleniumTask = $x("(//span[@class='shorten'])[1]");

    public static SelenideElement createBugReportButton = $x("//a[@id='create_link']");

    public static SelenideElement issueType = $x("//div[@id='issuetype-single-select']");

    public static SelenideElement summaryInput = $x("//input[@id = 'summary']");

    //public static SelenideElement description = $x("");

    public static SelenideElement createIssueSubmit = $x("//input[@id = 'create-issue-submit']");




       // public static SelenideElement issueCount = $x("");
}
