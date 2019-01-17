package behavioral.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Director allen = new Director();
        CEO magda = new CEO();
        VP tony = new VP();


        magda.setSuccessor(allen);
        allen.setSuccessor(tony);

        Request request = new Request(RequestType.CONFERENCE, 500);
        allen.handleRequest(request);

        Request request2 = new Request(RequestType.PURCHASE,1100);
        allen.handleRequest(request2);

        Request request3 = new Request(RequestType.CONFERENCE, 2000);
        magda.handleRequest(request3);

    }
}
