package model;

public class Cachorro extends Mamifero{

	public String porte;
	
	public String tipo; 
	
	
	

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void latir() {
		System.out.println("O cachorro " + getNome() + " está latindo");
	}
	
	
}
