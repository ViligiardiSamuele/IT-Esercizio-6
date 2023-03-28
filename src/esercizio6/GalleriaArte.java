package esercizio6;

import java.util.ArrayList;
import java.util.Iterator;

public class GalleriaArte {
    protected String nome, indirizzo;
    protected ArrayList<Quadro> quadri;

    public GalleriaArte(){}

    public GalleriaArte(GalleriaArte galleriaArte){
        this.nome = galleriaArte.nome;
        this.indirizzo = galleriaArte.indirizzo;
        this.quadri = galleriaArte.quadri;
    }

    public GalleriaArte(String nome, String indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.quadri = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void aggiungiQuadro(Quadro q){
        quadri.add(q);
    }

    public boolean ricercaQuadro(Quadro q){
        return quadri.contains(q);
    }

    public int PrezzoQuadro(int anno){
        int totale = 0;
        for (Quadro quadro : quadri) {
            if (quadro.getAnno() > anno)
                totale += quadro.getPrezzo();
        }
        return totale;
    }

    public int QuadriAutore(String cognomeAutore){
        for (int i = 0; i < quadri.size(); i++) {
            if (quadri.get(i).getAutore().equals(cognomeAutore))
                return quadri.size() - i - 1;
        }
        return 0;
    }

    public ArrayList<Quadro> prezzoCompreso(String autore, int p){
        ArrayList<Quadro> quadriautore = new ArrayList<>();
        for (Quadro quadro : quadri)
            if (quadro.getAutore().equals(autore) && quadro.getPrezzo() < p)
                quadriautore.add(quadro);
        return quadriautore;
    }

    public Quadro QuadroPiuVecchio(){
        Quadro piuVecchio = this.quadri.get(1);

        //ricerco il più vecchio
        for(Quadro quadro : this.quadri)
            if(piuVecchio.getAnno() > quadro.getAnno())
                piuVecchio = quadro;

        //controllo se esiste un quadro con indice diverso e con stessa data
        if(this.quadri.indexOf(piuVecchio) != this.quadri.lastIndexOf(piuVecchio)){
            //memorizzo il secondo quadro con la stessa data
            Quadro secondo = this.quadri.get(this.quadri.lastIndexOf(piuVecchio));
            //controllo il prezzo
            if(piuVecchio.getPrezzo() > secondo.getPrezzo())
                return piuVecchio;
            else if(piuVecchio.getPrezzo() < secondo.getPrezzo())
                return secondo;
            else {
                //controllo il titolo
                if(piuVecchio.getTitolo().compareToIgnoreCase(secondo.getTitolo()) > 0)
                    return piuVecchio;
                else if (piuVecchio.getTitolo().compareToIgnoreCase(secondo.getTitolo()) < 0)
                    return secondo;
            }
        }
        return piuVecchio;
    }
}