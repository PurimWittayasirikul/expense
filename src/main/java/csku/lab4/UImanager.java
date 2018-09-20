package csku.lab4;

import java.util.Scanner;

public class UImanager {
    public void start(){
        System.out.println("Ledger start\n" +
                "type \"+\" for income \n" +
                "type \"-\" for expenses \n" +
                "example +500 mean income500\n" +
                "        -200 mean epenses200\n" +
                "type x to show all transaction\n" +
                "type stop to stop program");

        Scanner in = new Scanner(System.in);
        TransactionManager transactionManager = new TransactionManager();
        while (true){
            System.out.println("type ...");
            String inputStr = in.nextLine();

            if(inputStr.equals("x")){
                System.out.println(transactionManager.showTransaction());
                System.out.println("if you want to edit type index and type for edit ex \"101000 300\" mean edit amount to 300 of transaction number1 .\nif not type no");
                String edit = in.nextLine();
                if(edit.equals("no")){

                }else {
                    transactionManager.editTc(edit);
                }
            }else if(inputStr.equals("stop")){
                break;
            }
            else {

                System.out.println("type owner");
                String owner = in.nextLine();
                System.out.println("type detail");
                String detail = in.nextLine();
                transactionManager.manageTransaction(inputStr,owner,detail);
            }

        }

    }
}
