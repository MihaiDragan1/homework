package week3;

import java.util.ArrayList;
import java.util.List;

public class Phone implements GenericPhone {

    List<Contact> contacts = new ArrayList<>();
    List<String> callHistory = new ArrayList<>();
    List<String> messageHistory = new ArrayList<>();

    public String producerName;
    public static final int batteryLife = 100;
    public String color;
    public String material;
    public String imei;

    public Phone() {
    }

    Phone(String a, String c, String d, String e) {
        this.producerName = a;
        this.color = c;
        this.material = d;
        this.imei = e;
    }

    public void addContact(Integer id, String phoneNumber, String fistName, String lastName) {
        contacts.add(new Contact(id, phoneNumber, fistName, lastName));
    }

    //@Override o metoda care suprascrie alta metoda nu poate fi abstracta
    public void listContacts() {
        contacts.forEach(contact -> System.out.println(contact));
    }

    public void sendMessage(Contact contact, String message) {
        contact.addMessage(message);
    }

    @Override
    public void listMessageHistory() {

    }

    @Override
    public void addCallToContact(Contact contact) {

    }

    @Override
    public void listCallHistory() {

    }

}




