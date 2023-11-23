package fundamentos;

public class temperatura {
public static void main(String[] args) {
	final double fator =  5.0/9.0;
	int ajuste = 32;
	int f = 86;
	double media =(f - ajuste) * fator;
	System.out.println("c " + media);
	f= 150;
	media =(f - ajuste) * fator;
	System.out.println("c1 " + media);
	System.out.println("c1 " + media);
}
}
