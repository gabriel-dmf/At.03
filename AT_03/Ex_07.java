package AT_03;
import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N1, N2;
		
		System.out.print("Digite o primeiro n�mero inteiro:");
			N1 = sc.nextInt();
		System.out.print("Digite o segundo n�mero inteiro:");
			N2 = sc.nextInt();
		
		N1 = N1 + 1;
		
		for(int i = N1; i < N2; i++) {
			System.out.print(i + ", ");
		}

		sc.close();

	}

}
