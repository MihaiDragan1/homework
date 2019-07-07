package b_22_06.LibraryCatalog;
import java.util.ArrayList;
public class Books {
public String nume;
public int nrPagini;
private String tipHartie;
private String tip;

public Books (String nume){
    this.nume = nume;

}
    ArrayList<String> array = new ArrayList<>( 5);

public void adaugaBooks (String nume) {
    array.add(nume);
    array.add(nume);
    array.add(nume);
    array.add(nume);
}

public void stergeBooks (String nume){
    array.remove(0);
    array.remove(1);
    
}
public String toString(){
    return nume;
}
}
