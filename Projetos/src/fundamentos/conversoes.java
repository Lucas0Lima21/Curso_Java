package fundamentos;

import java.util.Scanner;

public class conversoes {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro salario:");
		String salario = entrada.nextLine().replace(",",".");
		System.out.println("Digite o segundo salario:");
		String salarioUm = entrada.nextLine().replace(",", ".");
		System.out.println("Digite o terceiro salario:");
		String salarioDois = entrada.nextLine().replace(",", ".");
		entrada.close();
		double Um= Double.parseDouble(salario);
		double dois= Double.parseDouble(salarioUm);
		double tres= Double.parseDouble(salarioDois);
		
		double soma = Um + dois + tres;
		double media= soma/3;
		System.out.println("valor total:R$"+ soma);
		System.out.println("valor médio:R$"+ media);
			
}}
