package JavaTeste;

import java.util.Scanner;

public class Controle2 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		 
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		System.out.print("Sexo: ");
		char sexo = entrada.next().charAt(0);
		System.out.print("Peso: ");
		double peso = entrada.nextDouble();
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		double imc = peso/(altura*altura);
		 
		if (sexo == 'f' && imc < 19) {
			System.out.println("Abaixo do peso.");}
		else if (sexo == 'f' && imc <= 25.8) {
			System.out.println("peso ideal.");}
		else if (sexo == 'f' && imc <= 27.3) {
			System.out.println("Um pouco acima do peso");}
		else if (sexo == 'f' && imc <= 32.3) {
			System.out.println("Acima do peso ideal.");}
		else if (sexo == 'f') {
			System.out.println("Obesidade.");}
		
		if (sexo == 'm' && imc < 20.7) {
			System.out.println("Abaixo do peso.");}
		else if (sexo == 'm' && imc <= 26.4) {
			System.out.println("peso ideal.");}
		else if (sexo == 'm' && imc <= 27.8) {
			System.out.println("Um pouco acima do peso");}
		else if (sexo == 'm' && imc <= 31.1) {
			System.out.println("Acima do peso ideal.");}
		else if (sexo == 'm') {
			System.out.println("Obesidade.");}
	}
}
