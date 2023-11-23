package classe;

public class produto {
String nome;
double valor;
static double desconto=0.25;
 
produto(){
}
produto( String nomeInicial,double valorInicial){
	nome = nomeInicial;
	valor = valorInicial;
}
double precocomdesconto(){
return valor*(1-desconto);
}

double descontoespecial(double datacomemorativa){
	return valor*(1-(desconto + datacomemorativa));

}
}

