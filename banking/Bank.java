package banking;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private int bankId;

    private ArrayList <Branch> branches;
    private ArrayList <Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankId = bankId;
        this.branches = new ArrayList<Branch>();
    }


    public boolean addBranch(int branchId, String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchId, branchName));
            System.out.println("Branch added");
            return true;
        }
        return false;
    }


    public boolean addCustomer(String branchName, String customerName, String CIF, double initialBalance){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomer(customerName, CIF, initialBalance);
        } return false;
    }

    public boolean addCustomerTransaction(String branchName, String CIF, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomerTransaction(CIF, amount);
        } return false;

    }

   /* private Branch findBranch(String branchName){
        for(int i = 0; i < this.branches.size(); i++){
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getBranchName().equals(branchName)){
                return checkedBranch;
            }

        }
        System.out.println("TUtaj");return null;
    }*/
    private Branch findBranch(String branchName) {
        //System.out.println(this.branches.size());
        for(int i=0; i<this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getBranchName().equals(branchName)) {
                return checkedBranch;

            }
        }
        System.out.println("Branch not found");
        return null;
    }

    public boolean listOfCustomers(String branchName, boolean transactionsList){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer for branch: " + branch.getBranchName() +":");
            ArrayList<Customer> branchCustomersList = branch.getCustomers();
            for(int i =0; i < branchCustomersList.size(); i++){
                Customer branchCustomer = branchCustomersList.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + " CIF: " + branchCustomer.getCIF());
                if(transactionsList == true){
                    ArrayList<Double> transaction = branchCustomer.getTransactions();
                    for (int j =0; j< transaction.size(); j++) {
                        System.out.println(transaction.get(j));
                    }
                }

            } return true;
        } else
            System.out.println("error branch = null");
        return false;
    }

}
// You job is to create a simple banking application.
// There should be a Bank class +
// It should have an arraylist of Branches +
// Each Branch should have an arraylist of Customers +
// The Customer class should have an arraylist of Doubles (transactions) +
// Customer: +
// Name, and the ArrayList of doubles. +
// Branch: +
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions