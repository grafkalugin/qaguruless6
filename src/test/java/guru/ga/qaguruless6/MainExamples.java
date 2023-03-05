package guru.ga.qaguruless6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainExamples {

    public void trueFalse(){}

    public void dataTypes(){

        //бинарный тип данных
        boolean aBool = true;

        //целочисленные типы данных
        byte abyte = -128;// 8bit // -128 до 127 (2^(bit - 1))
        abyte = (byte) (abyte +1); // если кладём в bite тип int нужно указывать (byte), если в int положим bite, то сменится автоматически
        short ashort = -32768; // 16bit // -32 768 до 32 767
        int aint = 2147483647; // 32bit // -2 147 483 648 до 2 147 483 647 // используем
        long along = 9223372036854775807L; // 64bit // –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807

        //типы данных с плавающей точкой
        float afloat = 1.0F; // 32bit
        double adouble= 1.0; // 64bit (1.0D) // используем* если не нужны мат операции
        char achar = 'a'; //символ

        // Если переполнили переменную значением (положили в short 130) присвоется значение 0
        //byte overbyte0 = 128; // сразу отображает ошибку error: incompatible types: possible lossy conversion from int to byte
        //System.out.println(overbyte3);
        byte overbyte1 = 127;
        byte overbyte2 = 126;
        byte overbyte3 = (byte) (overbyte1 + overbyte2);
        System.out.println(overbyte3);// после переполнения появляется знак '-', ответ '-119'
    }


    public void operators(){

        // 1. Присвоение "="
        int a = 1;

        // 2. Математические '-', '+', '*', '/', '%'
        int resa = 5-3; // 2
        int resb = 5+5; // 10
        int resc = 5*5; // 25
        int resd = 10/5; // 2 // На 0 делить нельзя
        int rese = 5%2; // 1 // При делении целых чисел отрезается остаток, он вычисляется знаком '%'  (5 % 3 = 2) отстаток = 2

        // 3. Операторы сравнения '>', '<', '>=', '<=', '!=', '=='.
        System.out.println("Result =" + (3>2)); // true
        System.out.println("Result =" + (1<2)); // true
        System.out.println("Result =" + (3>=3)); // true
        System.out.println("Result =" + (1<=2)); // true
        System.out.println("Result =" + (3!=2)); // true
        System.out.println("Result =" + (3==3)); // true

        // 4. Логические операторы '|' - или, '||' - или расширенное, '&' - и, '&&' - и расширенное, '!' - отпицание не,
        if (3 > 2 & 4 > 3){System.out.println("Happy");}
        // если используем && то при отрицательном результате до && дальше вычисление идти не будет
        Integer aCompare = 5;
        if (aCompare != null && aCompare.toString().length() == 3){
            System.out.println("No error result");
        } else {
            System.out.println("No error result");
        } // если поставить & то в строке a.lenght() вылетит NPE
        if (3 > 5 || 4 > 3){System.out.println("Happy");} else {}
        if (!(3 == 2 || 4 < 3)){System.out.println("Happy");} else {} // знак ! меняет полярность true->false

        // 5. Тернарный оператор
        int valueTer1 = (true) ? 10 : 20; //присвоит 10
        int valueTer2 = (false) ? 10 : 20; //присвоит 20
        int valueTer3 = (true)
              ? 10
              : 20;

        // 6. instanceof // проверка типа переменной
        String s = "string";
        if (s instanceof String) {System.out.println("Happy");} else {}

        // 7. Wrapper types для использования примитивов там где их использовать нельзя, например в List<Integer>
        // boxing - unboxing - процес перевода int в Integer (в ожидаемые Integer можно передавать int и наоборот)
        // У Integer (всех Wrapper) дефолтное значение null, а у int (примитивов) 0
        Integer integerWrapper; //null
        int wrInt; //0
        wrInt = 5; //5
        integerWrapper = wrInt; // передаём int в Integer
        int wrInt2 = integerWrapper; // передаём Integer в int
        Double doubleWrapper; //double
        Character charWrapper; //char
        List<Integer> intlist = new ArrayList<>();

        // 8. Логические операторы
        // switch работает с примитивными типами данных byte, short, char, and int и со String.
        String name = "Vasiliy";
        switch(name){
        case "Dima":
            System.out.println("Name Dima");
            break;
        case "Sasha":
            System.out.println("Name Sasha");
            break;
        case "Danil": case "Konstantin": // один ответ на несколько вариантов
            System.out.println("Name Specific");
            break;
        default:
            System.out.println("noname");
            break; // break; не нужно добавлять в новых версиях Java
        }
        //if
        if (true) {
                System.out.println("Happy");
        }
        else if (false) {
                System.out.println("Case2");
        }
        else {
            System.out.println("CaseDefault");
        }
    }
}
