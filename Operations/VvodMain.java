package Operations;

import java.util.Objects;
import java.util.Scanner;

public class VvodMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();
        boolean space;
        boolean space1;
       String str1=new String("Вася");
       String str2=new String("Анастасия");

        space=str1.equals(name);
        space1=str2.equals(name);

      // 1 СПОСОБ


         if (space==true)
         { { System.out.println("Привет! \n"+ "Я тебя так долго ждал");
        }

        if (space1==true)
        { System.out.println("Я тебя так долго ждал");
        }}
         else
        {
            System.out.println("Добрый день, а вы кто?");
            }


          /* //2 СПОСОБ


        if (space==true)
        { System.out.println("Привет! \n"+ "Я тебя так долго ждал");
        }

        else if (space1==true)
        { System.out.println("Я тебя так долго ждал");
        }
        else
        {
            System.out.println("Добрый день, а вы кто?");
        }

        //3 СПОСОБ

        switch (name){
            case "Вася":
                System.out.println("Привет! \n"+ "Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;
        } */

    }
  }

