package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ContactsTab {
    private final SelenideElement massageName = $(By.xpath("//*[@id=\"__next\"]/div[5]/main/div[1]/section/div[2]/div[4]/div/form/div[1]/div[1]/div/input")).shouldBe(Condition.exist, Duration.ofSeconds(20));
    private final SelenideElement massageMail = $(By.xpath("//*[@id=\"__next\"]/div[5]/main/div[1]/section/div[2]/div[4]/div/form/div[1]/div[3]/div/input")).shouldBe(Condition.exist, Duration.ofSeconds(20));

    private final SelenideElement massageCompany = $(By.xpath("//*[@id=\"__next\"]/div[5]/main/div[1]/section/div[2]/div[4]/div/form/div[1]/div[4]/div/input")).shouldBe(Condition.exist, Duration.ofSeconds(20));
    private final SelenideElement massageComment = $(By.xpath("//*[@id=\"__next\"]/div[5]/main/div[1]/section/div[2]/div[4]/div/form/div[2]/textarea")).shouldBe(Condition.exist, Duration.ofSeconds(20));


    private final SelenideElement checkMailFooter = $(By.xpath("//*[@id=\"__next\"]/div[5]/main/div[1]/footer/div[1]/div[2]/div[1]/a[2]"));

    private final SelenideElement checkVKFooter = $(By.xpath("//*[@id=\"__next\"]/div[5]/main/div[1]/footer/div[1]/div[2]/div[2]/div/div[2]"));

    private final SelenideElement checkTelegramFooter = $(By.xpath("//*[@id=\"__next\"]/div[5]/main/div[1]/footer/div[1]/div[2]/div[2]/div/div[3]/a/span/span[1]"));
/*

    private final SelenideElement scrollDown = $(By.xpath("//*[@id=\"Header\"]"));
*/

    public void massageInfo() {
   /*     scrollDown.scrollTo();*/
        massageName.setValue("Aleksandr");
        massageMail.setValue("test@mail.ru");
        massageComment.setValue("Test");
        massageCompany.setValue("Test");
    }

    public void checkFooter() {
        checkMailFooter.shouldBe(Condition.visible, Duration.ofSeconds(20));
        checkTelegramFooter.shouldBe(visible);
        checkVKFooter.shouldBe(visible);
    }
}
