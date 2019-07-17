package week2.aplicatieBancara;

import java.util.ArrayList;
import java.util.List;

public class User {
    //nu e ok ca lista asta sa fie locala, pt ca in felul asta exista doar atat cat se executa metoda
    List<String> userCards = new ArrayList<>(5);
    private String contIBAN;
    private String numarCard;
    private String numarCardAtasat;
    private String numeApartinator;

    public User(String nume, String contIBAN) {
        this.contIBAN = contIBAN;
        this.numeApartinator = nume;
    }

    public void adaugaCard(int dataExpirarii, String numarCard, String numeApartinator) {
        userCards.add(numarCardAtasat);
    }
}
