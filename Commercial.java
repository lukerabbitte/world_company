package worldcompany;

public abstract class Commercial extends Employe {

    private double chiffreAffaire = 0.0;

    Commercial (String nom, String prenom, int anneeEmbauche, double chiffreAffaire) throws Exception {
        super(nom, prenom, anneeEmbauche);
        this.chiffreAffaire=chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return this.chiffreAffaire;
    }
}
