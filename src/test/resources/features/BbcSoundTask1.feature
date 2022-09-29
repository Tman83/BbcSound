@todo
Feature: Sounds Homepage
  As a user
  I WANT to navigate to the Sounds page
  So THAT I can see and access all logos and content in one place

  Background:
    Given that I am on the BBC Sounds Homepage

  @test1
  Scenario: Radio 1 and Radio 2 logos are displayed in the Listen Live module on the Sounds Homepage
    When I select the Home logo
    Then I am on the Sounds Homepage
    And I can see the Radio 1 logo
    And I can see the Radio 2 logo

  @test2
  Scenario: Verify network station logos are displayed on the Stations page
    When I click the "View all Stations & Schedules" link
    Then I am on the ‘Stations’ page
    And I see 26 network station logos

  @test3
  Scenario: Selecting the Hip Hop category from the Categories module on the Sounds Homepage
    When I select Hip Hop, RnB & Dancehall Category
    Then I am on ‘Hip Hop, RnB & Dancehall’ Category page
    And I see the Category page is sorted by popular
