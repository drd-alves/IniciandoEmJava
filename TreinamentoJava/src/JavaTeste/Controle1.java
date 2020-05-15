package JavaTeste;

import java.util.Scanner;

public class Controle1 {
	public static void main(String args[]) {
		double nota;
		
		System.out.println("Digite sua nota: ");
		Scanner nt= new Scanner(System.in);
		nota = nt.nextDouble();
		
		if (nota >= 6) {
			System.out.println("Aprovado!");
		} 
		else{
			System.out.println("Reprovado!");
		}
		
	}
}
