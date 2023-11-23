package exercicios;

import javax.swing.JOptionPane;

public class alunos {
public static void main(String[] args) {
	double nota1=0;
	double nota2=0;
	double media=0;
	
	nota1 =Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
	nota2 =Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
	
	media=(nota1+nota2)/2;
	
	if(media>=0 && media<=10) 
	 
	{if(media>=7) {	JOptionPane.showMessageDialog(null, "Esta aprovado com a media: "+media);
	}else if(media>=4) {JOptionPane.showMessageDialog(null, "Esta em recuperação, com a media: "+media);
	}else {JOptionPane.showMessageDialog(null, "Esta reprovado com a media: "+media);
	}
	}else JOptionPane.showMessageDialog(null, "Nota invalida.");
}
}
