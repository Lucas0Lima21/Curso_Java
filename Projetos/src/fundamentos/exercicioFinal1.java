package fundamentos;

import java.util.Scanner;

public class exercicioFinal1 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("digite sua altura");
	double altura = entrada.nextDouble();
	System.out.println("digite seu peso");
	double peso =entrada.nextDouble();
	
	double imc = peso/(altura*altura);
	System.out.printf("IMC :%f",imc);
	entrada.close();
}
}
