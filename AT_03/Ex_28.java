package AT_03;
import java.util.Scanner;

public class Ex_28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int quant = 0, i;
		float T = 0, maior_t = 0, menor_t = 0, soma = 0, media = 0;
		
		//n�o consegui fazer com um n�mero indeterminado de temperaturas
		System.out.print("Informe a quantidade de temperaturas: ");
			quant = sc.nextInt();

		for (i = 0; i < quant; i++) {
			System.out.print("Insira a temperatura:");
				T = sc.nextFloat();

			if (i == 0) {
				maior_t = T;
				menor_t = T;
				soma = soma + T;
			} else {
				if (T > maior_t) {
					maior_t = T;
					soma = soma + T;
				} else {
					menor_t = T;
					soma = soma + T;
				}
			}
		}
		media = soma / i;

		System.out.println("A menor temperatura �: " + menor_t + " e a maior �: " + maior_t);
		System.out.println("A m�dia das temperaturas �: " + media);

		sc.close();

	}

}
