package c_06_07;

public interface GenericPhone {

    void addContacts(Contact contact);

    void listContacts();

    void sendMessage(Contact contact, String messageContent);

    void listMessageHistory();

    void addCallToContact(Contact contact);

    void listCallHistory();
}
