package worldcompany;

public class Vendeur extends Commercial {

    private static final double POURCENT_VENDEUR = 0.2;
    private static final double BONUS_VENDEUR = 800.0;
    private static final int PREFIX_VENDEUR = 1000;
    private static int nbVendeur = 0;

    Vendeur(String nom, String prenom, int anneeEmbauche, double chiffreAffaire) throws Exception {
        super(nom, prenom, anneeEmbauche, chiffreAffaire);
        nbVendeur++;
        super.setCodeEmploye(PREFIX_VENDEUR + nbVendeur);
    }

    @Override
    protected void setCodeEmploye(int numeroEmploye) {
        super.setCodeEmploye(PREFIX_VENDEUR + nbVendeur);
    }

    public String presentation() {
        return super.presentation();
    }

    public double getSalaire() {
        return (BONUS_VENDEUR + (POURCENT_VENDEUR)*(getChiffreAffaire()));
    }

}
