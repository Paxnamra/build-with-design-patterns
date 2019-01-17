package creational.abstract_factory;

//AbstractProduct
public abstract class CreditCard {

    protected int cardNumberLength;
    protected int ncsNumber;

    public int getCardNumberLength() {
        return cardNumberLength;
    }

    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public int getNcsNumber() {
        return ncsNumber;
    }

    public void setNcsNumber(int ncsNumber) {
        this.ncsNumber = ncsNumber;
    }
}
