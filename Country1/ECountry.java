package Country;

public enum ECountry implements Country {

    BELARUS(208.0, 9.5),
    RUSSIA(17075.0, 143.4),
    CANADA(10000.0, 33.00),
    CHINA(10000.0, 1306.3),
    INDIA(3300.0, 1080.0),
    MEXICO(1980.0, 106.2),
    SUDAN(2505.0, 40.15),
    BRAZILIA(8511.0, 186.1),
    AUSTRALIA(7687.0, 20.1),
    BRITAIN(243.8, 66.0);




    double sqr;
    double population;

    ECountry(double sqr, double population) {
        this.sqr = sqr;
        this.population = population;
    }

    public double sqr(double s) {
        return s;
    }

    public double population(double people) {
        return people;
    }
}




