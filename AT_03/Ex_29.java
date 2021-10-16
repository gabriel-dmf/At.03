package AT_03;
import java.util.Scanner;

public class Ex_29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Tab, V_ini, V_final, mult;
		
		System.out.print("Montar a tabuada de: ");
			Tab = sc.nextInt();
			
		System.out.print("Começar por: ");
			V_ini = sc.nextInt();
			
		System.out.print("Terminar em: ");
			V_final = sc.nextInt();
		
		System.out.println("Vou montar a tabuada de " + Tab + " começando em " + V_ini + " e terminando em "+ V_final + ":");
		
		if(V_ini < V_final) {
			for(int i = V_ini; i <= V_final; i++) {
				mult = Tab * i;
				System.out.println(Tab + " x " + i + " = " + mult);
			}
		}else 
			System.out.println("O valor inicial deve ser menor que o final!");
		
		sc.close();
	}

}
