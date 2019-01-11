package structural.adapter.example1;

public class RichCompound extends Compound{

    private ChemicalDataBank chemicalDataBank;


    public RichCompound(String chemical) {
        super();
    }


    public void display() {
        chemicalDataBank = new ChemicalDataBank();

        boilingPoint = chemicalDataBank.getCriticalPoint(chemical,"M");
        meltingPoint = chemicalDataBank.getCriticalPoint(chemical,"B");
        molecularWeight = chemicalDataBank.getMolecularWeight(chemical);
        molecularFormula = chemicalDataBank.getMolecularStructure(chemical);

        System.out.println("Formula: " + molecularFormula);
        System.out.println("Weight: " + molecularWeight);
        System.out.println("Melting point: " + meltingPoint);
        System.out.println("Boiling point: " + boilingPoint);
    }
}
