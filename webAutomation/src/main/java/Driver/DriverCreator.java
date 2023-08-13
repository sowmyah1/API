package Driver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public abstract class DriverCreator {

    public WebDriver create(String browser) {
        browser = setDefaultBrowser(browser);
        switch (browser.toLowerCase()) {
            case "firefox":
                return new FirefoxDriverManager().create();
            case "edge":
                return new EdgeDriverManager().create();
            default:
                return new ChromeDriverManager().create();
        }
    }

    private String setDefaultBrowser(String browser) {
        if(Objects.isNull(browser) || browser.isEmpty()) {
            browser = "chrome";
        }
        return browser;
    }


    public abstract WebDriver create();
}