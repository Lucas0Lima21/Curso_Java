package classe;

public class jantar {
public static void main(String[] args) {
	pessoa p= new pessoa("João",76);
	comida c= new comida("arroz",0.23);
	p.comer(c);
	System.out.print(p.apresentar());
			
}
}
