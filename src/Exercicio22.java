import java.util.Scanner;


public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double num1, num2, soma, media;
		
		System.out.println("Digite a 1� nota: ");
		num1 = in.nextDouble();
		
		System.out.println("Digite a 2� nota: ");
		num2 = in.nextDouble();
		
		soma = (num1 + num2);		
		media = (soma / 2);
		
			if (media >=6)
			  {
			    System.out.println("Aluno(a) aprovado(a)!!! \nA m�dia m�nima � 6 \nA m�dia do aluno �: "+media);
			  }
				else {
					System.out.println("Aluno(a) reprovado(a)!!! \nA m�dia m�nima � 6 \nA m�dia do aluno �: "+media);
					 }
			in.close();	
	}
}
			
	

