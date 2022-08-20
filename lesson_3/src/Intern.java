public class Intern extends Seller{

    public Intern(String name, int points, String category, int sellsCounter) {
        super(name, points, category, sellsCounter);
    }

    @Override
    void pointsCalculator() {
        setPoints(getSellsCounter() * 5);
    }

    @Override
    void defineCategory() {

        this.pointsCalculator();

        if(getPoints() < 50){
            setCategory("Newbie Intern");
        }
        else{setCategory("Expert Intern");}
    }

    @Override
    void showCategory() {

        defineCategory();

        System.out.println("Intern " + getName() + " have a total of " + getPoints() + " points and categorize as " + getCategory()+".");

    }
}
