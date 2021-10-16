package AT_03;
import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int quant;
		float soma = 0, media = 0, nota;
		
		System.out.print("Informe a quantidade de notas: ");
			quant = sc.nextInt();
		
		for(int i = 1; i <= quant; i++) {
			System.out.print("Informe a nota: ");
				nota = sc.nextInt();
			soma = soma + nota;	
		}
		media = soma / quant;
		System.out.println("A média é: " + media);
		
		sc.close();

	}

}
