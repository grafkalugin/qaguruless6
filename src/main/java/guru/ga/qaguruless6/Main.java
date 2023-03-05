package guru.ga.qaguruless6;

public class Main {
    public static void main(){
        System.out.println("Hello world!");

        boolean aBool = true; // используем

        //целочисленные типы данных

        byte abyte = -128;// 8bit // -128 до 127 (2^(bit - 1))
        abyte = (byte) (abyte +1); // если кладём в bite тип int нужно указывать (byte), если в int положим bite, то сменится автоматически

        short ashort; // 16bit // -32 768 до 32 767
        int aint; // 32bit // -2 147 483 648 до 2 147 483 647 // используем
        long along; // 64bit // –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807

        //типы данных с плавающей точкой

        float afloat = 1.0F; // 32bit
        double adouble= 1.0; // 64bit (1.0D) // используем* если не нужны мат операции

        char achar = 'a'; //символ

        // Операторы
        // 1. Присвоение "=" // int a = 1;
        // 2. Математические int res = 5 - 3; '-', '+', '*', '/', '%'
        // При делении целых чисел отрезается остаток, он вычисляется знаком '%'  (5 % 3 = 2) отстаток = 2
        // Если переполнили переменную значением (положили в short 130) присвоется значение 0
        // На 0 делить нельзя
        // 3. Операторы сравнения '>', '<', '>=', '<=', '!=', '=='.
        // System.out.println("Result =" + (3>2));
        // 4. Логические операторы '|' - или, '||' - или, '&' - и, '&&' - и, '!' - отпицание не,
        // if (3 > 2 & 4 > 3){}
        // если используем && то при отрицательном результате до && дальше вычисление идти не будет
        // int a = null; if (a! = null && a.lenght() == 3){} // если поставить & то в строке a.lenght() вылетит NPE
        // if (3 > 2 || 4 > 3){}
        // if (!(3 > 2 || 4 > 3)){} // знак ! меняет полярность true->false
        // 5. Тернарный оператор
        // int value = (true) ? 10 : 20; присвоит 10
        // int value = (false) ? 10 : 20; присвоит 20
        // int value = (true)
        //      ? 10
        //      : 20;
        // 6. instanceof
        // if (s instanceof String) {} // проверка типа переменной
        // 7. Wrapper types для использования примитивов так где их использовать нельзя, например в List<Integer>
        // boxing - unboxing - процес перевода int в Integer (в ожидаемые Integer можно передавать int и наоборот)
        // У Integer (всех Wrapper) дефолтное значение null, а у int (примитивов) 0
        // Integer integerWrapper; int
        // Double doubleWrapper; double
        // Character charWrapper; char
        // Switch (a){
        // case "dima": {System.out.println("Name Dima"); break;}
        // case "sasha": {System.out.println("Name Sasha"); break;}
        // default: {System.out.println("default"); break;} // break; не нужно добавлять в новых версиях Java
        // }
        // if (){}
        // else if (){}
        // else {}

    }
}
