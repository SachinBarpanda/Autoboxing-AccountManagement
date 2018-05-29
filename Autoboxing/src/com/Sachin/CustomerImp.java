package com.Sachin;
//Customer is the most important class in the project

import java.util.ArrayList;

public class CustomerImp {
    private String nameOfCustomer;
    private ArrayList<Double> transaction;

    public CustomerImp(String nameOfCustomer,Double initialAmount){
        this.nameOfCustomer=nameOfCustomer;
        //Let's make arrayList to be ready to be initialised
        this.transaction= new ArrayList <>();
        addTransaction(initialAmount);
    }
    public void addTransaction(Double amount){
        this.transaction.add(amount);
    }

    public String getNameOfCustomer(){
        return nameOfCustomer;
    }

    public ArrayList <Double> getTransaction(){
        return transaction;
    }
}

