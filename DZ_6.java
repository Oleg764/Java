import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class DZ_6 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer t0, Integer t1) {
                return ((t0-t1)%2==0)?-1:(t0 - t1)%2!=0?1:1;}};
        
        
        for (int i = 0; i < 10; i++) {
            int r = new Random().nextInt(10);
            int s = new Random().nextInt(10);
            int e = new Random().nextInt(10);
            // System.out.println(r);
            hs.add(r);
            lhs.add(s);
            ts.add(e);
        }
        System.out.println("--------");
        System.out.print("hs:");
        hs.forEach(n -> System.out.print(n));
        System.out.println();
        System.out.println("--------");
        System.out.print("lhs:");
        lhs.forEach(n -> System.out.print(n));
        System.out.println();
        System.out.println("--------");
        System.out.print("ts:");
        ts.forEach(n -> System.out.print(n));
        System.out.println();

        System.out.println("--------");
        //3.
        hs.removeAll(lhs);
        System.out.println("3.");
        hs.forEach(n -> System.out.print(n));
        System.out.println();
        
        System.out.println("--------");
        System.out.println("4.");
        ts.addAll(lhs);
        
        ts.forEach(n -> System.out.print(n));
        System.out.println();
        System.out.println("--------");
        System.out.println("5.");
      //5. 
        TreeSet<Integer> ts1 = new TreeSet<>( comparator);   

            for (int j = 0; j < 15; j++) {
                int m = new Random().nextInt(10);
                ts1.add(m);}

                ts1.forEach(n -> System.out.print(n));

}}
