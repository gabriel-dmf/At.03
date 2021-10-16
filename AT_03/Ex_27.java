package AT_03;
import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			int quant = 0;
			float total = 0, troco = 0, valor = 1;
			double V_din;
	
			System.out.println("Lojas Tabajara");
			
			while (valor != 0) {
				quant = quant + 1;
				System.out.print("Produto " + quant + ": R$ ");
					valor = sc.nextFloat();
				
				total = (total + valor);
			}
			System.out.println("Total: R$ " + total);
			System.out.print("Dinheiro: R$ ");
				V_din = sc.nextDouble();
			
			troco = (float) (V_din - total);
			System.out.println("Troco: R$ " + troco);
			System.out.println("...");
			
		}
		}
	}

