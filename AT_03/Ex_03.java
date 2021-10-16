package AT_03;
import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		double salario;
		char sexo, EC;
		
		 while(true){
			 System.out.print("Digite um nome: ");
	         	nome = sc.nextLine();
	         if (nome.length() > 3) {
	        	 System.out.println("Nome válido!");
	             break;
	         }else
	             System.out.println("O nome precisa ter mais de 3 caracteres!");
	       }
		 while(true) {
			 System.out.print("Informe uma idade: ");
			 	idade = sc.nextInt();
			 if((idade > 0) && (idade <= 150)) {
				 System.out.println("Idade válida!");
	             break;
			 }else
				 System.out.println("Idade precisa ser entre 0 e 150 anos");
		 }
		 while(true) {
			 System.out.print("Informe um salário: ");
			 	salario = sc.nextDouble();
			 if (salario > 0) {
				 System.out.println("Salario válido!");
				 	break;
				}else
					System.out.println("Salário tem que ser maior que 0!");
		 }
		 while(true) {
			 System.out.print("Informe o sexo(M ou F): ");
			 sexo = sc.next().charAt(0);
			 sexo = (Character.toString(sexo).toUpperCase()).charAt(0);
			 if ((sexo == 'M') || (sexo == 'F')) {
				 System.out.println("Sexo válido!");
				 break;
			 }else 
					System.out.println("Digito inválido, digite somente M ou F!");
		 }
		 while (true) {
			 System.out.print("Informe um estado civil: S(solteiro), C(casado), V(Viúvo), D(divorciado): ");
			 	EC = sc.next().charAt(0);
				EC = (Character.toString(EC).toUpperCase()).charAt(0);
			 if (EC == 'S'|| EC == 'C' || EC == 'V' || EC == 'D') {
				 System.out.println("Estado civil válido!");
				 break;
			}else 
					System.out.println("Digito inválido!");
		 }
		 sc.close();
	}
}
