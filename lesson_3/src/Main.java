public class Main {

    public static void main(String[] args) {

        Seller employee1 = new Employee("Carlos",0,"none",12,2,10);

        Seller affiliate1 = new Affiliate("Marta",0,"None",0);

        Seller intern1 = new Intern("Barnie",0,"None",0);


        employee1.showCategory();

        affiliate1.sell();
        affiliate1.sell();

        affiliate1.showCategory();

        intern1.showCategory();


    }

}
