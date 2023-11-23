package orientaçãoAObjeto;

public class carroText {
public static void main(String[] args) {
	carro c2=new carro();

	System.out.println(c2.estaligado());
	c2.ligar();
	System.out.println(c2.estaligado());
	System.out.println(c2.motor.giros());
	c2.acelerar();
	c2.acelerar();
	c2.acelerar();
	c2.acelerar();
	c2.acelerar();
	
	System.out.println(c2.motor.giros());
	c2.frear();
	c2.frear();
	c2.frear();
	c2.frear();
	c2.frear();
	c2.frear();
	c2.frear();
	c2.frear();
	c2.frear();
	System.out.println(c2.motor.giros());
	c2.deligado();
	System.out.println(c2.estaligado());
}
}
