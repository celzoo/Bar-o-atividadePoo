package view;
import entity.*;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		Listgeral list = new Listgeral();
		Scanner sc = new Scanner(System.in);
		
		int choice=10;
		int marcaId=-1,modeloId=-1,veiculoId=-1,vagaId=-1;
		int choiceId,choiceVaga;
		
		String nome,cor,placa,fileira,data;
		String choiceS;
		
		while(choice!=0) {
			System.out.println("Digite 1 para cadastrar marca");
			System.out.println(" 2 para cadastrar modelo"); 
			System.out.println(" 3 para cadastrar veiculo"); 
			System.out.println(" 4 para cadastrar vaga"); 
			System.out.println(" 5 para registrar o estacionamento"); 
			System.out.println(" 6 para consultar por data"); 
			System.out.println("7 para ver todos os dados com as vagas ocupadas"); 
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Digite o nome da marca");
					nome = sc.next();
					marcaId++;
					Marcas marca = new Marcas(marcaId, nome);
					list.cadastrarMarca(marca);
					System.out.println();
				break;
				
				case 2:
					
					System.out.println("Voce ve a marca respectiva do modelo que ira ser cadastrado abaixo ? Sim = sim || N = não");
					list.verMarca();
					choiceS = sc.next();
					if(choiceS.equalsIgnoreCase("sim")) {
						System.out.println("Digite o codigo da marca que pertence a esse modelo");
						choiceId = sc.nextInt();
						System.out.println("Digite o nome do modelo");
						nome = sc.next();
						modeloId++;
						Modelos modelo = new Modelos(modeloId, nome);
						list.cadastrarModelos(modelo,choiceId);
					}
					else {
						System.out.println("Ao voltar ao menu cadastre a marca primeiro");
						
					
					}
					System.out.println();
					
				break;
				
				case 3:
					System.out.println("Voce ve o modelo respectivo do veiculo que ira ser cadastrado abaixo ? Sim = sim || N = não");
					list.verModelo();
					choiceS = sc.next();
					if(choiceS.equalsIgnoreCase("sim")) {
						System.out.println("Digite o codigo do modelo que pertence a esse veiculo");
						choiceId = sc.nextInt();
						System.out.println("Digite a cor do veiculo");
						cor = sc.next();
						System.out.println("Digite a placa do veiculo");
						placa = sc.next();
						veiculoId++;
						Veiculos veiculo = new Veiculos(placa, cor);
						list.cadastrarVeiculos(veiculo, choiceId);
						list.verVeiculo();
					}
					else {
						System.out.println("Ao voltar ao menu cadastre o modelo primeiro");
						
					
					}
					System.out.println();
					break;
					
				case 4:
					
					System.out.println("Digite o codigo da fileira");
					fileira = sc.next();
					vagaId++;
					Vagas vaga = new Vagas(fileira, vagaId);
					list.cadastrarVaga(vaga);
				
					System.out.println();
				break;
				
				case 5:
					System.out.println("Voce ve o veiculo e vaga  respectiva do estacionamento que sera registrado abaixo ? Sim = sim || N = não");
					list.verVeiculo();
					list.verVagga();
					choiceS = sc.next();
					if(choiceS.equalsIgnoreCase("sim")) {
						System.out.println("Digite a placa");
						placa = sc.next();
						System.out.println("Digite o codigo da vaga que foi ocupada");
						choiceVaga = sc.nextInt();
						System.out.println("Digite o nome do motorista");
						nome = sc.next();
						System.out.println("Digite a data do registro");
						data = sc.next();
						Estacionamento esta = new Estacionamento(data, nome);
						list.cadastrarEstacioanamento(esta, placa, choiceVaga);
					}
					else {
						System.out.println("Ao voltar ao menu cadastre o veiculo e a vaga respectiva para registrar o estacionamento");
						
					
					}
					System.out.println();
					break;
					
					
					
		
				case 6:
					System.out.println("Digite a data que deseja saber se esta ocupada ");
					data = sc.next();
					list.consultaData(data);
					System.out.println();
					break;
					
				case 7:
					System.out.println("Todos os dados do sistema com vagas ocupadas");
					list.verEstacionamento();
					System.out.println();
					break;
					
		
			}
		
		}

	}

}
