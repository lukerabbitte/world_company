package worldcompany;

public class Personnel {

    Employe[] rh;

    public Personnel(Employe[] employes) {
        rh = employes;
    }

    public void presentations() {

        for (Employe e: rh) {
            System.out.println(e.presentation());
        }
    }

    public double salaireMoyen() {

        double sommeDesSalaires = 0.0;
        int numEmploye = 0;

        for (Employe e: rh) {
            sommeDesSalaires += e.getSalaire();
            numEmploye++;
        }

        return (sommeDesSalaires/numEmploye);
    }

    public void trierEmployes() {
        // Ne PAS modifier cette méthode
        triSelection(rh.length);
    }

    protected void triSelection(int n) {

        int min = 0;
        Employe temp;

        for (int i = 0; i < n-1; i++) {

            min = i;

            for (int j = i + 1; j < n; j++) {

                if (rh[j].compareTo(rh[min]) < 0)
                    min = j;
            }

            if (min != i) {
                temp = rh[i];
                rh[i] = rh[min];
                rh[min] = temp;
            }
        }
    }
}
