package AT_03;
import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma, quant, N_cunj;
		int menor = 0, maior = 0;
		
		System.out.print("Digite quantos números terá o conjunto:");
			quant = sc.nextInt();
	
		for(int i = 1; i <= quant; i++) {
			System.out.print("Digite um número do conjunto:");
			N_cunj = sc.nextInt();
				
			if(i == 1){
					menor = N_cunj;
					maior = N_cunj;	
			}
			if(N_cunj <= menor) {
				menor = N_cunj;
			}else if(N_cunj >= maior) {
				maior = N_cunj;
			}
		}
		soma = menor + maior; 
		
		System.out.println("Menor número: " + menor);
		System.out.println("Maior número: " + maior);
		System.out.println("Soma do menor e maior número: " + soma);		
		
		sc.close();
}
}
