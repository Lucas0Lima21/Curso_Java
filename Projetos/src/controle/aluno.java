package controle;

import java.util.Scanner;

public class aluno {
public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	int valorDaNota=0;
	double notas=0;
	double total=0;
	while(notas  !=-1) {
System.out.println("digite a nota, quando quiser sair,-1");
notas=entrada.nextDouble();
    if (notas <=10 && notas>=0) {
    	total+=notas;
    	valorDaNota++;}}
    double media= total/valorDaNota;
     
    System.out.printf("media: %s",media);
    entrada.close();
	
}
}
