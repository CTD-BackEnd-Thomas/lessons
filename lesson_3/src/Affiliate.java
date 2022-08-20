public class Affiliate extends Seller{


    public Affiliate(String name, int points, String category, int sellsCounter) {
        super(name, points, category, sellsCounter);
    }

    @Override
    void pointsCalculator() {
        setPoints(getSellsCounter() * 15);
    }

    @Override
    void defineCategory() {

        this.pointsCalculator();

        if(getPoints() < 20){
            setCategory("Newbie");
        } else if (getPoints() >= 20 && getPoints() <= 30) {
            setCategory("Apprentice");
        }else if (getPoints() >= 31 && getPoints() <= 40) {
            setCategory("Good");
        }
        else{setCategory("Master");}

    }

    @Override
    void showCategory() {

        defineCategory();

        System.out.println("Affiliate " + getName() + " have a total of " + getPoints() + " points and categorize as " + getCategory() + " seller.");
    }
}
