package exercicios;

public class usuario {
String nome;
String sobrenome;
usuario(String nome,String sobrenome){
	this.nome=nome;
	this.sobrenome=sobrenome;
}
  public boolean equals(Object objeto) {
	  if (objeto instanceof usuario) {
	usuario outro= (usuario) objeto;
	boolean nomeIgual= outro.nome.equals(this.nome);
	boolean sobreIgual= outro.sobrenome.equals(this.sobrenome);
	return nomeIgual && sobreIgual;
	}else{ return false;}
}
}

