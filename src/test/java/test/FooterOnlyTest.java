package test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import page.MainPage;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FooterOnlyTest {

    @BeforeEach
    void setUP() {
        open("https://only.digital/");
        $(By.xpath("//*[@id=\"Header\"]/div/nav")).shouldBe(Condition.visible, Duration.ofSeconds(30));
    }

    @Test
    public void TestFooterTab() {
        var mainPage = new MainPage();
        var projectsTab = mainPage.projectsTab();
        var companyTab = projectsTab.company();
        var jobTab = companyTab.job();
        var contactsTab = jobTab.contacts();

        contactsTab.massageInfo();
        contactsTab.checkFooter();


    }


}