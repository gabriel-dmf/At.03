package AT_03;
import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		String usuario, senha;
		
		System.out.print("Informe um usu�rio: ");
			usuario = sc.nextLine();
		System.out.print("Informe uma senha: ");
			senha = sc.nextLine();
			
		while(usuario.equals(senha)) {
			System.out.println("Usu�rio e senha n�o podem ser iguais, digite um usu�rio ou senha diferente!");
			System.out.print("Informe um usu�rio: ");
			usuario = sc.nextLine();
			System.out.print("Informe uma senha: ");
			senha = sc.nextLine();
		}
		
		sc.close();
	}

}
