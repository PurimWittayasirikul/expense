package csku.lab4;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class UnitTestAcount {
    Acount acount1;
    int initBalanc = 500;

    @BeforeEach
    void init(){
         acount1 = new Acount(initBalanc);
    }

    @Test
     void testDeposit(){

        acount1.deposit(100);
        assertEquals(600,acount1.getBalanc());
    }



    @Test
    void testWithdraw(){
        acount1.withdraw(50);
        assertEquals(450,acount1.getBalanc());
    }
    @Test
    void testWithdrawMoreBalance(){
        acount1.withdraw(600);
        assertEquals(500,acount1.getBalanc());
    }



}
