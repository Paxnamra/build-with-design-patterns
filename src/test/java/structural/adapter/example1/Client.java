package structural.adapter.example1;

public class Client {
    public static void main(String[] args) {
        //Compound compound = new Compound();

        Compound compound1 = new RichCompound("water");
        compound1.display();
    }

    //TODO something's missing, figure out what makes NullPointer jump in
}
