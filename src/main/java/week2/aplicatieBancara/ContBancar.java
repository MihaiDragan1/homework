package week2.aplicatieBancara;

import java.util.ArrayList;

public class ContBancar {

    // 1. Proprietatile contului bancar
    private String contIBAN;
    private ArrayList<String> conturiAtasate;
    private String titularCont;
    private String numarCard;
    private String numarCardAtasat;
    private double baniInContulAtasat;
    private double baniInContuldeBaza;

    /* 2. metoda(constructor special) pentru a construi obiectul cu proprietatile
de mai sus*/
    public ContBancar(String cont, String titular, String numarCard, double baniInCont, double baniInContulAtasat) {
        this.contIBAN = cont;
        this.titularCont = titular;
        this.numarCard = numarCard;
        this.baniInContuldeBaza = baniInCont;
        this.baniInContulAtasat = baniInContulAtasat;
    }

    public void depuneBaniInCont(double depuneBani) {
        this.baniInContuldeBaza = this.baniInContuldeBaza + depuneBani;
    }

    public void ataseazaCard(String numarCardAtasat) {
        //same here
        ArrayList<String> conturiAtasate = new ArrayList<String>(5);
        conturiAtasate.add(numarCardAtasat);
    }

    public double baniiDinCont(double baniInCont, double depuneBani, double scoateBani) {
        double baniiDinCont = baniInCont + depuneBani - scoateBani;
        return baniiDinCont;
    }

    public void platesteCuCardulAtasat(double scoateBani) {
        if (scoateBani > baniInContuldeBaza)
            System.out.println("Plateste cu cardurile atasate: ");
        if (scoateBani < baniInContulAtasat)
            System.out.println("Felicitari!Ai platit cu banii din cardurile atasate!" +
                    " Mai ai disponibil in contul atasat " + (baniInContulAtasat - scoateBani));

    }

    public void scoateBaniDinCont(double scoateBani) {
        this.baniInContuldeBaza = this.baniInContuldeBaza - scoateBani;
    }
}
