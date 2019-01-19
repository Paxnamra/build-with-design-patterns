package behavioral.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {

        //handlers
        Director allen = new Director();
        CEO magda = new CEO();
        VP tony = new VP();

        //passing to successors
        magda.setSuccessor(allen);
        allen.setSuccessor(tony);

        //Director handled the request
        Request request = new Request(RequestType.CONFERENCE, 500);
        allen.handleRequest(request);

        //VP handled the request
        Request request2 = new Request(RequestType.PURCHASE,1100);
        allen.handleRequest(request2);

        //Director handled the request
        Request request3 = new Request(RequestType.CONFERENCE, 2000);
        allen.handleRequest(request3);

    }
}
