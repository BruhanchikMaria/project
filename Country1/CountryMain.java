package Country;

import java.util.Scanner;
import java.util.TreeSet;

public class CountryMain  {

    public static void main(String[] args) {
        for (ECountry c:ECountry.values())
            System.out.println(c);


        System.out.println(ECountry.valueOf("BELARUS"));
        System.out.println(ECountry.valueOf("RUSSIA"));
        System.out.println(ECountry.valueOf("CANADA"));
        System.out.println(ECountry.valueOf("CHINA"));
        System.out.println(ECountry.valueOf("INDIA"));
        System.out.println(ECountry.valueOf("MEXICO"));
        System.out.println(ECountry.valueOf("SUDAN"));
        System.out.println(ECountry.valueOf("BRAZILIA"));
        System.out.println(ECountry.valueOf("AUSTRALIA"));
        System.out.println(ECountry.valueOf("BRITAIN"));

      //  System.out.println(ECountry.valueOf("AFRICA"));

        ECountry belarus;
        belarus = ECountry.BELARUS;

        if (belarus==ECountry.BELARUS){
            System.out.println("True");
        }
        ECountry russia;
        russia = ECountry.RUSSIA;

        if (russia==ECountry.RUSSIA){
            System.out.println("True");
        }

        ECountry mexico;
        mexico = ECountry.MEXICO;

        if (mexico==ECountry.MEXICO){
            System.out.println("True");
        }
        TreeSet<SquareCountry> myCountryArrayList = new TreeSet<SquareCountry>();

        SquareCountry BELARUS = new SquareCountry(208.0);
        SquareCountry RUSSIA = new SquareCountry(17075.0);
        SquareCountry MEXICO = new SquareCountry(1980.0);

        myCountryArrayList.add(BELARUS);
        myCountryArrayList.add(RUSSIA);
        myCountryArrayList.add(MEXICO);

        for (SquareCountry c:myCountryArrayList)
        {
            System.out.println(c);}


    }






}
