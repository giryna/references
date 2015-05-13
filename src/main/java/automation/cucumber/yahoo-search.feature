@sampling_admin @sampling

Feature: Some sample feature
  As a user I want to open some link
  So I can check if some element is there

  Background:
    Given I visit "https://www.yahoo.com/" url

  Scenario: Check if a button is there
    When I enter "help" text into "//*[@id='p_13838465-p']" element
    And I wait 3 seconds
    Then I should see "//*[@id='main']" element