import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, soma;
		
		
            System.out.println("Digite o 1º número");
            num1 = in.nextInt();
            
            System.out.println("Digite o 2º número");
            num2 = in.nextInt();
            
            soma = (num1 + num2);
            
            if (soma %2 == 0) {
            	System.out.println("A soma foi: " + soma +"\nEsse resultado é divisivel por 2.");
            }
            else {
            	System.out.println("A soma foi: " + soma +"\nEsse resultado não é divisivel por 2.");
            }
            	in.close();
		}
	}

