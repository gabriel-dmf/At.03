package AT_03;
import java.util.Scanner;

public class Ex_21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		float soma = 0, media = 0;
		int quant, idade;

		System.out.print("Informe o n�meros de pessoas na turma: ");
			quant = sc.nextInt();

		for (int i = 1; i <= quant; i++) {
			System.out.print("Insira a idade:");
				idade = sc.nextInt();
			soma = soma + idade;
		}
		media = soma / quant;

		if ((media >= 0) && (media <= 25))
			System.out.println("Com base na m�dia das idades, essa turma � jovem.");
		else if ((media > 25) && (media <= 60))
			System.out.println("Com base na m�dia das idades, essa turma � adulta.");
		else if (media > 60)
			System.out.println("Com base na m�dia das idades, essa turma � idosa.");

		sc.close();

	}

}
