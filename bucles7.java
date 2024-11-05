/*Diseña un programa que imprima los múltiplos de 3 comprendidos entre 5 y 50*/
import java.util.Scanner;

public class bucles7 {
   public static void main (String[]args) {

 for (int i=5; i<=50; i++){
    if (i%3 == 0){
        System.out.println(i);
    }
 }

   }
}
