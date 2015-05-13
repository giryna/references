@test_tag @test_tag2

Feature: Some sample feature
  As a user I want to open some link
  So I can check if some element is there

  Background:
    Given I visit "https://www.google.com/" url

  Scenario: Check if a button is there
    When I enter "help" text into "//input[@id='lst-ib']" element
    And I wait 3 seconds
    Then I should see ".//*[@id='center_col']" element