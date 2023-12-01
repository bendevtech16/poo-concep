package exo3;



public class PointCol extends Point {
    public byte couleur;

    public PointCol(float abcisse, float ordonnee, byte couuleur) {
        super(abcisse, ordonnee);
        this.couleur = couuleur;
        // TODO Auto-generated constructor stub
    }
    public void identifie() {
        System.out.println("je suis un point colore de couleur " + this.couleur);
    }
    public void afficher() {
        identifie();
        //System.out.println("je suis un point colore de coordonnee " + this.abcisse + " et " + this.ordonnee + " et de couleur " + this.couleur);
    }

    public void colorer() {

    }
}
