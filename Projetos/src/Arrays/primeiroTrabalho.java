package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class primeiroTrabalho {
public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	System.out.println("digite a quantidade de entrada: ");
	int nA= entrada.nextInt();
	System.out.println("quantidade de notas");
	int nota= entrada.nextInt();
	double[][] notas= new double[nA][nota];
	for(int i=0; i<notas.length; i++) {
		for(int j=0; j<notas[i].length;j++) {
    System.out.printf(" digite a %d nota da %d entrada: ",i+1,j+1);
    notas[i][j]=entrada.nextDouble();
	}
	}
		for(double[] notass:notas) {
	System.out.println(Arrays.toString(notass));}
	entrada.close();

}
}


/*informa nota tanto de nota,
 for pega nota e amazzenar
  ; soma notasmedia do aluno*/
 