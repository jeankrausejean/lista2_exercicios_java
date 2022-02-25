import java.util.Scanner;
public class Exercicio31 {
	
	public static int somaAlgarismosC(int num){
        //se a variavel num for igual a 10, significa
        //que nós já somamos todos os algarismos
        if(num<10)
            return num;
        else
            return somaAlgarismosC(num/10)+num%10;
 }

	public static void main(String[] args) {
		
		System.out.println("Digite um número: ");
        int num = new Scanner(System.in).nextInt();
        int soma = somaAlgarismosC(num);
        System.out.println("A soma dos algarismos é: " + soma);

    }
}