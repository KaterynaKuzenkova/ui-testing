import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EpamHomePageStepdefs extends EpamHomePage {
    @When("epam home page is opened")
    public void epamHomePageIsOpened() {
        openHomePage();
        validatePageURL();
    }

    @When("region and language button is clicked")
    public void regionAndLanguageButtonIsClicked() {
        clickRegionAndLanguageButton();
        changeRegionToUkraine();
    }

    @Then("home page language should be changed to Ukrainian")
    public void homePageLanguageShouldBeChangedToUkrainian() {

        validatePageLanguage();
    }

    @When("Europe button is clicked on Our offices part of the page")
    public void europeButtonIsClickedOnOurOfficesPartOfThePage() {

        clickEuropeButton();
    }

    @When("Ukraine icon is appeared on Our offices part of the page")
    public void ukraineIconIsAppearedOnOurOfficesPartOfThePage() {

        checkThatIconIsUkraine();
    }

    @Then("Ukraine button is clicked")
    public void ukraineButtonIsClicked() {

        clickUkraineButton();
    }

    @And("Lviv location is visible")
    public void lvivLocationIsVisible() {

        validateIfLvivLocationIsVisible();
    }

    @And("Lviv location phone number is visible")
    public void lvivLocationPhoneNumberIsVisible() {

        validateIfLvivLocationNumberIsVisible();
    }
}
