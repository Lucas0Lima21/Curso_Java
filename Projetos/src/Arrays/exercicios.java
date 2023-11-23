package Arrays;

import java.util.Arrays;

public class exercicios {
public static void main(String[] args) {
	double[]aula= new double[3];{		
		System.out.println(Arrays.toString(aula));
		aula[0]=1;
		aula[1]=2;
		aula[2]=3;
	    System.out.println(Arrays.toString(aula));
	    	    double total=0;

	    	for(int IN= 0; IN < aula.length; IN++)  {

	    	        total += aula[IN];  }

	    	    System.out.println(total/3);

}
}
}

