package com.Sachin;

public class Main {
    public static void main(String[] args){
        //Let's execute the code by calling the constructors

        BankName bankForBranch=new BankName("Goliath National Bank");

        if(bankForBranch.addnewBranch("Life_Insurance"))
            System.out.println("New branch created");



        bankForBranch.addCustomer("Life_Insurance","Sam",100.50);
        bankForBranch.addCustomer("Life_Insurance","Tim",80.67);
        bankForBranch.addCustomer("Life_Insurance","Derek",90.12);

        bankForBranch.addnewBranch("Downtown");

        bankForBranch.addCustomer("Downtown","Bob",67.98);
        bankForBranch.addTransaction("Life_Insurance","Sam",17.98);
        bankForBranch.addTransaction("Life_Insurance","Sam",87.58);
        bankForBranch.addTransaction("Life_Insurance","Sam",89.98);
        bankForBranch.addTransaction("Life_Insurance","Derek",09.98);

        bankForBranch.showDetailsList("Life_Insurance",true);
        bankForBranch.showDetailsList("Downtown",true);

        bankForBranch.addnewBranch("Punjab Branch");
       bankForBranch.addCustomer("Punjab Branch","Hemant",30.12);



    }
}
