import java.util.Scanner; 

public class Exercicio25 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int valor;
		
		
		System.out.println("Digite um numero: ");
		valor = in.nextInt();
		
		if (valor % 2 == 0) {
            System.out.println("O n�mero "+ valor + " � par\n");
		}
		else{
            System.out.println("O n�mero "+ valor + " � impar");
		}
				in.close();
	}
}