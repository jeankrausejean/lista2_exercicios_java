import java.util.Scanner;

public class Exercicio31 {
	

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n, soma = 0;
		
		System.out.println("Digite um valor");
		n = leitor.nextInt();
		
		for (int i = 1; i <= n; i++) {
			soma = soma + i;
		}
		
		System.out.printf("Soma: %s", soma);
		leitor.close();

    }
}