package day2.Task25;



public class Task25 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        try {
            basket.addToBasket();
        } catch (BasketFullException ex) {
            System.out.println("Catch");
        }
    }
}
