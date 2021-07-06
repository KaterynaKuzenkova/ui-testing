import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class EpamHomePage extends TestBaseSetup {


    private final By locationSelectorButton = By.xpath("//button[@class='location-selector__button']");
    private final By ukraineSelectorButton = By.xpath("//a[contains(@class, 'location-selector__link') and contains(@lang, 'uk')]");
    private final By languageVerificationPath = By.xpath("/html");
    private final By europeButton = By.xpath("//a[contains(@class, 'tabs__link js-tabs-link active') and text() = 'EMEA']");
    private final By arrowButton = By.xpath("//div[@class='owl-nav']/button[contains(@class, 'owl-prev') and text()='Previous']");
    private final By ukraineButton = By.xpath("//div[@class='owl-item active']/div/button/div[contains(@class, 'locations-viewer__country-title') and text()='Україна']");
    @FindBy(xpath = "//div[@class='tabs__item js-tabs-item active']/div/div/div/div[@class='owl-stage-outer']")
    List<WebElement> countriesBlockList;
    private final By lvivLocationElement = By.xpath("//h5[contains(@class, 'locations-viewer__office-name') and text()='Львів']");
    private final By lvivLocationNumber = By.xpath("//a[contains(@class, 'locations-viewer__phone') and text()='+38-044-390-5457']");

    public void openHomePage() {

        getDriver().get(getHomePageUrl());
    }

    public void validatePageURL() {
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.epam-group.ru/", "URLs are not matching");
    }

    public void clickRegionAndLanguageButton() {
        getDriver().findElement(locationSelectorButton).click();
    }

    public void changeRegionToUkraine() throws InterruptedException {
        Thread.sleep(2000);
        getDriver().findElement(ukraineSelectorButton).click();
    }

    public void validatePageLanguage() throws InterruptedException {
        Thread.sleep(2000);
        String currentLanguage = getDriver().findElement(languageVerificationPath).getAttribute("lang");
        Assert.assertEquals(currentLanguage, "uk-UA", "language on the page is not correct");
    }

    public void validateIfEuropeButtonIsVisible() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(true, getDriver().findElement(europeButton).isDisplayed());
    }

    public void checkThatIconIsUkraine() throws InterruptedException {
        Thread.sleep(2000);
        try {
            getDriver().findElement(arrowButton).click();
        } catch (WebDriverException e) {// getDriver().findElement(arrowButton).wait(getDriver().findElement(ukraineButton).isDisplayed());
        }
    }

    public void clickUkraineButton() {

    }

    public void validateIfLvivLocationIsVisible() {
        Assert.assertEquals(true, getDriver().findElement(lvivLocationElement).isDisplayed());
    }

    public void validateIfLvivLocationNumberIsVisible() {
        Assert.assertEquals(true, getDriver().findElement(lvivLocationNumber).isDisplayed());
        getDriver().close();
    }

}
