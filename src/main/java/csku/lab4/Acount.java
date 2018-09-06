package csku.lab4;

public class Acount {

     int balanc =0;


    public Acount( int balanc) {
        this.balanc = balanc;
    }

    public Acount() {

    }

    public void deposit(double income){
        this.balanc += income;
    }
    public void withdraw(double income){
        if(balanc>=income)
        this.balanc -= income;
    }

    public double getBalanc() {
        return balanc;
    }



}
