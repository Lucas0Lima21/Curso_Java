package fundamentos;

import java.util.Scanner;

public class texteDois {
public static void main(String[] args) {
	String s = "texto";
	double um = 1.02;
	System.out.printf("megasena :%s %d %.2f %d %d \n %d %d %d, \n",s,1,um, 2 ,3 ,4 ,5, 6);
	
	Scanner entrada = new Scanner (System.in);
	System.out.print("Digite seu nome: ");
	String nome = entrada.nextLine();
	System.out.print("Didgite seu sobrenome: ");
	String sobrenome = entrada.nextLine();
	System.out.print("Digite sua idade: ");
	int idade = entrada.nextInt();
	System.out.println(nome+" "+ sobrenome +", tem "+idade +" anos.");
	entrada.close();
}
}

