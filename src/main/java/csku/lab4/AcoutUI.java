package csku.lab4;

import java.util.Scanner;

public class AcoutUI {
    public void start(){
        System.out.println("Ledger start\n" +
                "type \"+\" for income \n" +
                "type \"-\" for expenses \n" +
                "example +500 mean income500\n" +
                "        -200 mean epenses200\n" +
                "type x to show balance\n" +
                "type stop to stop program");

        Scanner in = new Scanner(System.in);
        Acount acountUser = new Acount();
        AcountManager acountManager = new AcountManager(acountUser);
        while (true){
            String inputStr = in.nextLine();
            if(inputStr.equals("x")){
                System.out.println(acountManager.showLedger());
            }else if(inputStr.equals("stop")){
                break;
            }
            else {
            acountManager.manageAcount(inputStr);
            }
        }

    }
}
