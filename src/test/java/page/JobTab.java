package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class JobTab {
    private final SelenideElement contacts = $(By.xpath("//*[@id=\"Header\"]/div/nav/a[4]/span")).shouldBe(Condition.visible, Duration.ofSeconds(20));


    public ContactsTab contacts() {
        contacts.click();
        return new ContactsTab();
    }
}
