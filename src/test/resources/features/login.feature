@regression
Feature: Login Functionality

  @pozitiveTest
  Scenario: Positive Login Test
    Given User is on the login page
    When User taps on sign in button
    When User enters "username" and "password"
    When User taps on sign is button to login
    When User taps on back button
    Then Validate that username is visible on the board

