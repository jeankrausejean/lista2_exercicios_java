import java.util.Scanner;


public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double num1, num2, soma, media;
		
		System.out.println("Digite a 1º nota: ");
		num1 = in.nextDouble();
		
		System.out.println("Digite a 2º nota: ");
		num2 = in.nextDouble();
		
		soma = (num1 + num2);		
		media = (soma / 2);
		
			if (media >=6)
			  {
			    System.out.println("Aluno(a) aprovado(a)!!! \nA média mínima é 6 \nA média do aluno é: "+media);
			  }
				else {
					System.out.println("Aluno(a) reprovado(a)!!! \nA média mínima é 6 \nA média do aluno é: "+media);
					 }
			in.close();	
	}
}
			
	

