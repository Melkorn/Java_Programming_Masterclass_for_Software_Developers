import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner (System.in);
    private static MobilePhone mobilePhone = new MobilePhone("660 265 119");
    public static void main(String[] args){

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\nENter Action (6 - to print list of available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }


    }

    private static void addNewContact(){
        System.out.println("Enter new Contact name");
        String name = scanner.nextLine();
        System.out.println("Enter phone nubmer");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("Contact Added" + name + "___" + number);
        }else {
            System.out.println("Contact " + name + " already exist");
        }
    }


    private static void updateContact(){
        System.out.println(" Enter the name of Contact You want to update");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new Contact Name");
        String newName = scanner.nextLine();
        System.out.println("Enter new Contact phone number");
        String newNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Contact updated");
        }else System.out.println("Failed to update");

    }

    private static void removeContact() {
        System.out.println(" Enter the name of Contact You want to remove");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Contact removed");
            return;
        } else System.out.println("Failed to remove Contact");
    }

    private static void queryContact() {
        System.out.println(" Enter the name of Contact You want to find");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Contact name: " + existingContactRecord.getName() + "--- phone nuumber: " + existingContactRecord.getPhoneNumber());

    }

    private static void startPhone(){
        System.out.println("Starting phoone.......");
    }

    private static void printActions(){
        System.out.println("\nAvailable  actions: \npress ");
        System.out.println(" 0 -to shut down\n " +
                " 1 - to print contacts\n" +
                "2 - to add new contact\n" +
                " 3 - to Update Contact \n" +
                "4 - to remove contact\n" +
                "5 - find contact\n"+
                "6 - to print list of available actions\n");
        System.out.println("Choose action");

    }
}
