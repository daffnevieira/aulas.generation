package aulalogica78;
import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.println("Entre com a sua idade: ");
		idade = sc.nextInt();
		
		System.out.println("Entre com seu nome: ");
		sc.skip("\\R?");
		nome = sc.nextLine();
		
		System.out.println("O seu nome é " + nome.toLowerCase() + " e sua idade é " + idade);
		

	}

}
