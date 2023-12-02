package exo6;

public class Test {
    public static void main(String[] args) {
        Affichable affichable1 = new Entier(45);
        Affichable affichable2 = new Float(35f);
        Affichable affichable3 = new Entier(23);
        Affichable affichable4 = new Float(20f);
        Affichable[] aff;
        aff = new Affichable[4];
        aff[0] = affichable1;
        aff[1] = affichable2;
        aff[2] = affichable3;
        aff[3] = affichable4;
        for (Affichable a : aff) {
            a.affiche();
        }

    }
}
