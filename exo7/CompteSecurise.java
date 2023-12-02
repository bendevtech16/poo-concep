package exo7;

public class CompteSecurise extends Compte{
    public CompteSecurise(String numero, String proprietaire, int solde) {
        super(numero, proprietaire, solde);
    }

    @Override
    public void retirer(int montant) {
        if (this.getSolde()>=montant){
            this.setSolde(this.getSolde()-montant);
            System.out.println("retrait effectue avec succes!");
        }
        else {
            System.out.println("votre solde est insuffisant!");
        }
    }
}
