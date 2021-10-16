package AT_03;
import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float  n;
		
		System.out.print("Informe uma nota de 0 a 10: ");
			n = sc.nextFloat();
			
		while (n < 0 || n > 10) {
			System.out.println("Valor inválido!");
			System.out.print("Informe outro valor de 0 a 10: ");
				n = sc.nextFloat();
		}
		sc.close();
	}

}
