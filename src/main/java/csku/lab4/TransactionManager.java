package csku.lab4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransactionManager {


    private List<Transaction> tlist = new ArrayList<>();


    public TransactionManager() {

    }
    public void manageTransaction(String inputStr, String owner, String detail){

        int money = Integer.parseInt(inputStr.substring(1));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        String date = dtf.format(localDate);
        char type = inputStr.charAt(0);

        tlist.add(new Transaction(owner,date,money,type,detail));
    }
    public String showTransaction(){
        StringBuilder strTc = new StringBuilder();
        for (Transaction t : tlist) {


            strTc.append((tlist.indexOf(t)+1)+".) "+ t.getTramsactionwithformat()+"\n");
        }
        return strTc.toString();
    }

    public void editTc(String strEdit){

        int indexTc = (strEdit.charAt(0)-'0')-1;
        List<String> arrStreditWithoutIndex = new ArrayList<>(Arrays.asList(strEdit.split(" ")));
        arrStreditWithoutIndex.remove(0);
        System.out.println(arrStreditWithoutIndex.toString());
        if (strEdit.charAt(1)=='1'){
            tlist.get(indexTc).setType(arrStreditWithoutIndex.get(0));
            arrStreditWithoutIndex.remove(0);
        }
        if (strEdit.charAt(2)=='1'){
            tlist.get(indexTc).setAmount(Double.parseDouble(arrStreditWithoutIndex.get(0)));
            arrStreditWithoutIndex.remove(0);
        }
        if (strEdit.charAt(3)=='1'){
            tlist.get(indexTc).setOwner(arrStreditWithoutIndex.get(0));
            arrStreditWithoutIndex.remove(0);
        }
        if (strEdit.charAt(4)=='1'){
            tlist.get(indexTc).setDate(arrStreditWithoutIndex.get(0));
            arrStreditWithoutIndex.remove(0);
        }
        if (strEdit.charAt(5)=='1'){
            tlist.get(indexTc).setDetail(arrStreditWithoutIndex.get(0));
            arrStreditWithoutIndex.remove(0);
        }
    }
}
