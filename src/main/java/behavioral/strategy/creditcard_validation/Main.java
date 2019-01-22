package behavioral.strategy.creditcard_validation;

public class Main {
    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("346612162228022");
        amexCard.setDate("04/20");
        amexCard.setCvv("895");

        System.out.println("Is Amex valid: " + amexCard.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());

        amexCard2.setNumber("346612162228020");
        amexCard2.setDate("04/20");
        amexCard2.setCvv("895");

        System.out.println("Is Amex valid: " + amexCard2.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("4556877348941973");
        visaCard.setDate("01/21");
        visaCard.setCvv("883");

        System.out.println("\nIs Visa valid: " + visaCard.isValid());




    }
}
