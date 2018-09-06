Feature: inputformat

  Background:
    Given a accountmanager manage a account with 300 balance exists

  Scenario: type + for income
    When I type input string  +200
    Then my account balance is 500

  Scenario: type - for withdraw
    When  I type input string  -150
    Then my account balance is 150