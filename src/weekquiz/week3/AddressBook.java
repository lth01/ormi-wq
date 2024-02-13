package weekquiz.week3;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook(){
        contacts = new ArrayList<>();
    }


    public void displayContacts(){
        for(Contact contact : contacts){
            System.out.print(contact.showContact());
        }
    }

    public void searchContact(String name){
        for(Contact contact : contacts){
            if(contact.getName().equals(name)){
                System.out.print(contact.showContact());
                return ;
            }
        }

        System.out.println("연락처를 찾을 수 없습니다.");
        return ;
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }
}
