import java.util.Scanner;


public class Exercicio24 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade;
		
		System.out.println("Por favor, informe sua idade: ");
		idade = in.nextInt();
		
		if (idade < 11) {
			System.out.println("*** Sua categoria � infantil ***");
		}
		else if (idade > 17) {
			System.out.println("*** Sua categoria � senior ***");
		}
		else {
			System.out.println("*** Sua categoria � juvenil ***");
		}
				in.close();
	}

}
