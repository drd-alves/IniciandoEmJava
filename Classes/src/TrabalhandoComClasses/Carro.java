package TrabalhandoComClasses;

public class Carro {
	
	//Atributos
	public String cor;
	private String marca;
	//fim dos atributos
	
	//m�todo construtor (sempre o mesmo nome da classe
	public Carro(String cor, String marca ) {
		this.cor = cor;
		this.marca = marca;
	}
	//fim do m�todo construtor

	//inicio getter e setter
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	//fim get e set
	
	//outros m�todos da classe
	public void mostraMarca() {
		System.out.println("A marca do carro � " + getMarca());
	}
	
	public void mostraMarcaCor() {
		System.out.println("A cor do carro � " + getCor() + " e a marca do carro � " + getMarca());
	}
}
