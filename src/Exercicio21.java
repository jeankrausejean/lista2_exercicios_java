import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	       
        System.out.println("Digite o seu nome: ");
        String nome = in.nextLine();
        
        System.out.println("Informe seu sal�rio: ");
        double salario = in.nextDouble();
        
        double percentual = 15.0 / 100.0;
        double novoSalario = salario + (percentual * salario);
   
        System.out.print("Ol�; " + nome);
        System.out.print(",\nSeu sal�rio atual �: R$"+ salario + "\n");
        System.out.print("E seu novo sal�rio � R$" + novoSalario + ".");
        in.close();
        
	}

}
