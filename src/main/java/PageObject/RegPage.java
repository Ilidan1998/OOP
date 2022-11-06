package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class RegPage {
  public   SelenideElement reg = $(byClassName("btn-register")),
            regck = $(byText("რეგისტრაცია მარტივი, სწრაფი და უფასოა..")),
            saxeli =$(byId("firstName")),
            gvari = $(byId("lastName")),
            gmaili = $(byId("email")),
            paroli = $(byId("password")),
            paroli2=$(byId("confirmPassword")),
            dasturi = $(byId("singup"));
}
