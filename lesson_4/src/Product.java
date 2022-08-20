public class Product {

    private int batch;

    private int weight;

    private String packaging;

    private String name;

    public Product(int batch, int weight, String packaging, String name) {
        this.batch = batch;
        this.weight = weight;
        this.packaging = packaging;
        this.name = name;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
