package structural.bridge.movies_details;

public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("Adventures of Jackie Chan");
        movie.setRuntime("2:20h");
        movie.setYear("2000");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);

        System.out.println(printedMaterial);

        HtmlFormatter htmlFormatter = new HtmlFormatter();

        String htmlMaterial = moviePrinter.print(htmlFormatter);

        System.out.println(htmlMaterial);


    }
}
