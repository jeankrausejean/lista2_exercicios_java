import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um n�mero de 1 a 7: ");
		numero = in.nextInt();
		
		switch(numero) {
			
		case 1:
		System.out.println("Domingo");
		break;
			
		case 2:
		System.out.println("Segunda-feira");
		break;
		
		case 3:
		System.out.println("Ter�a-feira");
		break;
		
		case 4:
		System.out.println("Quarta-feira");
		break;
		
		case 5:
		System.out.println("Quinta-feira");
		break;
		
		case 6:
		System.out.println("Sexta-feira");
		break;
		
		case 7:
		System.out.println("S�bado");
		break;
		
		default:
		System.out.println("Voc� digitou um n�mero invalido");
		}
			in.close();
	}

}
