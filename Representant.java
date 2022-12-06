package worldcompany;

public class Representant extends Commercial {

    private static final double POURCENT_REPRESENTANT = 0.4;
    private static final double BONUS_REPRESENTANT = 1000.0;
    private static final int PREFIX_REPRESENTANT = 2000;
    private static int nbRepresentant = 0;

    Representant(String nom, String prenom, int anneeEmbauche, double chiffreAffaire) throws Exception {
        super(nom, prenom, anneeEmbauche, chiffreAffaire);
        nbRepresentant++;
        super.setCodeEmploye(PREFIX_REPRESENTANT + nbRepresentant);
    }

    @Override
    protected void setCodeEmploye(int numeroEmploye) {
        super.setCodeEmploye(PREFIX_REPRESENTANT + nbRepresentant);
    }

    public String presentation() {
        return super.presentation();
    }

    public double getSalaire() {
        return (BONUS_REPRESENTANT + (POURCENT_REPRESENTANT)*(getChiffreAffaire()));
    }


}
