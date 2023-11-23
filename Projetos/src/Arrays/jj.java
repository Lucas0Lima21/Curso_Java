package Arrays;

	import java.util.Arrays;	 
	import javax.swing.JOptionPane;
	
	public class jj {
		/*
		 * O desafio é calcular a média das notas de um aluno só que agora o usuário que
		 * irá passar essas informações para o programa. E eu quero que você quebre o algoritmo
		 * em dois laços "FOR", no primeiro laço você vai simplesmente pegar as notas e
		 * armazenar, depois crie um outro laço usando "FOREACH" para fazer a média
		 * das notas.
		 */
		public static void main(String[] args) {
	 
			// Definindo variáveis
			int totalNotas = 0;
			int contador = 0;
			double somaNotas = 0, media;
	 
			// Definindo entrada.
			totalNotas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de Notas"));
			double[] nota = new double[totalNotas];
			
			// Definindo laço de Armazenamento.
			for (contador = 0; contador < totalNotas; contador++) {
				nota[contador] = Double.parseDouble(JOptionPane.showInputDialog(null,
						"Informe a " + (contador + 1) + "° Nota").replace(",", "."));
			}
			// Definindo laço de Processamento.
			for (double notas: nota) {
				somaNotas += notas;
			}
			media = somaNotas / contador;
			// Definindo saida.
			String format = String.format("Média das notas: %.2f ", media);
			
			JOptionPane.showMessageDialog(null, "Quantidade de notas: "
			+nota.length+"\nNotas Informadas "+Arrays.toString(nota));
			
			JOptionPane.showMessageDialog(null, format);
			
		}
	}  

