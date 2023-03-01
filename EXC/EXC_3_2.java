package EXC;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EXC_3_2 {

    public static void main(String[] args) throws Exception {
        boolean play = true;
        while (play) {
            try (Scanner sc1 = new Scanner(System.in)) {
                String[] fio = new String[6];
                // if (sc1.equals("") | sc1.equals(" "))
                // throw new Exception("String can not be empty!");
                System.out.println("Введите фамилию");
                // printValidValue(sc1, "[a-zA-Z]+");
                String i = sc1.next("[a-zA-Z]+");

                System.out.println("Введите имя");
                String i2 = sc1.next("[a-zA-Z]+");
                // printValidValue(sc1, "[a-zA-Z]+");

                System.out.println("Введите отчество ");
                // printValidValue(sc1, "[a-zA-Z]+");
                String i3 = sc1.next("[a-zA-Z]+");
                System.out.println("Введите дату рождения в формате dd.mm.yyyy ");
                // printValidValue(sc1, "[0-9]+");
                // fio[3] = "Дата рождения:"+i4;
                // fio[2] = "Отчество: "+i3;
                String i4 = sc1.next("[0-9]+");

                System.out.println("Введите пол ");
                // printValidValue(sc1, "[a-zA-Z]+");}}
                String i5 = sc1.next("[a-zA-Z]+");
                System.out.println("Введите Телефон: ");
                // printValidValue(sc1, "[a-zA-Z]+");}}
                String i6 = sc1.next("[0-9]+");

                fio[0] = "Фамилия: " + i;
                fio[1] = "Имя: " + i2;
                fio[2] = "Отчество: " + i3;
                fio[3] = "Дата рождения:" + i4;
                fio[4] = "пол:" + i5;
                fio[5] = "Телефон:" + i6;
                for (int j = 0; j < 6; j++) {

                    System.out.println(fio[j]);
                }
                System.out.println(String.join(">< ", fio));
                FileWriter writer = new FileWriter("UserData");
                writer.write(String.join("><", fio));
                writer.flush();
                writer.close();
                break;
            }

            catch (InputMismatchException e) {
                System.out.println("Неверный ввод");
            }

        }
    }
}
