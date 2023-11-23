package controle;

import java.util.Scanner;

public class texte {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	String texto = "";
	do {
	System.out.println( "fala viado,"
			+ " palavra magica");
	System.out.print( "anda logo porra");
	texto= entrada.nextLine();
	
	}while(!texto.equalsIgnoreCase("favor"));
	System.out.println();
	entrada.close();
	
}
}
