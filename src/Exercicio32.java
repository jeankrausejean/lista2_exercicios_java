import java.util.Scanner;

public class Exercicio32 {
	

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int maior = 0, menor = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %sº valor: ", i);
			int n = leitor.nextInt();
			
			if (i == 1) {
				maior = n;
				menor = n;
			}
			
			if (n > maior) {
				maior = n;
			}
			
			if (n < menor) {
				menor = n;
			}
		}
			System.out.printf("\nMaior valor digitado foi: %s\n", maior);
			System.out.printf("E o menor foi: %s", menor);
		 leitor.close();
	}
}
		
		