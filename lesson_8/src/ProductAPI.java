public class ProductAPI {

    public int getDiscount (Product product){

        if(product.getType().equals("Can")){

            return 10;

        }
        return 0;
    }

}
