public class Employee extends Seller {

    private int affiliateCounter;

    private int yearInCompany;

    public Employee(String name, int points, String category, int sellsCounter, int affiliateCounter, int yearInCompany) {
        super(name, points, category, sellsCounter);
        this.affiliateCounter = affiliateCounter;
        this.yearInCompany = yearInCompany;
    }

    public int getAffiliateCounter() {
        return affiliateCounter;
    }

    public void setAffiliateCounter(int affiliateCounter) {
        this.affiliateCounter = affiliateCounter;
    }

    public int getYearInCompany() {
        return yearInCompany;
    }

    public void setYearInCompany(int yearInCompany) {
        this.yearInCompany = yearInCompany;
    }


    public void getAffiliate(){

        this.affiliateCounter++;

    }

    @Override
    void pointsCalculator() {
        setPoints(getAffiliateCounter() * 10 + getSellsCounter() * 5 + getYearInCompany() * 5);
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

       this.defineCategory();

        System.out.println("Employee " + getName() + " have a total of " + getPoints() + " points and categorize as " + getCategory() + " seller.");
    }
}





