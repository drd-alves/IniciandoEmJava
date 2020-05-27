package TrabalhandoComClasses;

import java.util.Scanner;

public class UtilizandoClasseComDigitacao {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		//instanciar a classe carro
		//criar objeto carroAluno
		
		String marca; 
			
		Carro carroAluno = new Carro("", "");
		
		//definindo os atributos
		System.out.print("Informe a cor: ");
		carroAluno.cor = in.next();
		
		System.out.print("Informe a marca: ");
		marca = in.next();
		carroAluno.setMarca(marca);
		
		//imprimindo
		System.out.println();
		carroAluno.mostraMarcaCor();
	}
}
