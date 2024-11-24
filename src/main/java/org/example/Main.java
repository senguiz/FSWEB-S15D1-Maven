package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

public class Main {
    public static void main(String[] args) {
        //Grocery g = new Grocery();
        //g.startGrocery();
        MobilePhone mobilePhone = new MobilePhone("444444444444");
        Contact contact1 = new Contact("seniz", "111111111111");
        Contact contact2 = new Contact("zekiye", "222222222222");
        Contact contact3 = new Contact("izgu", "333333333333");
        Contact contact4 = new Contact("seniz", "55555555555555555");
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.updateContact(contact4, contact1);
        System.out.println(mobilePhone.findContact(contact4));
        System.out.println(mobilePhone.queryContact("izgu"));
        mobilePhone.printContact();

    }
}
