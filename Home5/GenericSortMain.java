package Home5;
import java.util.*;

public class GenericSortMain {
    public static void main(String[] args) {
        ArrayList<GenericSort> myPeopleArrayList = new ArrayList<>();

        GenericSort firstPerson = new GenericSort("Olya",35);
        GenericSort secondPerson = new GenericSort("Ilya",26);
        GenericSort thirdPerson = new GenericSort("Nastya",28);

        myPeopleArrayList.add(firstPerson);
        myPeopleArrayList.add(secondPerson);
        myPeopleArrayList.add(thirdPerson);



      Collections.sort(myPeopleArrayList, (firstElement, secondElement) -> firstElement.compareTo(secondElement));
        System.out.println(myPeopleArrayList);
    }
}
