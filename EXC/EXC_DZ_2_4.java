package EXC;
import java.util.Scanner;
public class EXC_DZ_2_4 {
public static String input(String messege)throws Exception {
    String s = null;
    Scanner reader = new Scanner(System.in);
    s = reader.nextLine();
    if (s.equals("") | s.equals(" ")) {
        throw new Exception("String can not be empty!");
    }
    return s;}
    public static void main(String[] args) {
    while (true) {
        try {
            System.out.print("Enter user name: ");
            System.out.println(" Добро пожаловать " + input(null));
            break;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
}