package com.kodilla.testing2.facebook;
import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES_BUTTON = "//button[@title='Akceptuj wszystko']";
    public static final String XPATH_CREATE_ACCOUNT_BUTTON = "//a[@data-testid='open-registration-form-button']";
    public static final String NAME_DAY_DROPDOWN = "day";
    public static final String NAME_MONTH_DROPDOWN = "month";
    public static final String NAME_YEAR_DROPDOWN = "year";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        acceptCookies(driver);
        clickCreateAccount(driver);
        fillDateOfBirth(driver, "10", "May", "1990");
    }

    private static void acceptCookies(WebDriver driver) {
        WebElement cookiesButton = driver.findElement(By.xpath(XPATH_COOKIES_BUTTON));
        cookiesButton.click();
    }

    private static void clickCreateAccount(WebDriver driver) {
        WebElement createAccountButton = driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT_BUTTON));
        createAccountButton.click();
    }

    private static void fillDateOfBirth(WebDriver driver, String day, String month, String year) {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(NAME_DAY_DROPDOWN)));

        selectFromDropdown(driver, NAME_DAY_DROPDOWN, day);
        selectFromDropdown(driver, NAME_MONTH_DROPDOWN, month);
        selectFromDropdown(driver, NAME_YEAR_DROPDOWN, year);
    }

    private static void selectFromDropdown(WebDriver driver, String dropdownName, String optionValue) {
        WebElement dropdown = driver.findElement(By.name(dropdownName));
        Select select = new Select(dropdown);
        select.selectByVisibleText(optionValue);
    }
}