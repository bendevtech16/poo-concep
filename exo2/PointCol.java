package exo2;

public class PointCol extends Point {
    public byte couleur;

    public PointCol(float abcisse, float ordonnee, byte couuleur) {
        super(abcisse, ordonnee);
        this.couleur = couuleur;
        // TODO Auto-generated constructor stub
    }

    public void afficheCol() {
        System.out.println("je suis un point colore de coordonnee " + this.abcisse + " et " + this.ordonnee
                + " et de couleur " + this.couleur);
    }

    public void colorer() {

    }
}
