import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Contact contact = new Contact("Marcos","marc@marc.com","4788783478");
        Contact contact1 = new Contact("João","joao@gmail.com","5445645646");
        Contact contact2 = new Contact("Maria","maria@gmail.com","54564456");
        Contact contact3 = new Contact("Marilia","marilia@gmail.com","41636879");
        Contact contact4 = new Contact("Tiago","tiago@gmail.com","4564689789");

        List<Contact> contactList = new ArrayList<>();

        contactList.add(contact);
        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);
        contactList.add(contact4);




        //Export to file
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("contacts.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(contactList);

            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Import from file

        try {
            FileInputStream fileInputStream = new FileInputStream("contacts.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            List<Contact> contacts;

            contacts = (ArrayList) objectInputStream.readObject();

            for(Contact c: contacts){

                System.out.println(c.getName() + " " + c.getFone() + " " + c.getEmail());

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
