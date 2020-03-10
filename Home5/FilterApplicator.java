package Home5;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FilterApplicator<T> {

    public static <T> void main(String[] args) {

        List list = new ArrayList();
        list.add("Spring");
        list.add(2);
        list.add(5.00);
        list.add('$');
        list.add("Summer");

        filter(list, new Filter<>());
        System.out.println(list);
    }


    public static void filter(List elements, Filter filter) {
        filter.filtration(elements);
        System.out.println(elements);
    }

}





