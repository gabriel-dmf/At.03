package AT_03;
import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int NP;

		System.out.print("Insira um número inteiro:");
			NP = sc.nextInt();

		if ((NP % 2 == 0) && (NP != 2)) {
			System.out.println("O número " + NP + " não é primo!");
			
			System.out.print("O número " + NP + " é divisível por: ");
			for (int i = 1; i <= NP; i++) {
				if (NP % i == 0)
					System.out.print(i + ", ");
			}
		}else if (NP == 1) {
			System.out.println("O número " + NP + " não é primo!");
			
			System.out.print("O número " + NP + " é divisível por: ");
			for (int i = 1; i <= NP; i++) {
				if (NP % i == 0)
					System.out.print(i + ", ");
			}
		}
		else 
			System.out.println("O número " + NP + " é primo!");

		
		
		sc.close();	
	}

}
