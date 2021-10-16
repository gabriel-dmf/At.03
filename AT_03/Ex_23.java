package AT_03;
import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float Total_A = 0, media = 0;
		int T, A;
		
		System.out.print("Informe a quantidade de turmas: ");
			T = sc.nextInt();
		
		for(int i = 1; i <= T; i++) {
			System.out.print("Informe a quantidade de alunos na turma: ");
				A = sc.nextInt();
			while (A > 40) {
				System.out.println("A capacidade máxima é de 40 alunos por turma!");
				System.out.print("Informe a quantidade de alunos na turma novamente: ");
					A = sc.nextInt();
			}
			Total_A = Total_A + A;
		}
		
		media = Total_A / T;
		
		System.out.println("A média de alunos por turma é: " + media);
		
		sc.close();

	}

}
