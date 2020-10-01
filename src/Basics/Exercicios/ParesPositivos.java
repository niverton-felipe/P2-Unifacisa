package Basics;

import java.util.Scanner;

public class ParesPositivos {
   public static void main(String[] args) {
	
	   Scanner entrada = new Scanner(System.in);
	   int contParesPositivos = 0;
	   
	   for (int i = 1; i <= 25; i++) {
		   System.out.print("Digite um número:");
		   int num = entrada.nextInt();
		   if (num % 2 == 0 && num > 0) {
			   contParesPositivos++;
		   }  
	   }
	   System.out.println("Quantidade de pares positivos: " + contParesPositivos); 
   } 
}
