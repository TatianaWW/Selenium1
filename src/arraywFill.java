 import java.util.Arrays;
 import java.util.List;

 public class arraywFill {
     public static void main(String[] args) {
         // Scanner input = new Scanner(System.in);
         //    int size = input.nextInt();
         String[] grades = new String [5];
         Arrays.fill(grades, "null ");
         System.out.println(Arrays.toString(grades));
         List<String> testing = Arrays.asList(grades);
         }
     }




