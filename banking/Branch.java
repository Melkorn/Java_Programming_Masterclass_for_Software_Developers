package banking;

import java.util.ArrayList;

public class Branch {
    private int branchId;
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(int branchId, String branchName) {
        this.branchId = branchId;
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();

    }

    public boolean addCustomer(String customerName, String CIF, double initialBalance){
        if(findCustomer(CIF) == null){
            this.customers.add(new Customer(customerName, CIF, initialBalance));
            System.out.println("Customer " + customerName + "CIF: " + CIF + " with account balance " + initialBalance + " created");
            return true;
        } else
            System.out.println("This customer already exist");
        return false;


    }

    public boolean newCustomerTransaction(String CIF, double amount){
        Customer theCustomer = findCustomer(CIF);
        if(theCustomer != null){
           theCustomer.newTransaction(amount);
            System.out.println("Customer " + CIF + " transaction " + amount);
            return true;
        } else
            System.out.println("Error customer does not exist");
        return false;


    }


    private Customer findCustomer(String customerCIF){
        for(int i = 0; i < customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getCIF().equals(customerCIF)){
                return checkedCustomer;
            }

        } return null;
    }


    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }






}
