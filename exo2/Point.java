package exo2;

public class Point {
    public float abcisse;
    public float ordonnee;

    public Point(float abcisse, float ordonnee) {
        this.abcisse = abcisse;
        this.ordonnee = ordonnee;
    }

    public void initialiser(float abcisse, float ordonnee) {
        this.abcisse = abcisse;
        this.ordonnee = ordonnee;
    }

    public void deplacer(float x, float y) {
        this.abcisse = abcisse + x;
        this.ordonnee = ordonnee + y;
    }

    public void afficher() {
        System.out.println("je suis un point de coodonnees " + this.abcisse + " et " + this.ordonnee);
    }


}
