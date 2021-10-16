package AT_03;
import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		String usuario, senha;
		
		System.out.print("Informe um usuário: ");
			usuario = sc.nextLine();
		System.out.print("Informe uma senha: ");
			senha = sc.nextLine();
			
		while(usuario.equals(senha)) {
			System.out.println("Usuário e senha não podem ser iguais, digite um usuário ou senha diferente!");
			System.out.print("Informe um usuário: ");
			usuario = sc.nextLine();
			System.out.print("Informe uma senha: ");
			senha = sc.nextLine();
		}
		
		sc.close();
	}

}
