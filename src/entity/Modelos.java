package entity;

public class Modelos {
	int id;
	String nome;
	Marcas marca;
	public void setMarca(Marcas marca) {
		this.marca = marca;
	}
	public Modelos(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		
	}
	public String toString() {
		return " ||Dados do Modelo|| Codigo do modelo:" + id + " Nome do modelo:" + nome + " ||Dados da marca associados ao modelo|| " + marca;
	}
	
	
}
