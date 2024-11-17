package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement projects = $(By.xpath("//*[@id=\"Header\"]/div/nav/a[1]/span")).shouldBe(Condition.visible, Duration.ofSeconds(15));


    public ProjectsTab projectsTab() {
        projects.click();
        return new ProjectsTab();
    }


}
