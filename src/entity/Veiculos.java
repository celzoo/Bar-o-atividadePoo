package entity;

public class Veiculos {
	String placa;
	Modelos modelo;
	String cor;
	public void setModelo(Modelos modelo) {
		this.modelo = modelo;
	}
	public Veiculos(String placa, String cor) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	
	public String getPlaca() {
		return placa;
	}
	public String toString() {
		return " ||Dados do veiculo|| Placa: " + placa + " Cor: " + cor + modelo;
	}

}
