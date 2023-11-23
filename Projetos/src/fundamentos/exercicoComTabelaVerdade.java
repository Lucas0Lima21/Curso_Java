package fundamentos;

public class exercicoComTabelaVerdade {
public static void main(String[] args) {
	boolean tterca =true;
	boolean tquinta =false;
	boolean tv50 = tterca && tquinta;
	boolean tv32 = tterca ^ tquinta;
	boolean Sorvete = tterca|| tquinta;
	boolean Saudavel=!Sorvete;
	System.out.println("compro a tv50: "+ tv50);
	System.out.println("compro a tv 32: "+tv32);
	System.out.println("compro sorvete: "+Sorvete);
	System.out.println("Ficou mais saúdavel:"+Saudavel);
	
}}
