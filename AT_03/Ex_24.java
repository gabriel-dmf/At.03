package AT_03;
import java.util.Scanner;

public class Ex_24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double V_total = 0, media = 0;
		double valor;
		int quant;

		System.out.print("Informe a quantidade de CDs: ");
			quant = sc.nextInt();

		for (int i = 1; i <= quant; i++) {
			System.out.print("Qual o valor gasto por CD? ");
				valor = sc.nextDouble();
				V_total = V_total + valor;
		}
		
		media = (double) (V_total / quant);
	
		System.out.println("O valor total investido em CDs foi: " + V_total);
		System.out.println("O valor de cada CD foi em média: " + media);

		sc.close();

	}

}
