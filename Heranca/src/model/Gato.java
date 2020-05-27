package model;

public class Gato extends Mamifero{
	
	public boolean bigode;

	public boolean isBigode() {
		return bigode;
	}

	public void setBigode(boolean bigode) {
		this.bigode = bigode;
	}
	
	public void miar() {
		System.out.println("o gato " + getNome() + " está miando");
	}

}
