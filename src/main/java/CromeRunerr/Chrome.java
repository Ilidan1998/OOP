package CromeRunerr;

import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class Chrome {
    @BeforeTest
    public void test(){
        open("https://ee.ge/");

    }}
