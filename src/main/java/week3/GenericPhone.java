package week3;

public interface GenericPhone {

    void addContact(Integer id, String phoneNumber, String fistName, String lastName);

    void listContacts();

    void sendMessage(Contact contact, String messageContent);

    void listMessageHistory();

    void addCallToContact(Contact contact);

    void listCallHistory();
}
