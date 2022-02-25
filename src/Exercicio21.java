import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	       
        System.out.println("Digite o seu nome: ");
        String nome = in.nextLine();
        
        System.out.println("Informe seu salário: ");
        double salario = in.nextDouble();
        
        double percentual = 15.0 / 100.0;
        double novoSalario = salario + (percentual * salario);
   
        System.out.print("Olá; " + nome);
        System.out.print(",\nSeu salário atual é: R$"+ salario + "\n");
        System.out.print("E seu novo salário é R$" + novoSalario + ".");
        in.close();
        
	}

}
