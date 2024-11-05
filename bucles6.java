/*. Diseña un programa que solicite 10 números y devuelva el resultado de multiplicar
todos ellos
 */import java.util.*;
public class bucles6 {
    public static void main (String[] args){
        Scanner numero = new Scanner(System.in);
        System.out.println("Introduzca 10 números:");
        int var1= 0;
        int var2= 1;
        for (int i=0; i<=10; i++){
            System.out.println("numero" + (i+1) + ":");
            var1 = numero.nextInt();
            var2 = var2*var1;
        }System.out.println("El resultado final es:" + var2);
    }
}
