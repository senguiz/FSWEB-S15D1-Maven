package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    String myNumber;

    List<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }
    public boolean addNewContact(Contact contact){
        if(myContacts.contains(contact)){
            return false;
        }else{
            myContacts.add(contact);
            return true;
        }
    }
    public boolean updateContact(Contact newContact, Contact oldContact){
        int contactIndex = myContacts.indexOf(oldContact);
        if(getMyContacts().contains(oldContact)){
                myContacts.set(contactIndex, newContact);
                return true;
        }
        return false;
    }
    public boolean removeContact(Contact contact){
        int contactIndex = myContacts.indexOf(contact);
        if(myContacts.contains(contact)){
            myContacts.remove(myContacts.get(contactIndex));
            return true;
        }
        return false;
    }
    public int findContact(Contact contact){
        int contactIndex = myContacts.indexOf(contact);
        if(myContacts.contains(contact)){
            return contactIndex;
        }
        return -1;
    }
    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String contactName) {

        int contactIndex = findContact(contactName);
        if (contactIndex < 0) {
            return null;
        }
        return this.myContacts.get(contactIndex);
    }
    public void printContact(){

        for(int i = 0 ; i<myContacts.size(); i++){
            System.out.println(i+1 +". " + myContacts.get(i).getName()+"-> "+myContacts.get(i).getPhoneNumber() );
        }
    }


}
