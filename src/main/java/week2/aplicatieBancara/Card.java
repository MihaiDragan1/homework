package week2.aplicatieBancara;

public class Card {
    private int dataExpirarii;
    private String numeApartinator;
    private String numarCard;
    private int pIN;

    public Card(int dataExpirarii, String numarCard, String numeApartinator) {
        this.dataExpirarii = dataExpirarii;
        this.numarCard = numarCard;
        this.numeApartinator = numeApartinator;
    }
}
