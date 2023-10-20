package empresa;

import java.util.ArrayList;

public class Cofrinho {				//Lista criada para exibir no menu
	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}
	
	public void adicionar(Moeda moeda) {		//Adiciona as moedas na lista
		this.listaMoedas.add(moeda);
	}
	
	public boolean remover(Moeda moeda) {		//Remove as moedas da lista 
		return this.listaMoedas.remove(moeda);
	}
	
	
	public void listarMoedas() {		//Listagem das moedas
		
		if(this.listaMoedas.isEmpty()) {		//caso nenhuma moeda tenha sido adiconada, logo, lista estará vazia
			System.out.println("O cofrinho esta vazio!!");
			return;
		}
		
		for(Moeda moeda : this.listaMoedas) {		//Quando houver adições, exibirá as moedas.
			moeda.info();
		}
	}

	public double totalConvertido() {		//caso não tenha moedas adicionadas para se fazer a conversão
		if (this.listaMoedas.isEmpty()) {
			return 0;	
		}
		
		double valorAcumulado = 0;		//irá acumular os valores adicionados.
		
		for(Moeda moeda : this.listaMoedas) {		//Para cada moeda listada, ele irá somar e converter os valores para Real.
			valorAcumulado = valorAcumulado + moeda.converter();
		
		}
		
		return valorAcumulado;		//retorno do total acumulado, já convertido
	}

}

