import java.util.Arrays;
import java.util.List;

 public class arrayw2D {
     public static void main(String[] args) {
         int[][] studentGrades = {
                 {1, 5, 3}, {8, 4, 2, 4, 3, 5}, {4, 6, 2}
         };
         //System.out.println(studentGrades.length);
        // System.out.println(studentGrades[1].length);
         for(int i=0; i< studentGrades.length; i++) {
             for (int k=0; k< studentGrades[i].length; k++) {
                 System.out.print(studentGrades[i][k] + " ");
             }
             System.out.println();}

     }
 }




