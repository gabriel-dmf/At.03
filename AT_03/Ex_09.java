package AT_03;
import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T, resul;
		int fim = 10;
		
		System.out.print("Insira o número da tabuada desejada: ");
			T = sc.nextInt();
		
		for(int i = 1; i <= fim; i++) { 
			 resul = T * i;
		System.out.println(T + " x " + i + " = " + (resul)) ;
		}
		sc.close();
	}

}
