package entity;

public class Vagas {
	String idFileira;
	int idVaga;
	public Vagas(String idFileira, int idVaga) {
		super();
		this.idFileira = idFileira;
		this.idVaga = idVaga;
	}

	
	public String toString() {
		return " ||Dados da Vaga|| Codigo da vaga: " + idVaga + " Fileira da vaga: " + idFileira;
	}

	
	
	
	
	

}
