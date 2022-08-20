public abstract class Seller {

    private String name;

    private int points;

    private String category;

    private int sellsCounter;

    public Seller(String name, int points, String category, int sellsCounter) {
        this.name = name;
        this.points = points;
        this.category = category;
        this.sellsCounter = sellsCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSellsCounter() {
        return sellsCounter;
    }

    public void setSellsCounter(int sellsCounter) {
        this.sellsCounter = sellsCounter;
    }

    public void sell () {

        this.sellsCounter++;

    }

    abstract void pointsCalculator ();

    abstract void defineCategory();

    abstract void showCategory();


}
