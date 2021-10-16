package AT_03;

public class Ex_25 {

	public static void main(String[] args) {
		
		int quant = 0;
		double preco;
		
		System.out.println("Loja Quase Dois - Tabela de preços.");

		while(quant >= 0 && quant < 50) {
			quant = quant + 1;
			preco = quant * 1.99;
			System.out.println(quant + " - R$ " + preco);	
		}
	}

}
