package week3;

import java.util.ArrayList;

public class Contact {
    private Integer id;
    private String fistName;
    private String lastName;
    private String phoneNumber;

    private ArrayList<String> messages = new ArrayList<>();

    public Contact(Integer id, String fistName, String lastName, String phoneNumber) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void addMessage(String message) {
        messages.add(message);
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
