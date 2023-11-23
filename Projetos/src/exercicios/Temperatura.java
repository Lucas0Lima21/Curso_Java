package exercicios;


import javax.swing.JOptionPane;

public class Temperatura {
public static void main(String[] args) {
	/*temperatura
(f-32)*5/9=c
duas constante
variaveis
 f
resultado c*/
	//variaveis.
	double f;
	
	//definido entrada
	f=Integer.parseInt(JOptionPane.showInputDialog(null,"digite o valor F: "));
	// formula.
	double c;
	c=(f-32)*5/9;
	
	//solução.
	System.out.print((JOptionPane.showConfirmDialog(null, "temperatura em c é de: "+ c)));
	System.out.println(c);
}
}
