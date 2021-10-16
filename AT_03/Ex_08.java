package AT_03;
import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int N1, N2;
		int soma = 0;
		
		System.out.print("Insira o primeiro número inteiro");
			N1 = sc.nextInt();
		System.out.print("Insira o segundonúmero inteiro");
			N2 = sc.nextInt();
		
		N1 = N1 + 1;
		
		for(int i = N1; i < N2; i++) { 
			soma = soma + i;
			System.out.print(i + ", ");
		}
		System.out.println("A soma do intervalo é: " + soma);
		
		sc.close();

	}

}
