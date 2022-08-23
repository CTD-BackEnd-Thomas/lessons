import java.io.Serializable;
import java.util.ArrayList;


public class Company implements Serializable {

    private String cnpj;
    private String companyName;
    private ArrayList<Employee> employeeList;

    public Company(String cnpj, String companyName, ArrayList<Employee> employeeList) {
        this.cnpj = cnpj;
        this.companyName = companyName;
        this.employeeList =  employeeList;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
