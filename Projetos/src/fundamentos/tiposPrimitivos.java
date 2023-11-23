package fundamentos;

public class tiposPrimitivos {
	public static void main(String[] args) {
		byte numeroDeAno = 18;
		short numeroDeVoo = 235;
		int id = 36542;
		long pontos = 2_326_262_235L;
		// numero irreais.
		float salario = 23_200.45F;
		double vendas = 1_564_123_123.54;
		//tipo de booleano
		boolean ferias = false; // true
				
		char status = '1'; // ativa
	    System.out.println("dias trabalhados: " + numeroDeAno * 365);
	    System.out.println("numero de voo: "+ numeroDeVoo /2 );
		System.out.println("numero de pontos: " + pontos/vendas);
		System.out.println("id: " + id +": ganhos de " + salario);
		System.out.println("possui ferias: "+ ferias);
		System.out.println("status: " + status);
		
}}
