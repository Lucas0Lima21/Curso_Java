package controle;

import java.util.Scanner;

public class exercicio {
public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	System.out.println("digite uma numero: ");
	int numero= entrada.nextInt();
	if(numero >=0 && numero<=10) {
	 if(numero %2==0)
		System.out.println("numero é par");
	 else
		 System.out.println("numero é impar");
	entrada.close();
	
}}}
