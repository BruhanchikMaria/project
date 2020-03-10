package Home5;

import java.util.List;

public class GenericSort implements IGenericSort, Comparable {
    private String name;
    private int number;


    public GenericSort(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        final StringBuffer sb = new StringBuffer("GenericSort ");
        sb.append("name=").append(name);
        sb.append(", number=").append(number);
        return sb.toString();
    }

    @Override
    public int compareTo(GenericSort anotherSort) {
        if (this.number == anotherSort.number) {
            return 0;
        } else if (this.number < anotherSort.number) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}





