public class Main {


    public static void main(String[] args) {

        Card card1 = new Card("4464664464646","Star Bank");
        Product product = new Product("Vegetables","Can");


        DiscountFacade facade = new DiscountFacade();



        System.out.println( facade.calculateDiscount(card1,product,15) );

    }
}
