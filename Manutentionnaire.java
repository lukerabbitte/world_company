package worldcompany;

public class Manutentionnaire extends Employe {

    private static final int PREFIX_MANUTENTIONNAIRE = 4000;
    private static int nbManutentionnaires = 0;
    private static final double SALAIRE_HORAIRE = 34.50;
    private double heures = 0.0;

    Manutentionnaire(String nom, String prenom, int anneeEmbauche, double heures) throws Exception {
        super(nom, prenom, anneeEmbauche);
        this.heures = heures;
        nbManutentionnaires++;
        super.setCodeEmploye(PREFIX_MANUTENTIONNAIRE + nbManutentionnaires);
    }

    public String presentation() {
        return super.presentation();
    }

    public double getSalaire() {
        return (SALAIRE_HORAIRE) * (heures);
    }

}
