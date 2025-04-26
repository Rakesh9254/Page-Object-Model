package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
    WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.name("q");

    public void enterSearchText(String searchText) {
        try {
            WebElement searchField = driver.findElement(searchBox);
            searchField.sendKeys(searchText);
            searchField.sendKeys(Keys.ENTER);  // Press Enter instead of clicking the button
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
