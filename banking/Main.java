package banking;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Banco Santander");

        bank.addBranch(0, "Poznan");
        bank.addBranch(1, "Warsaw");
        bank.addCustomer("Poznan", "Matt", "1", 0.00);
        bank.addCustomer("Poznan", "Jon", "2", 10.00);
        bank.addCustomer("Poznan", "Leo", "3", 500.00);
        bank.addCustomer("Poznan", "Jon", "4", 10.00);
        bank.addCustomer("Poznan", "Tim", "5", 500.00);
        bank.addCustomer("Poznan", "Bob", "6", 10.00);
        bank.addCustomer("Poznan", "Paul", "7", 500.00);
        bank.addCustomer("Warsaw", "Jon", "8", 10.00);
        bank.addCustomer("Warsaw", "Leo", "9", 500.00);
        bank.addCustomer("Warsaw", "Jon", "10", 10.00);
        bank.addCustomer("Warsaw", "Leo", "11", 500.00);

        bank.addCustomerTransaction("Poznan", "3", 65.65);
        bank.addCustomerTransaction("Poznan", "4", 653.65);
        bank.addCustomerTransaction("Poznan", "2", 615.65);
        bank.addCustomerTransaction("Poznan", "1", 6235.65);
        bank.addCustomerTransaction("Poznan", "6", 654.65);

        bank.listOfCustomers("Poznan", true);
        bank.listOfCustomers("Warsaw", false);
        
    }
}
