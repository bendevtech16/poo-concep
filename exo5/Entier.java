package exo5;

public class Entier extends Affichable {
    public int a;

    public Entier(int a) {
        this.a = a;
    }

    @Override
    public void affiche() {
        System.out.println("jesuis un entier de valeur " + this.a);
    }
}
