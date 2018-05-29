package com.Sachin;

import java.util.ArrayList;

public class BranchName {
    //to store customers in branch we need Customers first so...
    private String nameOfBranch;
    //Now we can use the Class customerImp for Array List and
    // store each customer in separate branch
    public ArrayList<CustomerImp>customerList;

    BranchName(String nameOfBranch){
        this.nameOfBranch=nameOfBranch;
        this.customerList= new ArrayList <>();
    }
    public String getNameOfBranch(){
        return nameOfBranch;
    }

    //let's add a getter to get all customer name in the list
    public ArrayList<CustomerImp>getCustomerList(){
        return customerList;
    }


    public Boolean AddnewCustomer(String newCustomerName,Double amountPreviously){
        if(findPrevCustomer(newCustomerName)==null){
            //Then we will add new customer to the list
            //we add new for adding space for that on Array List
            customerList.add(new CustomerImp(newCustomerName,amountPreviously));
            return true;
        }
        else {
            return false;
        }
    }
    public Boolean newTransactionAdd(String prevCustomerName,Double amountDepositing){
        CustomerImp prevcustomer=findPrevCustomer(prevCustomerName);

            if (prevcustomer != null) {
                prevcustomer.addTransaction(amountDepositing);
            return true;
        }
        return false;
    }
    private CustomerImp findPrevCustomer(String CustomerName){
        //To find we have to go through the list of customer on ArrayList
        for(int i=0;i<customerList.size();i++) {
            //get checks the position of every element and getname checks whether the name
            //is present in the ArrayList or not!
            CustomerImp customerImp = customerList.get(i);
            if (customerImp.getNameOfCustomer().equals(CustomerName))
                return customerImp;
        }
            return null;

    }

}