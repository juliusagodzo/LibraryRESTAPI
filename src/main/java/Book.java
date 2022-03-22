public class Book {
    private String Autore, Titolo, ISBN, PrestitoAttivo;

    public String getAutore() {
        return Autore;
    }

    public void setAutore(String autore) {
        Autore = autore;
    }

    public String getTitolo() {
        return Titolo;
    }

    public void setTitolo(String titolo) {
        Titolo = titolo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPrestitoAttivo() {
        return PrestitoAttivo;
    }

    public void setPrestitoAttivo(String PrestitoAttivo){
        this.PrestitoAttivo = PrestitoAttivo;
    }
}
