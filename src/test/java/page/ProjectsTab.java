package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class ProjectsTab {
    private final SelenideElement company = $(By.xpath("//*[@id=\"Header\"]/div/nav/a[2]/span")).shouldBe(Condition.visible, Duration.ofSeconds(20));

    public CompanyTab company() {
        company.click();
        return new CompanyTab();
    }
}
