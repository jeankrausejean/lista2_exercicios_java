import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int num, contPar = 0, contImpar = 0;
	        
	        for(int i = 1; i <= 10; i++){
	            System.out.println("Digite o " + i + "º número");
	            num = in.nextInt();
	            
	            /*
	            if(num % 2 == 0){
	                contPar++;
	            }*/
	           
	          if(num % 2 != 0){
	                contImpar++;
	          }
	           
	        }
	        
	        // System.out.println("Foram digitados " + contPar + " números pares \n");
	         System.out.println("Foram digitados " + contImpar + " números ímpares");
	        in.close();
	    }

	}


