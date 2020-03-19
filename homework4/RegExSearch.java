package homework4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {


    @Override
     public int search(String text, String element) {
         int count=0;
        Pattern pattern=Pattern.compile(element);
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()){
            count++;

        }
         return count;
        }
}
