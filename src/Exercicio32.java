import java.util.Scanner;

public class Exercicio32 {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, c, d, e, f, g, h, i, j;
		int menor, maior;

		System.out.println("Entre com o 1º número");
		a = input.nextInt();

		System.out.println("Entre com o 2º número");
		b = input.nextInt();

		System.out.println("Entre com o 3º número");
		c = input.nextInt();

		System.out.println("Entre com o 4º número");
		d = input.nextInt();

		System.out.println("Entre com o 5º número");
		e = input.nextInt();
		
		System.out.println("Entre com o 6º número");
		f = input.nextInt();
		
		System.out.println("Entre com o 7º número");
		g = input.nextInt();
		
		System.out.println("Entre com o 8º número");
		h = input.nextInt();
		
		System.out.println("Entre com o 9º número");
		i = input.nextInt();
		
		System.out.println("Entre com o 10º número");
		j = input.nextInt();

		maior = a;
		menor = a;

		if (b > maior) {
			maior = b ;
			}

		if (c > maior) {
			maior = c ;
			}

		if (d > maior) {
			maior = d ;
			}

		if (e > maior) {
			maior = e ;
			}
		if (f > maior) {
			maior = f ;
			}
		if (g > maior) {
			maior = g ;
			}
		if (h > maior) {
			maior = h ;
			}
		if (i > maior) {
			maior = i ;
			}
		if (j > maior) {
			maior = j ;
			}
		System.out.printf("O Maior nº eh %d\n", maior);

		if (b < menor) {
			menor = b ;
			}

		if (c < menor) {
			menor = c ;
			}

		if (d < menor) {
			menor = d ;
			}

		if (e < menor) {
			menor = e ;
			}
		if (f < menor) {
			menor = f ;
			}
		if (g < menor) {
			menor = g ;
			}
		if (h < menor) {
			menor = h ;
			}
		if (i < menor) {
			menor = i ;
			}
		if (j < menor) {
			menor = j ;
			}
		System.out.printf("O Menor nº eh %d\n", menor);
			input.close();
		}
}

