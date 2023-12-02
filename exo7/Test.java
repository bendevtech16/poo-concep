package exo7;

public class Test {
    public static void main(String[] args) {
        CompteEpargne compte = new CompteEpargne("benji123", "ohandja benjamin", 50000,10);
        CompteSecurise compte1 = new CompteSecurise("eeee123", "tounde", 34500);
        compte.verserInteret(35);
        compte.deposer(1000);
        compte.retirer(10000);
        compte.retirer(100000);
        System.out.println("votre solde est de "+compte.getSolde());
        System.out.println(compte.toString());
        System.out.println("============================================");
        compte1.retirer(3000);
        System.out.println("votre solde est de "+ compte1.getSolde());
        compte1.toString();
    }
}