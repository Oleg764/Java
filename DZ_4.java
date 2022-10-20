import java.util.ArrayList;


import java.util.LinkedList;
import java.util.Scanner;

public class DZ_4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<String[]> name = new ArrayList<>();
            ArrayList<String> sex = new ArrayList<>();
            ArrayList<Integer> age = new ArrayList<>();
            LinkedList<Integer> id = new LinkedList<>();

            boolean lr = true;
            while (lr) {
                System.out.println("Enter user name (Ivanov Ivan Ivanovich): ");
                name.add(sc.nextLine().split(" "));

                System.out.println("Is user man or woman: ");
                sex.add(sc.nextLine());

                System.out.println("Enter user age: ");
                age.add(sc.nextInt());

                id.add(name.size() - 1);

                System.out.println("New user? Y/N ");
                sc.nextLine();
                if (sc.nextLine().toLowerCase().contains("n"))
                    lr = false;
            }

            for (int index = 0; index < id.size(); index++) {
                System.out.println("User name: " +
                        name.get(name.size() - 1)[0] + " " +
                        name.get(name.size() - 1)[1].toUpperCase().charAt(0) + "." +
                        name.get(name.size() - 1)[2].toUpperCase().charAt(0) + ". " +
                        "User id: " + name.get(id.size() - 1).hashCode());

                System.out.print(age.get(id.get(index)) + " years " + ", ");
                System.out.println(" id " + id.get(index) + " ");
                System.out.println(" sex: " + sex.get(index) + " ");
            }
            System.out.println("Sort by age ");

            int count2 = id.size() - 1;
            while (count2 > -1) {
                int maxAge = age.get(id.get(count2));
                int index = count2;

                for (int i = 0; i < count2; i++) {
                    if (maxAge > age.get(id.get(i))) {
                        // index = i;
                        maxAge = age.get(id.get(i));
                    }
                }
                int temp = id.get(index);
                id.set(index, id.get(count2));
                id.remove(count2);
                id.add(temp);
                count2--;
            }

            System.out.println("After sort: ");
            for (int index = 0; index < id.size(); index++) {
                System.out.println("User name: " +
                        name.get(id.get(index))[0] + " " +
                        name.get(id.get(index))[1].toUpperCase().charAt(0) + "." +
                        name.get(id.get(index))[2].toUpperCase().charAt(0) + ". ");
                System.out.print(age.get(id.get(index)) + " years " + ", ");
                System.out.println(" id " + id.get(index) + " ");
                System.out.println(" sex: " + sex.get(index) + " ");
            }
        }
    }

}
