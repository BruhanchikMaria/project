package homework4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;

class EasySearchMain extends RegExSearch
    {
        public static void main (String[] args)
        {
            String filePath = "d:/Война и мир.txt";
            String [] text={readAllBytesJava7(filePath)};
            EasySearch count=new EasySearch();
            String elementSearch="война";
            String elementSearch2="и";
            String elementSearch3="мир";

            System.out.println("counter: "+elementSearch+ ":"+count.search(text,elementSearch));
            System.out.println("counter: "+elementSearch2+ ":"+count.search(text,elementSearch2));
            System.out.println("counter: "+elementSearch3+ ":"+count.search(text,elementSearch3));
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

