package AT_03;
import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double paisA1 = 80000, paisB1 = 200000, taxA1 = 0.03, taxB1 = 0.015;
		int ano1 = 0;
		
		while (paisA1 < paisB1) {
			ano1 = ano1 + 1;
			paisA1 = (paisA1 * taxA1) + paisA1;
			paisB1 = (paisB1 * taxB1) + paisB1;
		}

		System.out.println("Em " + ano1 + " anos a A ultrapassar� ou se igualar� a popula��o do pa�s B.");
		
		double paisA2, paisB2, taxA2, taxB2;
		int ano2 = 0;
		
		System.out.print("Informe a popula��o do pa�s A:");
			paisA2 = sc.nextDouble();
		System.out.print("Informe a taxa de crescimento(%):");
			taxA2 = sc.nextDouble();
		System.out.print("Informe a popula��o do pa�s B:");
			paisB2 = sc.nextDouble();
		System.out.print("Informe a taxa de crescimento(%):");
			taxB2 = sc.nextDouble();
			
		
			while(paisA2 < paisB2) {
				ano2 = ano2 + 1;
				paisA2 = (paisA2 * taxA2) + paisA2; 
				paisB2 = (paisB2 * taxB2) + paisB2;
			}
			System.out.println("Em " + ano2 + " anos a popula��o A ultrapassar� ou se igualar� a popula��o B.");
		
		sc.close();
	}

}
