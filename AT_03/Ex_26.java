package AT_03;
import java.util.Scanner;

public class Ex_26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco, total;
		int quant = 0;
		
		System.out.print("Informe o pre�o do p�o: ");
			preco = sc.nextDouble();
		System.out.println("Pre�o do p�o: R$ " + preco);
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
		
		while(quant >= 0 && quant < 50) {
			quant = quant + 1;
			total = quant * preco;
			System.out.println(quant + " - R$ " + total);	
		}
		sc.close();
	}

}
