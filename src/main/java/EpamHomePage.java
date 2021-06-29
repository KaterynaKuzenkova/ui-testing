import org.openqa.selenium.By;
import org.testng.Assert;

public class EpamHomePage extends TestBaseSetup {


    private final By locationSelectorButton = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[2]/div/button");
    private final By ukraineSelectorButton = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/header/div/ul/li[2]/div/nav/ul/li[8]/a");
    private final By languageVerificationPath = By.xpath("/html");
    private final By europeButton = By.xpath("//*[@id=\"id-b5812e2d-88b1-359c-a737-eafe8d08343f\"]/div[1]/div/div[1]/a");
    private final By arrowButton = By.xpath("//*[@id=\"id-b5812e2d-88b1-359c-a737-eafe8d08343f\"]/div[2]/div/div/div[1]/div[2]/button[1]");
    private final By ukraineButton = By.xpath("//*[@id=\"id-b5812e2d-88b1-359c-a737-eafe8d08343f\"]/div[2]/div/div/div[1]/div[1]/div/div[23]/div/button/div[1]");

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
        getDriver().findElement(europeButton).isDisplayed();
    }

    public void checkThatIconIsUkraine() throws InterruptedException {
        Thread.sleep(2000);
        // getDriver().findElement(arrowButton).wait(getDriver().findElement(ukraineButton).isDisplayed());
    }

    public void clickUkraineButton() {

    }

    public void validateIfLvivLocationIsVisible() {
    }

    public void validateIfLvivLocationNumberIsVisible() {

    }

}
