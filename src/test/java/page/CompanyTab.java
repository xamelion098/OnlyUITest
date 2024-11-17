package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class CompanyTab {
    private final SelenideElement job = $(By.xpath("//*[@id=\"Header\"]/div/nav/a[3]/span")).shouldBe(Condition.visible, Duration.ofSeconds(20));

    public JobTab job() {
        job.click();
        return new JobTab();
    }
}
