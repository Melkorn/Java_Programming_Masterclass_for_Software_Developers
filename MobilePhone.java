import java.util.ArrayList;

public class MobilePhone {

  private String myNumber;
  private ArrayList <Contact> MyContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.MyContacts = new ArrayList<Contact>();

    }


    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact already exist");
        return false;
        }
        MyContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println("Contact not found");
            return false;
        }
        this.MyContacts.set(foundPosition,newContact);
        System.out.println("Contact " + oldContact.getName() + " has been changed to: " + newContact.getName());
        return true;
    }
    
    private int findContact(Contact contact){
        return this.MyContacts.indexOf(contact);

    }

    private int findContact(String contactName){
        for(int i =0;i<MyContacts.size(); i++){
            Contact contact = this.MyContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        } return -1;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println("Contact not found");
            return false;
        }
        this.MyContacts.remove(foundPosition);
        System.out.println("COntact " + contact.getName() + " removed ");
        return true;
    }

    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }else return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.MyContacts.get(position);

        } else
            System.out.println("Contact does not exist");
            return null;
    }


    public  void printContacts(){
        System.out.println("Contacts List");
        for(int i =0; i<this.MyContacts.size(); i++){
            System.out.println(i+1 + ".    " +
                    this.MyContacts.get(i).getName() + "_________" + this.MyContacts.get(i).getPhoneNumber());
        }
    }




}

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.