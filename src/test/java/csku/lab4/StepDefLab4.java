package csku.lab4;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefLab4 {
    Acount acount;
    AcountManager acountManager;


    @Given("a account with balance (\\d+) exists")
    public void a_customer_with_balance_exits(int balance){acount = new Acount(balance);}

    @Given("a accountmanager manage a account with (.*) balance exists")
    public void a_accountmanager_manage_a_account(int balance){
        acount = new Acount(balance);
        acountManager = new AcountManager(acount);}

    @When("I withdraw (.*) from account")
    public void I_withdraw_form_acount(double amount){acount.withdraw(amount);}

    @When("I type input string  (.*)")
    public void I_type_input_string(String inpstr){acountManager.manageAcount(inpstr);}

    @When("I deposit (.*) to account")
    public void I_deposit_to_account(int amount){acount.deposit(amount);}

//    @When("I overdraw (.*) from account")
//    public void I_overdraw_from_acount(double amount){acount.withdraw(amount);}

    @Then("my account balance is (.*)")
    public void my_account_balance_is(double balance) {
        assertEquals(balance, acount.getBalanc());
    }


}
