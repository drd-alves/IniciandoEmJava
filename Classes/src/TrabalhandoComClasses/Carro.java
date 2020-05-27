package TrabalhandoComClasses;

public class Carro {
	
	//Atributos
	public String cor;
	private String marca;
	//fim dos atributos
	
	//método construtor (sempre o mesmo nome da classe
	public Carro(String cor, String marca ) {
		this.cor = cor;
		this.marca = marca;
	}
	//fim do método construtor

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
	
	//outros métodos da classe
	public void mostraMarca() {
		System.out.println("A marca do carro é " + getMarca());
	}
	
	public void mostraMarcaCor() {
		System.out.println("A cor do carro é " + getCor() + " e a marca do carro é " + getMarca());
	}
}
