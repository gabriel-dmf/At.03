package AT_03;
import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int F = 1;
		int N;

		System.out.print("Insira o num�ro: ");
			N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			F = F * i;
		}
		System.out.println(N + " fatorial �: " + F);
		
		sc.close();
	}

}
