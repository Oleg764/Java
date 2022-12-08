public class EXC_DZ_2_2 {
    public static void main(String[] args) {
      int[] intArray ={8,3,67,5,3,23,2,3,56}; 
    
    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
     } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
     }
     
}}
