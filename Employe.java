package worldcompany;

public abstract class Employe implements Comparable<Employe>, Presentation {

    private int codeEmploye = 0;
    private String nom = "";
    private String prenom = "";
    private int anneeEmbauche = 0;

    Employe (String nom, String prenom, int anneeEmbauche) throws Exception {

        this.nom = nom;
        this.prenom = prenom;
        setAnneeEmbauche(anneeEmbauche);
    }

    public String presentation() {

        StringBuilder sb = new StringBuilder();
        sb.append(
                "[" + codeEmploye + "] Bonjour, je m'appelle " + prenom + " " + nom +
                " et je gagne " + this.getSalaire() + " euros. Je suis " +
                this.getClass().getSimpleName().toLowerCase() + " depuis " +
                this.getAnneeEmbauche()
        );

        return sb.toString();
    }

    @Override
    public int compareTo(Employe e) {
        /*if (this.year < e.year)
            return -1;
        else if  (this.year = e.year)
            return 0;
        else
            return 1;
            */
        return Integer.compare(this.anneeEmbauche, e.anneeEmbauche);
    }

    public abstract double getSalaire();

    protected void setCodeEmploye(int codeEmploye) {
        this.codeEmploye = codeEmploye;
    }

    protected int getAnneeEmbauche() {
        return this.anneeEmbauche;
    }

    protected void setAnneeEmbauche(int anneeEmbauche) throws Exception {
        if (anneeEmbauche >= 1975)
            this.anneeEmbauche = anneeEmbauche;
        else
            throw new Exception("The year cannot be earlier than 1975.");
    }
}
