package EXC;
import java.util.Scanner;

public class EXC_DZ_2{
public static void main(String[] args) {
    Scanner scanInp = new Scanner(System.in);
 while (true) {
        System.out.println("Введите число:");
        try {
          float  num = Float.parseFloat(scanInp.next());
            System.out.println(" Вы ввели " + num);
            break;
        } catch (Exception e) {
            System.out.println("Ошибка,надо ввести дробное число");

        }
    }
}
}