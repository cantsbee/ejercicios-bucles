/*Diseña un programa que solicite un número entre 0 y 10 y a continuación imprima la
tabla de multiplicar de dicho número. Implementa la validación del dato de entrada.*/

import java.util.*;
public class bucles1 {
    public static void main(String[]args) {
        System.out.println("introduce un número:");
        Scanner sc= new Scanner(System.in);
        int numero=sc.nextInt();
        
       // int numMulti= 1;
        for (int i=0; i>=10; i++) {
         int resultado=i * numero;
         System.out.println(numero+ "x" + i + "=" + resultado);
         //numMulti = numMulti +1;
        }
            
    }
}