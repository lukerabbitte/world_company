package worldcompany;

public class Pdg implements Presentation {

    private String designation;

    public Pdg(String designation) {
        this.designation = designation;
    }

    @Override
    public String presentation() {
        return "Beuhhaa, I am " + designation;
    }
}
