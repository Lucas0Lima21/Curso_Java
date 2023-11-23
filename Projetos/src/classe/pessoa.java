package classe;

public class pessoa {
String nome;
double peso;
double total;

pessoa(){
}
pessoa(String nome,double peso){
this.nome = nome;
this.peso = peso;
}
void comer(comida comida){
  this.peso+= comida.pesoC;
  }
String apresentar(){
	return("me chamo "+nome+" e peço "+peso+"kgs");
}
}
