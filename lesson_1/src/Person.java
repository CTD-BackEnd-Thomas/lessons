import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Person {

    private String firstName;
    private String lastName;
    private String email;

    private Birthday birthday;


    public Person(String firstName, String lastName, String email, Birthday birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthday = birthday;
    }

    public String showFullName(){

        return this.lastName + "," + this.firstName;

    }

    public int ageCalculador() {

        return (int) ChronoUnit.YEARS.between(LocalDate.of(birthday.getYear(), birthday.getMonth(), birthday.getDay()), LocalDate.now());
    }

    public boolean haveMore18years(){

        return ageCalculador() > 18;

    }

}
