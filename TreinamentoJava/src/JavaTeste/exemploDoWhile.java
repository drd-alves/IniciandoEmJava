package JavaTeste;

import java.util.Scanner;

public class exemploDoWhile {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int x = 0; //onde vamos armazenar a operação
		double num1, num2, resultado = 0;
		
		do {
			
			System.out.println( "1) Somar");
			System.out.println( "2) Subtrair");
			System.out.println( "3) Multiplicar");
			System.out.println( "4) Dividir");
			System.out.println( "0) Sair");
			System.out.println( "Escolha uma das opções a cima: ");
			x = in.nextInt();
			
			if(x != 0) {
				System.out.println( "Digite o primeiro numero:");
				num1 = in.nextDouble();
				System.out.println( "Digite o segundo numero:");
				num2 = in.nextDouble();
				
				if (x == 1) {
					resultado = num1 + num2;
					
				}
				else if (x == 2) {
					resultado = num1 - num2;
				}
				else if (x == 3) {
					resultado = num1 * num2;
				}
				else if (x == 4) {
					resultado = num1 / num2;
				}
				System.out.println("");
				System.out.println("Resultado: " + resultado);
				System.out.println("");
			}
			else {
				resultado = 0;
			}
			
		}while( x != 0);
	}
}
