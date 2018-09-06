package csku.lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTestAcountManager {

    AcountManager acountManager ;
    Acount acount;
    int initbalance = 500;

    @BeforeEach
    void init(){
        acount = new Acount(500);
        acountManager = new AcountManager(acount);
    }
    @Test
    void testinpurtSTRminus(){
        acountManager.manageAcount("-20");
        assertEquals(480,acount.getBalanc());
    }
    @Test
    void testinputSTRplus(){
        acountManager.manageAcount("+150");
        assertEquals(650,acount.getBalanc());
    }
    @Test
    void testShowOutput(){
        assertEquals("your balance is 500.0",acountManager.showLedger());
    }
}
