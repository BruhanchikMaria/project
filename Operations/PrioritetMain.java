package Operations;

public class PrioritetMain {
    public static void main(String[] args) {
        int x = 5 + 2 / 8;
        System.out.println(x);//5 т.к. при 2/8=0
        int y = (5 + 2) / 8;
        System.out.println(y);//0 т.к. 7/8=0
        int a = 2;
        int v = 8;
        int z = (5 + a++) / 8;
        System.out.println(z);
        int q = (5 + a++) / --v;
        System.out.println(q);//1 т.к. 8/7=1
        int w = (5 + 2 >> a++) / --v;
        System.out.println(w);//0  т.к. при сдвиге 7 на 3 бита вправо вышли за допустимый диапазон
        int c = (5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --v;
        System.out.println(c);//0 т.к. результат 0,71 записываем без остатка
        //int r=(5+7>20?68>=68:22*2>>a++)/--v;
        //System.out.println(r);)
        boolean n = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println(n);//false т.к. true&&false=false
        boolean m = true && false;
        System.out.println(m);//false т.к. true&&false=false


    }
}
