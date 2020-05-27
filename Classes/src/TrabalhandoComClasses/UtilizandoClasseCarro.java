package TrabalhandoComClasses;

public class UtilizandoClasseCarro {
	
	public static void main(String arg[]) {
		
		//Variáveis que serão parametros do método conostrutor
		String cor = "não sei";
		String marca = "não sei";
		
		//instanciando a classe Carro - Criando o objeto meu Carro
		Carro meuCarro = new Carro(cor, marca);
		
		//executando métodos set e get
		meuCarro.cor = "Vermelho"; //metódo public
		meuCarro.setMarca("Ferrari"); //metódo private
			
		meuCarro.mostraMarcaCor();
		
	}
}
