package weekquiz.week3;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook(){
        contacts = new ArrayList<>();
    }


    public void displayContacts(){}

    public void searchContact(String name){

    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }
}
