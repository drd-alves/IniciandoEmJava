package TrabalhandoComClasses;

public class UtilizandoClasseCarro {
	
	public static void main(String arg[]) {
		
		//Vari�veis que ser�o parametros do m�todo conostrutor
		String cor = "n�o sei";
		String marca = "n�o sei";
		
		//instanciando a classe Carro - Criando o objeto meu Carro
		Carro meuCarro = new Carro(cor, marca);
		
		//executando m�todos set e get
		meuCarro.cor = "Vermelho"; //met�do public
		meuCarro.setMarca("Ferrari"); //met�do private
			
		meuCarro.mostraMarcaCor();
		
	}
}
