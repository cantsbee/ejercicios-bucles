/*Diseña un programa que solicite dos números al usuario y calcule la suma de todos
los números que se encuentran entre ambos.
Por ejemplo, para los datos de entrada 4 y 8 calcula = 4+5+6+7+8*/

import java.util.*;
public class bucles2 {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce el primer numero:");
        int numero1=sc.nextInt();
        System.out.println("introduce el segundo numero:");
        int numero2=sc.nextInt();
        int suma=0;
        
      
        for (int i = numero1; i <= numero2; i++) {
            suma += i;
        }

     System.out.println("la suma de los numeros: "+ numero1 + numero2 + "es:" + suma); 
    }
}