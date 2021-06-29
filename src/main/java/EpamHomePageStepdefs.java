import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EpamHomePageStepdefs extends EpamHomePage {
    @When("epam home page is opened")
    public void epamHomePageIsOpened() {
        openHomePage();
        validatePageURL();
    }

    @When("region and language button is clicked")
    public void regionAndLanguageButtonIsClicked() throws InterruptedException {
        clickRegionAndLanguageButton();
        changeRegionToUkraine();
    }

    @Then("home page language should be changed to Ukrainian")
    public void homePageLanguageShouldBeChangedToUkrainian() throws InterruptedException {
        validatePageLanguage();
    }

    @When("Europe button is visible on Our offices part of the page")
    public void europeButtonIsClickedOnOurOfficesPartOfThePage() throws InterruptedException {
        validateIfEuropeButtonIsVisible();
    }

    @When("Ukraine icon is appeared on Our offices part of the page")
    public void ukraineIconIsAppearedOnOurOfficesPartOfThePage() throws InterruptedException {

        checkThatIconIsUkraine();
    }

    @Then("Ukraine button is clicked")
    public void ukraineButtonIsClicked() {

        clickUkraineButton();
    }

    @Then("Lviv location is visible")
    public void lvivLocationIsVisible() {

        validateIfLvivLocationIsVisible();
    }

    @Then("Lviv location phone number is visible")
    public void lvivLocationPhoneNumberIsVisible() {

        validateIfLvivLocationNumberIsVisible();
    }
}
