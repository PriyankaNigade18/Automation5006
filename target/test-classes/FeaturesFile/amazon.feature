@All
Feature: Test Amazon application

  Background: 
    Given Opem amazon application with url "https://www.amazon.in"

  @homepage @regression
  Scenario: Test title of amazon home page
    When user get the title for amazon home page
    Then title should matched with amazon home page

  @bestSeller @regression @ignore
  Scenario: Test title of bestSellers page
    When User click on BestSellers option link
    When User get the title of bestseller page
    Then title should matched with bestsellers title

  @mobile @regression @ignore
  Scenario: Test title of Mobiles page
    When User click on Mobiles option link
    When User get the title of Mobile page
    Then title should matched with Mobiles title
