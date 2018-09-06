
Feature: deposit

  Background:
    Given a account with balance 500 exists

    Scenario: Deposit amount to account
      When I deposit 200 to account
      Then my account balance is 700