package csku.lab4;

public class AcountManager {

    private Acount acount;

    public AcountManager(Acount acount) {
        this.acount =acount;
    }
    public void manageAcount(String inputStr){
        int money = Integer.parseInt(inputStr.substring(1));

        if ('-'==inputStr.charAt(0)){
//            System.out.println("-");
            acount.withdraw(money);
        }else {
//            System.out.println("+");
            acount.deposit(money);
        }
    }
    public String showLedger(){
        return "your balance is "+acount.getBalanc();
    }
}
