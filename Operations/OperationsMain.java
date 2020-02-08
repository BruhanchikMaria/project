package Operations;

public class OperationsMain {
    public static void main(String[] args) {

        int x = 42;
        int y = 15;
        int z = (x << y);
        int s = (x >> y);
        {
           System.out.println(Integer.toBinaryString(0));//101010
            System.out.println(Integer.toBinaryString(y));//1111
            System.out.println(~x);//-43 (11111111111111111111111111010101)заменяем нули на 1 и 1 на нули
            System.out.println(~y);//-16 (11111111111111111111111111110000)
            System.out.println(x & y);//10 (1010) бит равен 1, если оба бита равны 1
           // System.out.println(x &= y);
            System.out.println(x | y);//15 (1111)еcли хотя бы 1 бит равен 1, то результат равен 1
           // System.out.println(x |= y);
             System.out.println(x ^ y);//37 (100101)результат равен 1, только если один из битов равен 1
            //System.out.println(x ^= y);
             System.out.println(z);//1376256 (101010000000000000000)число 42 умножаем на 2 пятнадцать раз
             System.out.println((x <<=y));//1376256
             System.out.println(s);//0  число 42 делим на 2 пятнадцать раз, мы вышли за пределы ячеек(где все нули)
             System.out.println(x >>= y);
             System.out.println(x >>> y);//0 заполнение старшего бита нулем
             System.out.println(x >>>= y);

        }
        int a = -42;
        int b = -15;
        int zz = (a << b);
        int ss = (a >> b);
        {
            System.out.println(Integer.toBinaryString(a));//11111111111111111111111111010110
            System.out.println(Integer.toBinaryString(b));//11111111111111111111111111110001
            System.out.println(~a);//41 (101001)заменяем нули на 1 и 1 на нули
            System.out.println(~b);//14 (1110)
            System.out.println(a & b);//-48 (11111111111111111111111111010000)бит равен 1, если оба бита равны 1
            // System.out.println(a &= b);
            System.out.println(a | b);//-9 (11111111111111111111111111110111)еcли хотя бы 1 бит равен 1, то результат равен 1
            // System.out.println(a |= b);
            System.out.println(a ^ b);//39 (100111)результат равен 1, только если один из битов равен 1
            //System.out.println(a ^= b);
            System.out.println(zz);//-5505024 (11111111101011000000000000000000)число -42 умножаем на 2 пятнадцать раз
            System.out.println((a <<=b));//-5505024
            System.out.println(ss);//-1 (11111111111111111111111111111111) число -42 делим на 2 пятнадцать раз, мы вышли за пределы ячеек(где все нули)
            System.out.println(a >>= b);//-42 (11111111111111111111111111010110)
            System.out.println(a >>> b);//32767 (111111111111111)заполнение старшего бита нулем
            System.out.println(a >>>= b);//32767

        }
    }}