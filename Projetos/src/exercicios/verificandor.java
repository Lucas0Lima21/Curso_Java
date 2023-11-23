package exercicios;

import java.util.Scanner;

public class verificandor {
public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	System.out.println("Digite um numero entre 0 a 10 :");
	int numero= entrada.nextInt();
	if(numero>=0 && numero<=10){	
	  if(numero %2==0) {
		System.out.printf("O numero é %d e é par", numero);
	}else {  
		System.out.printf("O numero é %d e é impar",numero); } }
	  
	else {
		System.out.println("numero invalido");
	}
	entrada.close();
}
}


