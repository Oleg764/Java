
import java.util.ArrayList;

import java.io.*;

import java.io.File;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        int i = (int) (Math.random() * (2001)) - 1000;

        System.out.println("Случайное число от -1000 до 1000 :" + i);
        int absi = Math.abs(i);
        String i2 = Integer.toString(absi, 2);
        int n = (int) i2.length();
        System.out.println("Номер старшего бита :" + n);
        System.out.println("Max value :" + Short.MAX_VALUE);
        ArrayList<String> arrList = new ArrayList<String>();
        int i1;
        i1 = Short.MAX_VALUE - i;
    
        System.out.println("MIN value :" + Short.MIN_VALUE);
        int i3 = i - Short.MIN_VALUE;
        
        for (int j = 0; j < i1; j++) {
            i += 1;
            if (i % n == 0) {
                arrList.add(String.valueOf(i));
            }
        }
        Object[] m1 = arrList.toArray();
        File file = new File("m1.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                PrintWriter pw = new PrintWriter(file);

                for (Object value : m1)
                    pw.println(value);
                pw.flush();
                pw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            file.delete();
            try {
                file.createNewFile();
                PrintWriter pw = new PrintWriter(file);

                for (Object value : m1)
                    pw.println(value);
                pw.flush();
                pw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            ArrayList<String> arr2List = new ArrayList<String>();

            for (int j = 1; j < i3; j++) {
                i = i - 1;
                if (i % n != 0) {
                    arr2List.add(String.valueOf(i));
                }
            }
            System.out.println("Кол-во чисел не кратных n : " + arr2List.size());
            Object[] m2 = arr2List.toArray();
            File file2 = new File("m2.txt");
            if (!file2.exists()) {
                try {
                    file2.createNewFile();
                    PrintWriter pw2 = new PrintWriter(file2);

                    for (Object value : m2)
                        pw2.println(value);
                    pw2.flush();
                    pw2.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                file2.delete();
                try {
                    file2.createNewFile();
                    PrintWriter pw2 = new PrintWriter(file2);

                    for (Object value : m2)
                        pw2.println(value);
                    pw2.flush();
                    pw2.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
