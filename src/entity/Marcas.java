package entity;

public class Marcas {
	int id;
	String nome;
	
	
	public Marcas(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}


	public String toString() {
		return "Codigo da Marca:" + id + " Nome da marca:" + nome;
	}
}
