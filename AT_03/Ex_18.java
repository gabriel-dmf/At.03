package AT_03;
import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int NP;

		System.out.print("Insira um n�mero inteiro:");
			NP = sc.nextInt();

		if ((NP % 2 == 0) && (NP != 2)) {
			System.out.println("O n�mero " + NP + " n�o � primo!");
			
			System.out.print("O n�mero " + NP + " � divis�vel por: ");
			for (int i = 1; i <= NP; i++) {
				if (NP % i == 0)
					System.out.print(i + ", ");
			}
		}else if (NP == 1) {
			System.out.println("O n�mero " + NP + " n�o � primo!");
			
			System.out.print("O n�mero " + NP + " � divis�vel por: ");
			for (int i = 1; i <= NP; i++) {
				if (NP % i == 0)
					System.out.print(i + ", ");
			}
		}
		else 
			System.out.println("O n�mero " + NP + " � primo!");

		
		
		sc.close();	
	}

}
