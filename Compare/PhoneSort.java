package Compare;

public class PhoneSort implements Comparable<PhoneSort> {
    String model;
    int prise;
    boolean hasInStock;

    public PhoneSort(String model, int prise, boolean hasInStock) {
        this.model = model;
        this.prise = prise;
        this.hasInStock = hasInStock;
    }

    @Override
    public String toString() {
        final StringBuffer s = new StringBuffer("Phone");
        s.append("model=").append(model);
        s.append(", prise=").append(prise);
        s.append(", hasInStock=").append(hasInStock);

        return s.toString();
    }


    @Override
    public int compareTo(PhoneSort another) {
        if (this.prise == another.prise) {
            return 0;
        } else if (this.prise < another.prise) {
            return -1;
        } else {
            return 1;

        }
    }
}
