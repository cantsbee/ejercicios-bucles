/*Diseña un programa que solicite un número entero ‘N’. A continuación, solicitará al
usuario N números y finalizará imprimiendo la media de todos los valores. */
import java.util.Scanner;

public class bucles8 {
   public static void main (String[]args) {
    Scanner scanner = new Scanner(System.in);
     int entero = scanner.nextInt();
     double numero = 0;
       for (int i=1; i<=entero; i++){System.out.print("Número" + (i+1)+ ":");
       Double numero2= scanner.nextDouble();
       numero+=numero2;

      }Double media=numero/entero;
      System.out.println("La media es de: " + media );
   }
}
