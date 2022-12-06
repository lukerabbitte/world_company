package worldcompany;

public class Technicien extends Employe {

    private static final int PREFIX_TECHNICIEN = 3000;
    private static int nbTechniciens = 0;
    private static final double FACTEUR_UNITE = 8.5;
    private int unites = 0;

    Technicien(String nom, String prenom, int anneeEmbauche, int unites) throws Exception {
        super(nom, prenom, anneeEmbauche);
        this.unites=unites;
        nbTechniciens++;
        super.setCodeEmploye(PREFIX_TECHNICIEN + nbTechniciens);
    }

    public String presentation() {
        return super.presentation();
    }

    public double getSalaire() {
        //return (Math.floor((unites) * (FACTEUR_UNITE) * 100) / 100);
        return (unites) * (FACTEUR_UNITE);
    }
}
