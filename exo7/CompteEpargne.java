package exo7;

public class CompteEpargne extends  CompteSecurise{
    private int taux;

    public CompteEpargne(String numero, String proprietaire, int solde , int taux) {
        super(numero, proprietaire, solde);
        this.taux= taux;
    }

    public  void  verserInteret(int taux){
       this.setSolde(this.getSolde()+taux/100);
    }
    public int getTaux() {
        return taux;
    }

    public void setTaux(int taux) {
        this.taux = taux;
    }

}
