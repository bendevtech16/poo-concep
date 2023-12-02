package exo6;

public class Float implements Affichable {
    public float a;

    public Float(float a) {
        this.a = a;
    }

    @Override
    public void affiche() {
        System.out.println("je suis un float de vaeur " + this.a);
    }
}
