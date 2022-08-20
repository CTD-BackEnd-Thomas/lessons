public class BatchCheck extends CheckQuality {

    @Override
    public void processesRequest(Product product) {

        if(product.getBatch() < 1000 || product.getBatch() > 2000){

            System.out.println(product.getName() + " failed batch check.");
        } else if (this.nextCheck != null) {

            this.nextCheck.processesRequest(product);

        }

    }


}
