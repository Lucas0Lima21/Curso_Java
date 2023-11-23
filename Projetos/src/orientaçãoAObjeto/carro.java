package orientaçãoAObjeto;

public class carro {
   motor motor=new motor();
   void acelerar() {
	   if(motor.fatorInjecao<2.5) {
	   motor.fatorInjecao+=0.4;	}   
   }
   void frear() {
	   if(motor.fatorInjecao>=0.2)
	   motor.fatorInjecao-=0.4;
   }void ligar() {
	   motor.ligado=true;
   }void deligado(){
   motor.ligado=false;
   }boolean estaligado() {
	  return motor.ligado;
   }
}
