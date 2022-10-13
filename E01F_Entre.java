/*Leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos).*/
import java.util.Scanner;
public class E01F_Entre {
	public static void main(String [] args) {
		Scanner tc = new Scanner(System.in);
    	int num1;
		System.out.printf("Di un numero: ");
    	num1 = tc.nextInt();
   	if(num1 >= 10 && num1 <= 20){
        	System.out.printf("%s es mayor que 10 y menor que 20 \n", num1);
    	}else{
        	System.out.printf("%s no esta entre el 10 y el 20 \n", num1);
    		}
	}
}