import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int quantidade_maca;
		
		System.out.println("Por favor, informe quantas maçãs foram compradas: ");
		quantidade_maca = in.nextInt();
		
		if (quantidade_maca < 12) {
			System.out.printf("O valor da compra foi: R$" + (quantidade_maca * 1.3));
		} 
		 
		else { 
			System.out.printf("O valor da compra foi: R$" + (quantidade_maca * 1));
		}
			in.close();
	}

}
