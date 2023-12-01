package exo6;

import exo6.exo5.Affichable;

public class Float extends Affichable {
    public float a;

    public Float(float a) {
        this.a = a;
    }

    @Override
    public void affiche() {
        System.out.println("je suis un float de vaeur " + this.a);
    }
}
