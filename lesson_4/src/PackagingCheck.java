public class PackagingCheck extends CheckQuality {


    @Override
    public void processesRequest(Product product) {

        if(!product.getPackaging().equals("Good") && !product.getPackaging().equals("Almost good")){

            System.out.println(product.getName() +" failed packaging check.");
        } else if (this.nextCheck != null) {

            this.nextCheck.processesRequest(product);

        }
        else{
            System.out.println( product.getName() + " is ok!");
        }
    }
}
