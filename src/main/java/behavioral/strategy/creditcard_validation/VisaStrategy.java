package behavioral.strategy.creditcard_validation;

public class VisaStrategy extends ValidationStrategy {

    @Override
    public boolean isVaid(CreditCard creditCard) {
        boolean isValid = true;
        isValid = creditCard.getNumber().startsWith("4");

        if (isValid) {
            isValid = creditCard.getNumber().length() == 16;
        }

        if(isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }
        return isValid;
    }
}
