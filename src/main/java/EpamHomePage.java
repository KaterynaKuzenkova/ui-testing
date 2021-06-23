import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class EpamHomePage extends TestBaseSetup {

    // @FindBy(className = "/html/body/div[1]/div[1]/div/div/div[2]/button/span")//span[text()='Принять']")
    //  WebElement cookiesAccepting;

    @FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[2]/div/button")//"//location-selector-ui header__control")
    WebElement locationSelectorButton;

    @FindBy(xpath = "//location-selector__link[@lang='uk']")
    WebElement ukraineSelectorButton;

    @FindBy(xpath = "/no-touchevents no-focus[@lang='uk-UA']")
    WebElement languageVerificationPath;

    @FindBy(xpath = "//tabs__link js-tabs-link active[@data-item ='0']")
    WebElement europeButton;

    //public void setCookiesAccepting() {
    //     cookiesAccepting.click();
    // }

    public void openHomePage() {
        getDriver().get(getHomePageUrl());
    }

    public void validatePageURL() {
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.epam-group.ru/", "URLs are not matching");
    }

    public void clickRegionAndLanguageButton() {
        //   setCookiesAccepting();
        getDriver().findElement(locationSelectorButton).click();
        locationSelectorButton.click();
    }

    public void changeRegionToUkraine() {
        ukraineSelectorButton.click();
    }

    public void validatePageLanguage() {
        //String currentLanguage = languageVerificationPath.
    }

    public void clickEuropeButton() {
        europeButton.click();
    }

    public void checkThatIconIsUkraine() {

    }

    public void clickUkraineButton() {

    }

    public void validateIfLvivLocationIsVisible() {
    }

    public void validateIfLvivLocationNumberIsVisible() {

    }

}
