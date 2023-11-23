package controle;

import java.util.Scanner;

public class exercicioWhile {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in); 
    int valor=0;
    double notas=0;
    double total=0;
    while(notas !=-1) {
    	System.out.println("digite uma nota,para sai digite -1");
    notas= entrada.nextDouble();
    if(notas <= 10 && notas >=0) {
    	total+=notas;
    	valor++;}}
   double media = total/valor;
   
   System.out.printf("media : %f", media);
    	entrada.close();
    	
}}
