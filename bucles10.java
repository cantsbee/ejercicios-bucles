/*Diseña un programa que solicite números enteros que irá sumando (acumulando).
Cuando detecte que se ha introducido dos veces seguidas el mismo valor, imprimirá
el mensaje “Valor repetido. El total de la suma es: XXXX” */
import java.util.*;
public class bucles10{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0, numero, anterior= 0;
        System.out.println("Introduce un número entero:");
        numero = scanner.nextInt();
        suma += numero;

        while (true) {
            System.out.println("Introduce un numero entero:");
        }
    }
}