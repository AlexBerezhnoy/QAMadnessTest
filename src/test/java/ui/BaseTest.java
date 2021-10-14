package ui;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    static  {
        Configuration.baseUrl = "https://neboley.dp.ua/";
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
    }

    @BeforeMethod
    public void setUp() {
        open(Configuration.baseUrl);
    }
}


