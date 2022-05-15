package interfaces;

import entity.Estacionamento;

import entity.*;

public interface Listinterface {
	
	void cadastrarMarca(Marcas marca);
	void cadastrarModelos(Modelos  modelo,int i);
	void cadastrarVeiculos(Veiculos  veiculos,int i);
	void cadastrarVaga(Vagas vaga);
	void cadastrarEstacioanamento(Estacionamento esta , String vaga, int j);
	
	void verMarca();
	void verModelo();
	void verVeiculo();
	void verVagga();
	void verEstacionamento();
	
	void consultaData(String data);
	



	

}
