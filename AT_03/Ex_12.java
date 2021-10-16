package AT_03;
import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N1 = 1; 
		int N2 = 0;
		int X;
		
		System.out.print("Insira o n−ésimo termo:");
		X = sc.nextInt();
		
		for (int i = 1; i <= X; i++) {
			N1 = N1 + N2;
            N2 = N1 - N2;
            System.out.println(N1);
		}
		sc.close();
	}
}
