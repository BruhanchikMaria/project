package homework4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RedExMain {
    public static void main(String[] args) {
        String filePath = "d:/Война и мир.txt";
        String text=readAllBytesJava7(filePath);
        RegExSearch count=new RegExSearch();
        EasySearch count2=new EasySearch();
        String elementSearch="война";
        String elementSearch2="и";
        String elementSearch3="мир";

        System.out.println("counter: "+elementSearch+ ":"+count.search(text,elementSearch));
        System.out.println("counter: "+elementSearch2+ ":"+count.search(text,elementSearch2));
        System.out.println("counter: "+elementSearch3+ ":"+count.search(text,elementSearch3));

        System.out.println("counter2: "+elementSearch+ ":"+count2.search(text,elementSearch));
        System.out.println("counter2: "+elementSearch2+ ":"+count2.search(text,elementSearch2));
        System.out.println("counter2: "+elementSearch3+ ":"+count2.search(text,elementSearch3));
    }

    private static String readAllBytesJava7(String filePath)
    {
        String content = "";

        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return content;
    }

}

