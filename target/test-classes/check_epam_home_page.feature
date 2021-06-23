
@Issue=1
@TmsLink=TC1
Feature: check locations functionality

  Scenario: Lviv location is visible
    When epam home page is opened
    And region and language button is clicked
    Then home page language should be changed to Ukrainian

    When Europe button is clicked on Our offices part of the page
    And  Ukraine icon is appeared on Our offices part of the page
    Then Ukraine button is clicked
    And Lviv location is visible
    And Lviv location phone number is visible