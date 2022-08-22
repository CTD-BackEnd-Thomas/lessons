import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        WebPage webPage = new WebPage("Google", "www.goole.com");
        WebPage webPage1 = new WebPage("BBC", "www.bbc.uk");
        WebPage webPage2 = new WebPage("Netflix", "www.netflix.com");
        WebPage webPage3 = new WebPage("Amazon", "www.amazon.com");

        ArrayList<WebPage> favoriteWebPages = new ArrayList<>();

        favoriteWebPages.add(webPage);
        favoriteWebPages.add(webPage1);
        favoriteWebPages.add(webPage2);
        favoriteWebPages.add(webPage3);


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("favoriteWebPages.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(favoriteWebPages);

            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("favoriteWebPages.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            List<WebPage>pages = new ArrayList<>();

            pages = (ArrayList) objectInputStream.readObject();

            for (WebPage page : pages){

                System.out.println(page.getName());
            }


        objectInputStream.close();

        }  catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }


}
