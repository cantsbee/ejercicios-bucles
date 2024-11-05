/*Diseña un programa que solicite un número entero y que a continuación imprima
todos los números impares desde el 1 hasta el proporcionado por teclado. */

import java.util.*;
public class bucles4 {
    public static void main (String[] args){
        System.out.println("Introduce un número entero:");
        Scanner num = new Scanner(System.in);
        int entero = num.nextInt();
         for (int i=0; i<=entero; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
         }  
    }
}