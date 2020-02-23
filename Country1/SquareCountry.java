package Country;

public class SquareCountry implements Comparable<SquareCountry>{
    double sqr;

    public SquareCountry(double sqr) {
        this.sqr = sqr;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ECountry");
        sb.append("sqr=").append(sqr);
        return sb.toString();
    }

    @Override
    public int compareTo(SquareCountry another) {
        if (this.sqr == another.sqr) {
            return 0;
        } else if (this.sqr < another.sqr) {
            return -1;
        } else {
            return 1;
        }

    }

}
