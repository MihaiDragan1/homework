package b_22_06.LibraryCatalog;

public class Test {
    public static void main (String[] args) {
     Novels novel = new Novels("In vreme de razboi");
     novel.adaugaBooks("Morometii");
     novel.adaugaBooks("Ciresarii");
     novel.adaugaBooks("Alexandru Lapusneanu");

    ArtAlbums albums = new ArtAlbums("Davinci");
    albums.adaugaBooks("Picasso");
    albums.adaugaBooks("Dali");
    albums.adaugaBooks( "Goya");

    albums.stergeBooks( "Dali");
    }
}
