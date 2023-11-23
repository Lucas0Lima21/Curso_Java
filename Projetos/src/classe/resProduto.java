package classe;

public class resProduto {
public static void main(String[] args) {
	produto p1= new produto("caderno",28);
	System.out.println("o caderno está custando,"
			+ " com desconto: "+ p1.precocomdesconto());
	System.out.printf("Natal,dia especial, promoção,"
			+ "o caderno está custando,"
			+ " com desconto: "+ p1.descontoespecial(0.10));
}
}
