package exo4;


import exo3.Point;

public class PointCol extends Point {
    public byte couleur;

    public PointCol(float abcisse, float ordonnee, byte couleur) {
        super(abcisse, ordonnee);
        this.couleur = couleur;
        // TODO Auto-generated constructor stub
    }

    /*
     * public void afficher() {
     * System.out.println("je suis un point colore de coordonnee " + this.abcisse +
     * " et " + this.ordonnee
     * + " et de couleur " + this.couleur);
     * }
     */

    public void colorer() {
    }
@Override
    public void identifie() {
        System.out.println("je suis un point  colore de couleur " + this.couleur);
    }
}
