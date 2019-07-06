package b_22_06.aplicatieBancara;

            import java.util.*;
    public class User {
        private String contIBAN;
        private String numarCard;
        private String numarCardAtasat;
        private String numeApartinator;

        public User(String nume, String contIBAN) {
            this.contIBAN = contIBAN;
            this.numeApartinator = nume;
        }
        public void adaugaCard(int dataExpirarii, String numarCard, String numeApartinator) {
            ArrayList<String> carduriAtasate = new ArrayList<String>(5);
            carduriAtasate.add(numarCardAtasat);}
    }
