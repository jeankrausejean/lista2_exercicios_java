import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, num3, soma;
		
		
            System.out.println("Digite o 1� n�mero");
            num1 = in.nextInt();
            
            System.out.println("Digite o 2� n�mero");
            num2 = in.nextInt();
            
            System.out.println("Digite o 3� n�mero");
            num3 = in.nextInt();
            
            soma = (num1 + num2);
            
            if (soma % num3 == 0) {
            	System.out.println("A soma foi: " + soma +"\nEsse resultado � divisivel por " + num3);
            }
            else {
            	System.out.println("A soma foi: " + soma +"\nEsse resultado n�o � divisivel por " + num3);
            }
            	in.close();
		}
	}
