package fundamentos;

import javax.swing.JOptionPane;

public class calculadora {
	public static void main(String[] args) {
		String valor1=JOptionPane.
				showInputDialog("digite o primeiro numero: ");
		String simbolo=JOptionPane.
				showInputDialog("digite o simbolo: ");
		String valor2=JOptionPane.
				showInputDialog("digite o primeiro numero: ");
		double numero1= Double.parseDouble(valor1);
		double numero2= Double.parseDouble(valor2);
		
		double resultado ="+".equals(simbolo)?numero1+numero2:0; 
		resultado ="*".equals(simbolo)?numero1+numero2:resultado; 
		resultado ="/".equals(simbolo)?numero1/numero2:resultado; 
		resultado ="%".equals(simbolo)?numero1%numero2:resultado; 
		resultado ="-".equals(simbolo)?numero1-numero2:resultado; 
		
		System.out.print(resultado);
}
}


