package by.belstu.it.kovalchuk.basejava;

import static java.lang.Long.MAX_VALUE;
import static java.lang.Long.MIN_VALUE;
import static java.lang.Math.*;

/**
 * Created by Максим on 22.02.2017.
 */
public class JavaTest {
    public static void main(String[] args) {
        int in=1;
        char ch='x';
        double db=2.2;
        short sh=10;
        byte bt=120;
        long lg=1000;
        boolean bl=true;

        System.out.print("String"+in +"\n"); //String+int
        System.out.print("String"+ch +"\n"); //String+char
        System.out.print("String"+db +"\n"); //String+double
        bt= (byte) (bt+in);
        System.out.print(bt +"\n"); //byte=byte+int
        in=(int)(db+lg);
        System.out.print(in +"\n"); //int=double+long
        in=3;
        lg=(long) (in)+2147483647;
        System.out.print(lg +"\n"); //long=int+2147483647
        //static int sint=2;
        bl=bl&&bl;
        System.out.print(bl +"\n"); //boolean=bolean&&bolean
        bl=bl^bl;
        System.out.print(bl +"\n"); //boolean=bolean^bolean
        //bl=bl+bl; - нельзя bolean+bolean
        char ch1='a', ch2='\u0061', ch3=97;
        System.out.print(ch1 +"" +ch2 +"" +ch3 +"\n");
        System.out.print(3.45%2.4);           System.out.print("\n");
        System.out.print(1.0/0.0);            System.out.print("\n");
        System.out.print(0.0/0.0);            System.out.print("\n");
        System.out.print(log(-345));          System.out.print("\n");
        System.out.print(Float.intBitsToFloat(0x7F800000));
        System.out.print("\n");
        System.out.print(Float.intBitsToFloat(0xFF800000));
        System.out.print("\n");

        //final int
        //public final int
        //public static final int

        System.out.print(PI +"~" + round(PI) +"\n");
        System.out.print(E +"~" + round(E) +"\n");
        System.out.print(min(round(PI),round(E)) +"\n");

        Boolean bl2_1=true;
        Character ch2_1=1000;
        Integer in2_1=100;
        Byte bt2_1=101;
        Short sh2_1=50;
        Long ln2_1=MIN_VALUE;
        Double db2_1= Double.valueOf(MAX_VALUE);

        int in2_2=5;
        in2_2=in2_1;        //автораспаковка
        in2_1=in2_2*2;      //автоупоковка
    }
}
