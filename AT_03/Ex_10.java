package AT_03;
import java. util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float resul = 1;
		float B, exp;
		
		System.out.print("Digite a base:");
			B = sc.nextFloat();
		System.out.print("Digite o expoente:");
			exp = sc.nextFloat();
		
		int i = 1;
		
		while(i <= exp) {
			resul = resul * B;
			i++;
		}
		System.out.println(B + " elevado a " + exp + " = " + resul);
		
		sc.close();
	}
}
