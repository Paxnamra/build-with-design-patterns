package structural.adapter.example1;

public class Compound {

    protected String chemical;
    protected float boilingPoint;
    protected float meltingPoint;
    protected double molecularWeight;
    protected String molecularFormula;

    public Compound() {
    }

    public Compound(String chemical) {
        this. chemical = chemical;
    }

    public void display() {
        System.out.println( "\nCompound: " + chemical + " ------");
    }
}
