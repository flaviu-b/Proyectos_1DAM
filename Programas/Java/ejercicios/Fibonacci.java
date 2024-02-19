package ejercicios;

import java.util.*;

public class Fibonacci{
    
	private static Scanner sc;
	
	
	
	public static void main(String[] args){
        sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
        do{
            System.out.print("Introdueix numero major que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
        System.out.println("Els " + numero + " primers termes de la sèrie de Fibonacci son:");

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}
 
