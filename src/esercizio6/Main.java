package esercizio6;

public class Main {
    public static void main(String[] args) {
        GalleriaArte museo = new GalleriaArte("Museo bello","via del museo");
        Quadro q1 = new Quadro("Io","Giomberto",6969,1);
        Quadro q2 = new Quadro("Tu","Giomberto",1234,5);
        Quadro q3 = new Quadro("Egli","Grandespurgo",4321,3);
        Quadro q4 = new Quadro("Noi","Marcello",1234,5);
        museo.aggiungiQuadro(q1);
        museo.aggiungiQuadro(q2);
        museo.aggiungiQuadro(q3);
        museo.aggiungiQuadro(q4);
        System.out.print(
              "ricercaQuadro(): "      + museo.ricercaQuadro(q2) //ok
            + "\nPrezzoQuadro(): "     + museo.PrezzoQuadro(2004) //ok
            + "\nQuadriAutore(): "     + museo.QuadriAutore("Grandespurgo") //ok
            + "\nprezzoCompreso(): "   + museo.prezzoCompreso("Giomberto", 5).toString() //ok
            + "\nQuadroPiuVecchio(): " + museo.QuadroPiuVecchio().getTitolo() //forse errore
        );
    }
}