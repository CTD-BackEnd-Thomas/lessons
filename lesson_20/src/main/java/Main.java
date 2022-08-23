import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("José", "Martins", "54545", 1000d);
        Employee employee2 = new Employee("Mario", "Kuhn", "45664", 2300d);
        Employee employee3 = new Employee("Marcos", "Castro", "15437", 2540d);
        Employee employee4 = new Employee("João", "da Silva", "312312", 7000d);

        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(employee);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        Company company = new Company("456456456456456", "CAT Transports", employeeList);


        ArrayList<Company> companyList = new ArrayList<>();

        companyList.add(company);

        //Export to file
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("company.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(companyList);

            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Import from file

        ArrayList<Company> companyList2;
        try {
            FileInputStream fileInputStream = new FileInputStream("company.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            companyList2 = (ArrayList) objectInputStream.readObject();

            for (Company c : companyList2) {

                System.out.println(c.getCnpj() + " " + c.getEmployeeList() + " " + c.getCompanyName());

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        //Challenge

        for (Company c : companyList2) {

            try {
                FileWriter fileWriter = new FileWriter("company2.txt");
                fileWriter.write(c.getCnpj() + "; " + c.getEmployeeList() + ";" + c.getCompanyName() + "\n");

                fileWriter.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }


}
