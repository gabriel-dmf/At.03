package AT_03;
import java.util.Scanner;

public class Ex_26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco, total;
		int quant = 0;
		
		System.out.print("Informe o preço do pão: ");
			preco = sc.nextDouble();
		System.out.println("Preço do pão: R$ " + preco);
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		
		while(quant >= 0 && quant < 50) {
			quant = quant + 1;
			total = quant * preco;
			System.out.println(quant + " - R$ " + total);	
		}
		sc.close();
	}

}
