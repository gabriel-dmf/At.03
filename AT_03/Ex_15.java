package AT_03;

public class Ex_15 {

	public static void main(String[] args) {
		
		int N1 = 38, N2 = 39, N3 = 0;  
		float X = 0, soma = 0;
		
		
		for(N3 = 1; N3 <= 37; N3++) {
			N1 = N1-1;
			N2 = N2-1;
			X = ((N1 * N2)/N3);
			soma = soma + X; 
			System.out.print("(" +N1 + "x" + N2 + ")/" + N3 + " + "); 
		}
		System.out.println();
		System.out.println("Soma = " + soma);

	}

}
