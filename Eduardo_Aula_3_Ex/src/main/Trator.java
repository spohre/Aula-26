package main;

public class Trator extends Carro {
	private String Potencia;
	private String Roda;

	public Trator(String marca, int ano, String cor, String potencia, String roda) {
		super(marca, ano, cor);
		this.Potencia = potencia;
		this.Roda = roda;
	}

	public String getPotencia() {
		return Potencia;
	}

	public void setPotencia(String potencia) {
		Potencia = potencia;
	}

	public String getRoda() {
		return Roda;
	}

	public void setRoda(String roda) {
		Roda = roda;
	}

	@Override
	public String Buzinar() {
		return "BIIIIIIIIIIIII TRATORRRRRRRRRR";
	}
	
}
