package csku.lab4;

public class Transaction {

    private String owner,type,date,detail;

    private double amount;


    public Transaction(String owner, String date, double amount,char type, String detail) {
        this.owner = owner;
        this.date = date;
        this.amount = amount;
        this.detail = detail;
        if('-'==type){
            this.type ="withdraw";
        }else {
            this.type ="deposit";
        }

    }

    public String getTramsactionwithformat(){
        return type+" "+amount+" by: "+owner+" date: "+date+" detail: "+detail;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
