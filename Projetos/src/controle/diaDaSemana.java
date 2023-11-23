package controle;

import java.util.Scanner;

public class diaDaSemana {
public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	System.out.println("Digite um dia da semana:");
	int dia=entrada.nextInt();
	if( dia ==1 ) {
		System.out.println("Domingo");
	entrada.close();
      }else if( dia==2 ) {
        System.out.println("segunda");
      }else if( dia==3 ) {
	    System.out.println("terça");
      }else if( dia==4 ) {
        System.out.println("quarta");
      }else if( dia==5 ) {
	    System.out.println("quinta");
      }else if( dia==6 ) {
	    System.out.println("sexta");
      }else if( dia==7 ) {
	    System.out.println("sabado");
      }else {
	    System.out.println("invalido");
}
}
}