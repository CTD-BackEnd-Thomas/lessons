import java.io.Serializable;

public class Contact implements Serializable {

    private String name;
    private String email;
    private String fone;


    public Contact(String name, String email, String fone) {
        this.name = name;
        this.email = email;
        this.fone = fone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
