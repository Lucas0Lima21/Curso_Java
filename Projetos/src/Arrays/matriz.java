package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class matriz {
public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	System.out.println("informe o numero de aluno: ");
	int qtdealuno = entrada.nextInt();
	System.out.println("informe o numero de notas: ");
	int qtdenotas = entrada.nextInt();
	double[][] notas= new double [qtdealuno][qtdenotas]; 
	double total=0;
	for(int i=0;i<notas.length;i++) {
	  for(int  j=0; j<notas[i].length; j++) {
      System.out.printf("informe a %d nota do %d aluno: ",j+1,i+1);
	      notas[i][j]=entrada.nextDouble();
	      total +=notas[i][j];
	  }	
	}	
     double media= total/(qtdenotas*qtdealuno);
     System.out.println(" A media é de: "+ media);
     
     for(double[] nota:notas) {
     System.out.println(Arrays.toString(nota));}
entrada.close();
}
}
