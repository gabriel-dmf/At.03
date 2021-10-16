package AT_03;
import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int par = 0;
		int impar = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + " ° número inteiro:");
			n = sc.nextInt();
			if(n % 2 != 0)
				impar++;
			else
				par++;
		}
		System.out.println("Pares: " + par);
		System.out.println("Ímpares: " + impar);
		
		sc.close();

	}

}
