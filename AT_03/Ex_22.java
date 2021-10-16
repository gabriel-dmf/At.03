package AT_03;
import java.util.Scanner;

public class Ex_22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int C1 = 0, C2 = 0, C3 = 0;
		int eleitor, voto;
		
		System.out.println("Informe o número de eleitores: ");
			eleitor = sc.nextInt();

		for (int i = 1; i <= eleitor; i++) {
			System.out.println("Insira o número de seu candidato: ");
				voto = sc.nextInt();

			if (voto == 1)
				C1 = C1 + 1;
			else if (voto == 2)
				C2 = C2 + 1;
			else if (voto == 3)
				C3 = C3 + 1;
			else
				System.out.println("Número inválido!");
		}
		
		System.out.println("Votos para o Candidato 1: " + C1);
		System.out.println("Votos para o Candidato 2: " + C2);
		System.out.println("Votos para o Candidato 3: " + C3);

		sc.close();

	}

}
