package entity;

public class Estacionamento {
	String dataDeEntrada;
	Vagas vaga;
	Veiculos veiculo;
	String motorista;
	public void setVaga(Vagas vaga) {
		this.vaga = vaga;
	}
	public void setVeiculo(Veiculos veiculo) {
		this.veiculo = veiculo;
	}
	public Estacionamento(String dataDeEntrada, String motorista) {
		super();
		this.dataDeEntrada = dataDeEntrada;
		this.motorista = motorista;
	}
	
	public String toString() {
		return "Nome do motorista: " + motorista + " Data de entrada: " + dataDeEntrada + vaga + veiculo;
	}
	public String getDataDeEntrada() {
		return dataDeEntrada;
	}
	public Vagas getVaga() {
		return vaga;
	}
	
	
	

}
