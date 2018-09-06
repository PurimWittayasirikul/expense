# new feature
# Tags: optional
    
Feature: withdraw

Background:
     Given a account with balance 200 exists

Scenario: Withdraw amount less than balance
    When I withdraw 50 from account
    Then my account balance is 150

Scenario: Withdraw amount more than balance
    When I withdraw 300 from account
    Then my account balance is 200



