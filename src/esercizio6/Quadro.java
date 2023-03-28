package esercizio6;

public class Quadro{
    protected String titolo, autore;
    protected int anno, prezzo;

    public Quadro(){}

    public Quadro(Quadro quadro){
        this.titolo = quadro.titolo;
        this.autore = quadro.autore;
        this.anno = quadro.anno;
        this.prezzo = quadro.prezzo;
    }

    public Quadro(String titolo, String autore, int anno, int prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString(){
        return "\nTitolo: " + this.getTitolo() +
                "\nAutore: " + this.getAutore() +
                "\nAnno: "   + this.getAnno() +
                "\nPrezzo: " + this.getPrezzo();
    }
}