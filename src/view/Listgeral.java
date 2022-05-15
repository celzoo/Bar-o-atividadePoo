package view;
import java.util.ArrayList;

import java.util.List;

import interfaces.Listinterface;

import entity.*;


public class Listgeral implements Listinterface {
	
	List<Marcas> listMarca = new ArrayList();
	List<Modelos> listModelo = new ArrayList();
	List<Veiculos> listVeiculo = new ArrayList();
	List<Vagas> listVagas = new ArrayList();
	List<Estacionamento> listEsta = new ArrayList();

		

	@Override
	public void cadastrarMarca(Marcas marca ) {
		
		listMarca.add(marca);
	}
	@Override
	public void cadastrarModelos(Modelos modelo, int i) {
		modelo.setMarca(listMarca.get(i));
		listModelo.add(modelo);
		
	}
	@Override
	public void cadastrarVeiculos(Veiculos veiculos, int i) {
		veiculos.setModelo(listModelo.get(i));
		listVeiculo.add(veiculos);
		
	}
	@Override
	public void cadastrarVaga(Vagas vaga) {
		listVagas.add(vaga);
		
	}
	@Override
	public void cadastrarEstacioanamento(Estacionamento esta, String placa, int j) {
		int count=0;
		while(count<listVeiculo.size()) {
			if(listVeiculo.get(count).getPlaca().equals(placa)) {
				esta.setVeiculo(listVeiculo.get(count));
			
			}
			count++;
			
		}
		
		esta.setVaga(listVagas.get(j));
		listEsta.add(esta);
		
	}
	@Override
	public void verMarca() {
	
		int count=0;
		while(count < listMarca.size()) {
			System.out.println(listMarca.get(count));	
			count++;
			}
	}
	@Override
	public void verModelo() {
		
		int count=0;
		while(count < listModelo.size()) {
		System.out.println(listModelo.get(count));
			count++;
			}
		
	}
	@Override
	public void verVeiculo() {
		
		int count=0;
		while(count < listVeiculo.size()) {
		System.out.println(listVeiculo.get(count));	
			count++;
			}
		
	}
	@Override
	public void verVagga() {
		
		int count=0;
		while(count < listVagas.size()) {
		System.out.println(listVagas.get(count));	
			count++;
			}
		
	}
	@Override
	public void consultaData(String data) {
		int count = 0;
		
		while(count<listEsta.size()) {
			if(listEsta.get(count).getDataDeEntrada().equalsIgnoreCase(data)) {
				System.out.println("A data " + listEsta.get(count).getDataDeEntrada() + "Esta ocupada com as vagas " + listEsta.get(count).getVaga());
			}
			else {
				System.out.println("A data não existe no sistema");
			}
			count++;
		}
		if(count==0) {
			System.out.println("A data nao existe no sistema");
		}
		
	}
	@Override
	public void verEstacionamento() {
		int count=0;
		while(count < listEsta.size()) {
		System.out.println(listEsta.get(count));	
			count++;
			}
		
	}
	


	
	



	
}
