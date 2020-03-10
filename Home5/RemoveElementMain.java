package Home5;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class RemoveElementMain {
    public static void main(String[] args) throws Exception {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Venera");
        planets.add("Mars");
        planets.add("Saturn");
        planets.add("Neptun");
        System.out.println("planets " + planets.size());


        Iterator<String> itr = planets.iterator();
        while (itr.hasNext()) {
            String next = itr.next();
            itr.remove();

            try {
                for (String i : planets) {
                    //  if ( i=="Saturn"){
                    planets.remove(2);
                }
                System.out.println(planets);
            } catch (ConcurrentModificationException e) {
                System.out.println("Ошибка модификации");
                throw new Exception();
            }
        }
    }
}