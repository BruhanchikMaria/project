package Home5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListMain {
    public static void main(String [] args){
        Random password=new Random();
        List<String> list=new ArrayList<>();
        String s="BM34646556";

        long start=System.currentTimeMillis();
        for (int i=0;i<1000000;i++) {
        list.add(s);
        }
        long finish=System.currentTimeMillis();
        long distance=finish-start;
        System.out.println("ArrayList time:"+distance);
        System.out.println(list.size());

        long startRem=System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            list.removeAll(list);
        }
        long finishRem=System.currentTimeMillis();
        long result2=finishRem-startRem;
        System.out.println("Remove time:"+result2);

    }
}
