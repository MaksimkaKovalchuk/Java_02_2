package by.belstu.it.kovalchuk.basejava;

import static java.lang.Math.*;

/**
 * Created by taller on 22.03.2018.
 * @author Maaks Kovalchuk
 * @version 1.0
 */
public class JavaTest {

    private static int _sint;
    final int _finalInt = 45;
    public final int _pubFinalInt = 77;
    public static int _pubStatInt = 55;

    /**
     * @return void
     * @param args
     * @throws 0
     */

    public static void main(String[] args) {
        /**
         * @see private
         * @value 'x'
         */


        System.out.println();
        System.out.print("--------------------");
        System.out.println("Ex b");
        System.out.println("--------------------");
       ///Ex b
        int _int1=1;
        char _ch1='x';
        String _str1="Maks";
        double _db1=2.2;
        short _sh1=10;
        byte _bt1=120;
        long _lg1=1000;
        boolean _bl1=true;

        System.out.print("String+int=" + (_str1+_int1) +"\n"); //String+int
        System.out.print("String+char=" + (_str1+_ch1) +"\n"); //String+char
        System.out.print("String+double=" + (_str1+_db1) +"\n"); //String+double

        _bt1 = (byte) (_bt1+_int1);
        System.out.print("byte=byte+int=" + _bt1 +"\n"); //byte=byte+int

        _int1=(int)(_db1+_lg1);
        System.out.print("int=double+long=" + _int1 +"\n"); //int=double+long

        _int1=3;
        _lg1=(long) (_int1)+2147483647;
        System.out.print("long=int+2147483647=" + _lg1 +"\n"); //long=int+2147483647

        System.out.println(_sint);

        boolean _bl2=_bl1&&_bl1;
        System.out.print("boolean=bolean&&bolean=" + _bl2 +"\n"); //boolean=bolean&&bolean
        boolean _bl3=_bl1^_bl1;
        System.out.print("boolean=bolean^bolean=" + _bl3 +"\n"); //boolean=bolean^bolean
        // Проверьте, можно ли использовать знак "+" в выражениях с типом данных bolean
        // Ответ: нельзя bl=bl+bl; - нельзя bolean+bolean

        //9 223 372 036 854 775 807
        long yhw = 9223372036854775807l;
        long yhw2 = 0x7fff_ffff_fffl;
        System.out.println(yhw +" <-#1 самая длинная чушь #2->" + yhw2 );

        char ch1='a', ch2='\u0061', ch3=97;
        System.out.print(ch1 +"" +ch2 +"" +ch3 +"\n");
        System.out.println("3.45%2.4=" + 3.45%2.4);
        System.out.println("1.0/0.0=" + 1.0/0.0);
        System.out.println("0.0/0.0=" + 0.0/0.0);
        System.out.println("log(-345)=" + log(-345));
        System.out.println("Float.intBitsToFloat(0x7F800000)=" + Float.intBitsToFloat(0x7F800000));
        System.out.println("Float.intBitsToFloat(0xFF800000)" + Float.intBitsToFloat(0xFF800000));


        ///Ex c
        //объяснить между ними разницу:
        //final int
        //public final int
        //public static final int

        System.out.println();
        System.out.print("--------------------");
        System.out.println("Ex d");
        System.out.println("--------------------");
        ///Ex d
        System.out.print(PI +"~" + round(PI) +"\n");
        System.out.print(E +"~" + round(E) +"\n");
        System.out.print("Минимальное число среди round(PI) и round(E)= " + min(round(PI),round(E)) +"\n");
        System.out.println("Рандомное число:" + Math.random());

        System.out.println();
        System.out.print("--------------------");
        System.out.println("Ex e");
        System.out.println("--------------------");
        ///Ex e
        Boolean _objBool = true;
        Integer _objInt = 2;
        Byte _objByte = 3;
        Short _objShort = 33;
        Long _objLong = 2342l;
        Double _objDouble = 223.333;

        System.out.println("Long >>> 1 = "+((_objLong)>>>1));
        System.out.println("Int >> 1 = "+((_objInt)>>1));
        System.out.println("~Byte = " + (~_objByte));
        System.out.println("Int & Short = " + (_objInt & _objShort));
        System.out.println("Int + double = " + (_objInt + _objDouble));
        System.out.println("Int + byte = "+(_objInt+_objByte));
        System.out.println("Int + short = "+(_objInt + _objShort));
        System.out.println("MAX Double = " + (Double.MAX_VALUE));
        System.out.println("MIN Double = " + (Double.MIN_VALUE));
        System.out.println("MAX Long = " + (Long.MAX_VALUE));
        System.out.println("MIN Long = "+(Long.MIN_VALUE));

        Byte _boxByte = 1;
        Integer _boxInteger = 22;
        byte _unboxByte = _boxByte;
        int _unboxInt = _boxInteger;

        System.out.println("parseInt = "+Integer.parseInt("1234"));
        System.out.println("toHexString = "+Integer.toHexString(123));
        System.out.println("compare = "+Integer.compare(123,123));
        System.out.println("toString = "+Integer.toString(123));
        System.out.println("bitCount = "+Integer.bitCount(123));
        System.out.println("isNaN = "+Double.isNaN(2.0));

        System.out.println();
        System.out.print("--------------------");
        System.out.println("Ex f");
        System.out.println("--------------------");
        ///Ex f
        String s34 = "2345";
        System.out.println(new Integer(s34));
        System.out.println(Integer.valueOf(s34));
        System.out.println((Integer.parseInt(s34)));

        String bitString = "Maaks";
        byte[] bitArray = bitString.getBytes();
        String string = new String(bitArray);

        String stringToBool = "true";
        Boolean boolSting1 = Boolean.valueOf(stringToBool);
        Boolean boolString2 = Boolean.parseBoolean(stringToBool);


        String string1 = "Hello";
        String string2 = "Hello";
        System.out.println("string == string = " + (string1 == string2));
        System.out.println("equils = " + (string1.equals(string2)));
        System.out.println("compareTo = " + (string1.compareTo(string2)));
        string2 = null;
        System.out.println("string == string = " + (string1 == string2));
        System.out.println("equils = " + (string1.equals(string2)));
        //System.out.println("compareTo = " + (string1.compareTo(string2)));


        String string3 = "Hello World !!!";
        String[] string3arr = string3.split("");
        System.out.println("contains = " + string3.contains("H"));
        System.out.println("hashCode = " + string3.hashCode());
        System.out.println("indexOf = " + string3.indexOf(2));
        System.out.println("lenth = " + string3.length());
        System.out.println("replace = " + string3.replace("World","Java"));



        System.out.println();
        System.out.print("--------------------");
        System.out.println("Ex g");
        System.out.println("--------------------");
        ///Ex g
        char[][] c1;
        char[] c2[] = {
                {2,2},
                {3,3}
        };
        char c3[] [] = {
                {2,2},
                {3,3}
        };

        boolean b = c3==c2;
        System.out.println(b);

        c1 = new char[3][];
        c1[0] = new char[1];
        c1[1] = new char[2];
        c1[2] = new char[3];
        System.out.println(c1.length + " " + c1[0].length + " " +
                c1[1].length + " " +  c1[2].length);
        c2=c3;

        for(char[] arr :c1) {
            for(char arr2:arr){
                System.out.print(arr2 + " ");
            }
            System.out.println();
        }


        WrapperString ws = new WrapperString("Hello Java !!!");
        ws.replcae("Java","World");

        WrapperString anon = new WrapperString() {
            public void replace(String old, String newstr){
                System.out.println("Oops");
            }

            public  void delete() {
                this.set_string("");
            }

        };
    }
}
