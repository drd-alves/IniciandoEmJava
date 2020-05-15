package JavaTeste;

import java.util.Scanner;

public class Vetor1 {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] arrayUm = {12,15,121,123,13,13};
		int[] arrayDois = {12,15,121,123};
		
		float[] nota = new float[5];
		
		//tamanho do array
		if(arrayUm.length >= 8) {
			System.out.println("O Array um tem 8 ou mais posições");
		}else {
			System.out.println("O Array um tem menos de 8 posições");
		}
		System.out.println("O Array dois tem " + arrayDois.length + " posições");
		System.out.println();
		
		
		//utilizando for each
		String[] cars = {"Volvo","Ferrari","Ford","Porsche"};
		
		for(String i: cars) {
			System.out.println(i);
			}
		System.out.println();
		
		
		//populando um array
		for(int i=0; i <5; i++) {
			System.out.println("Notas: ");
			nota[i] = entrada.nextInt();
		}
		
		
		//apresentando um array
		for(int i=0; i <5; i++) {
			System.out.println("Nota " + (i+1) + ": " + nota[i] );
		}	
	}
}
