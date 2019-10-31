package day2_webdriver_basics;

public class callWebDriverfactory {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver(browsereType:"chrome");

        driver.get ("https://www.google.com");

    }


}
