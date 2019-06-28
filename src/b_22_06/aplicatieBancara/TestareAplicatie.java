package b_22_06.aplicatieBancara;

public class TestareAplicatie {

    public static void main(String[] args) {

        User user1 = new User("Dragan Mihai","1267");
        user1.adaugaCard(2021, "24500", "Dragan Mihai");
        user1.adaugaCard(2025, "24501", "Dragan Mihai");
        user1.adaugaCard(2030,"26500", "Dragan Mihai");

        Pos pos1 = new Pos(4500,1200);
        pos1.platesteCuCardulDeBaza(4600.65, 1600.05);
        pos1.platesteCuCardulDeBaza(1200.80, 600.05);
        pos1.cardExpirat(2018);
        pos1.contBancarNecunoscut("6898", "7889");
    }

}
