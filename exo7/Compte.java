package exo7;

public abstract class Compte {
    private String numero;
    private String proprietaire;
    private int solde;

    public Compte(String numero, String proprietaire, int solde) {
        this.numero = numero;
        this.proprietaire = proprietaire;
        this.solde = solde;
    }

    public void deposer(int montant) {
        this.solde = solde + montant;
    }

    public abstract void retirer(int montant);


    /**
     * @return String return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return String return the proprietaire
     */
    public String getProprietaire() {
        return proprietaire;
    }

    /**
     * @param proprietaire the proprietaire to set
     */
    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    /**
     * @return int return the solde
     */
    public int getSolde() {
        return solde;
    }

    /**
     * @param solde the solde to set
     */
    public void setSolde(int solde) {
        this.solde = solde;
    }

}