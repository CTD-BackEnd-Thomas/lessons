public class DiscountFacade implements IDiscountFacede {

    public String calculateDiscount (Card card, Product product, int quantity){

       CardAPI cardAPI = new CardAPI();
       ProductAPI productAPI = new ProductAPI();
       QuantityAPI quantityAPI = new QuantityAPI();

       int totalDiscount = cardAPI.getDiscount(card) + productAPI.getDiscount(product) + quantityAPI.getDiscount(quantity);

        return "Total discount was: " + totalDiscount;

    }

}
