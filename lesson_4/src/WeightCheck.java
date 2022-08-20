public class WeightCheck extends CheckQuality {

    @Override
    public void processesRequest(Product product) {

        if(product.getWeight() < 1200 || product.getWeight() > 1300){

            System.out.println(product.getName() + " failed weight check.");

        } else if (this.nextCheck != null) {

            this.nextCheck.processesRequest(product);

        }

    }



}
