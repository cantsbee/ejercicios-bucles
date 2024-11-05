/*Diseña un programa que imprima los números del 1 al 100 exceptuando los
múltiplos de 3*/

public class bucles5{
    public static void main (String[] args){
        for (int i=0; i<=100; i++) {
            if (i % 3 != 0){
            System.out.println(i);}
        }
        
    } 
    
}