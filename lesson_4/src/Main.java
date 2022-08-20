public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(2000,589,"Good","Motor 1");
        Product product2 = new Product(507,1200,"Good","Motor 2");
        Product product3 = new Product(1111,1250,"Poor","Motor 3");
        Product product4 = new Product(1000,1230,"Almost good","Motor 4");



        CheckQuality handlerBase = new BatchCheck().setNextCheck(new WeightCheck().setNextCheck(new PackagingCheck()));

        handlerBase.processesRequest(product1);
        handlerBase.processesRequest(product2);
        handlerBase.processesRequest(product3);
        handlerBase.processesRequest(product4);












    }

}
