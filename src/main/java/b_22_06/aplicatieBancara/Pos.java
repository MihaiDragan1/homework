package b_22_06.aplicatieBancara;

public class Pos {

    private String ContIBAN;
    private double baniInCont;
    private double scoateBani;


    public Pos (double baniInCont,double scoateBani) {
        this.baniInCont = baniInCont;
        this.scoateBani = scoateBani;
    }

    public void adaugaContBancar(String codIBAN) {
        System.out.println("Contul bancar adaugat are contul" + codIBAN);
    }
    public void platesteCuCardulDeBaza (double baniInCont,double scoateBani) {
        if (baniInCont>scoateBani)
            System.out.println("Felicitari!Ai platit "+ scoateBani);
        else
            System.out.println("Nu ai suficienti bani in cont!Plateste cu celelalate carduri!");
    }
    public void platesteCuCardurileAtasate (double baniInContulAtasat,double scoateBani,String numarCardAtasat) {
        if (baniInContulAtasat>scoateBani)
            System.out.println("Felicitari!Ai facut plata!Ai platit"+" "+scoateBani);
        else
            System.out.println("Plata nu se poate efectua!Plateste cu celelalte carduri");
    }
    public void cardExpirat (int dataExpirarii) {
        if(dataExpirarii<2019)
            System.out.println("Cardul tau a expirat!Nu poti plati!");
    }
    public void contBancarNecunoscut (String codIBAN, String codIBANdeVerificat) {
        if(codIBAN.contentEquals(codIBANdeVerificat))
            System.out.println("Plata se va efectua imediat!");
        else
            System.out.println("Cod bancar necunoscut!");

    }
}
