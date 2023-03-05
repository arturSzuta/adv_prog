package day2.Task25;


public class Basket {
    private int numberOfItems;

    public Basket() {
        this.numberOfItems = 0;
    }
    public void addToBasket() throws BasketFullException {
        if (numberOfItems == 10) {
            throw new BasketFullException("To many items in the basket");
        }
        numberOfItems++;
    }
    public void removeFromBasket() throws BasketEmptyException {
        if (numberOfItems == 0) {
            throw new BasketEmptyException("Basket is already empty");
        }
        numberOfItems--;
    }
}
