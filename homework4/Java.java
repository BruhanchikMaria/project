package homework4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java {
    public static void main(String[] args) {
       String input="Я люблю JAVA";
        Pattern pattern = Pattern.compile("(//w*)h*(//w*)");
       // Pattern pattern = Pattern.compile("(//w*)h?(//w*)");
       // Pattern pattern = Pattern.compile("(//w*)h+(//w*)");
        Matcher matcher = pattern.matcher(input);
       // while(matcher.find())
       //     System.out.println(matcher.group());

        boolean found=matcher.matches();
        if(found)
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");
    }



}


