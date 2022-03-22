public class Loan {
    private String DataInizioPrestito, DataFinePrestito, ISBN;

    public void setDataInizioPrestito(String DataInizioPrestito) {
        this.DataFinePrestito = DataInizioPrestito;
    }

    public String getDataInizioPrestito() {
        return this.DataInizioPrestito;
    }

    public void setDataFinePrestito(String DataFinePrestito) {
        this.DataFinePrestito = DataFinePrestito;
    }

    public String getDataFindePrestito() {
        return this.DataFinePrestito;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return this.ISBN;
    }
}