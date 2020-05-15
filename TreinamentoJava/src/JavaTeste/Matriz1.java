package JavaTeste;

import java.util.Scanner;

public class Matriz1 {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		System.out.println("Matriz M[3][3] \n");
		
		//populando a matriz
		for (int linha=0; linha <3; linha++) {
			for (int coluna=0; coluna < 3; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha + 1, coluna + 1  );
				matriz[linha][coluna] = in.nextInt();
			}
		}
		
		System.out.println();
		//imprimindo
		for (int linha=0; linha <3; linha++) {
			for (int coluna=0; coluna < 3; coluna++) {
				System.out.printf("\t %d \t ", matriz[linha][coluna]);
			}
			System.out.println();
		}	
	}	
}
