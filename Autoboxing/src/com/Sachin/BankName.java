package com.Sachin;

import java.util.ArrayList;

public class BankName {
    private String name;
    private ArrayList<BranchName>branches;

    public BankName(String name){
        this.name=name;
        this.branches=new ArrayList <>();
    }
    public Boolean addnewBranch(String branchName){
        if(findBranch(branchName)==null){
            this.branches.add(new BranchName(branchName));
            return true;
        }
        return false;
    }
    //now we have to add customer to the branch
    //for that we have to link branch then that to customer

    public Boolean addCustomer(String branchName,String customerName,Double PreviousDeposite){
        //let's check whether the name of customer is there or not
        BranchName branchName1=findBranch(branchName);
        if(branchName1!=null){
            branchName1.AddnewCustomer(customerName,PreviousDeposite);
             return true;
        }
        return false;
    }

    public Boolean addTransaction(String branchName,String customerName,Double amountAdding){
        BranchName branchName1=findBranch(branchName);
        if(branchName1!=null){
            return branchName1.newTransactionAdd(customerName,amountAdding);
        }
        return false;
    }


    private BranchName findBranch(String Branches){
        //check each and every branch on the node
        for(int i=0;i<branches.size();i++){
            BranchName branchNameInside=this.branches.get(i);
            if(branchNameInside.getNameOfBranch().equals(Branches)){
            return branchNameInside;
            }
        }
        return null;
    }

    public Boolean showDetailsList(String branchName,Boolean showTransaction){
       //Show all the list of customer in the branch
       //Showing the branch first

       BranchName branchName1=findBranch(branchName);
       if(branchName1!=null){
        System.out.println("Customer details for branch "+branchName1.getNameOfBranch());

        //let's show all the customers name in the branch
        //Now I understand you cannot use all class variable in a method
        ArrayList<CustomerImp>CustomerInBranch;
           CustomerInBranch = branchName1.getCustomerList();

           //So now we have to check the customers in the list
        for(int i=0;i<CustomerInBranch.size();i++) {
            //let's do one thing
            CustomerImp CustomerBRName = CustomerInBranch.get(i);
            System.out.println("Customer: " + CustomerBRName.getNameOfCustomer() +
                    "at " + "[" + (i + 1) + "]");//show the number at which the name is stored
            //so now we have to check whether the programme shows output or not
            if (showTransaction) {
                System.out.println("Transaction");
                //Stored true then we have to call for the Double value
                ArrayList <Double> transaction = CustomerBRName.getTransaction();
                //Now we have to show many transaction of a single customer in the list
                for (int j = 0; j < transaction.size(); j++) {
                    System.out.println("Transaction number" + "[" + (j + 1 )+ "]" + " of Amount "
                            + transaction.get(j));
                }
             }
            }
            return true;
        }
           return false;


    }
}


















