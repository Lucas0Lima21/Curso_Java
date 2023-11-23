package classe;

public class data {
int dia;
int mes;
int ano;
    data(){
    	dia=1;
    	mes=1;
    	ano=1970;
    }
	data(int dia,int  mes, int ano){
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
String dataFormatada() {
return String.format("%d/%d/%d",dia,mes,ano);
}}
