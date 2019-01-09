package structural.adapter.example1;

public class ChemicalDataBank {

    public float getCriticalPoint(String compound, String point) {

        if (point.equals("M")) {
            switch (compound.toLowerCase()) {
                case "water":
                    return 0.0f;
                case "benzene":
                    return 5.5f;
                case "ethanol":
                    return -114.5f;
                default:
                    return 0f;
            }
        } else {
            switch (compound.toLowerCase()) {
                case "water":
                    return 100.0f;
                case "benzene":
                    return 80.1f;
                case "ethanol":
                    return 78.3f;
                default:
                    return 0f;
            }
        }
    }

    public String getMolecularStructure (String compound){

        switch (compound.toLowerCase()) {
            case "water":
                return "H2O";
            case "benzene":
                return "C6H6";
            case "ethanol":
                return "C2H5OH";
            default:
                return "nothing has been found";
        }
    }

    public double getMolecularWeight (String compound) {

        switch (compound.toLowerCase()) {
            case "water":
                return 18.015;
            case "benzene":
                return 78.1134;
            case "ethanol":
                return 46.0688;
            default:
                return 0;
        }
    }
}
