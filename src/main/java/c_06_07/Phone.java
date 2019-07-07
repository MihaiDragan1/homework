package c_06_07;

import java.awt.*;
import java.util.ArrayList;

public abstract class Phone implements GenericPhone {

    List<Contact> contacts = new ArrayList<>();
    List<String> callHistory = new ArrayList<>();
    List<String> messageHistory = new ArrayList<>();

    public String producerName;
    public static final int batteryLife;
    public String color;
    public String material;
    public String imei;
}

    Phone(String a, int b, String c, String d, String e) {
        this.producerName = a;
        this.batteryLife = b;
        this.color = c;
        this.material = d;
        this.imei = e;
    }

    public void addMessage(Contact contact, String message) {
        contact.addMessage(message);
    }

    @Override
    void Contact(Integer a, String b, String c, String d) {
        Integer id = a;
        String phoneNumber = b;
        String fistName = c;
        String lastName = d;

        ArrayList<String> listaContacte = new ArrayList<>();
        listaContacte.add(a, getPhoneNumber(), getFirstName(), getLastName());
    }

    @Override
    void listConstacts();

    @Override
    void sendMessage(String a, String b);

    @Override
    void seeMessage(String a);

    @Override
    void call(String a);

    @Override
    void viewHistoryCall(String a);

}




