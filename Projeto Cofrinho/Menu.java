package empresa;

import java.util.Scanner;

public class Menu {
	private Scanner sc;
	private Cofrinho cofrinho;
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	//Menu personalizado.
	public void exibirMenu() {
		System.out.println("COFRINHO:");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moeda");
		System.out.println("4-Calcular total convertido para Real");
		System.out.println("5-Encerrar");
		
		String opcao= sc.next();
		
		//Dependendo da opção escolhida no menu, cada case executará uma ação.
		switch(opcao) {
			case "5":
				System.out.println("Programa encerrado!");
				break;
				
			case "1": //Irá exibir o menu de adição das moedas e, depois, irá exibir novamente o menu principal.
				exibirSubMenuAdicionarMoedas();
				exibirMenu();
				break;
				
			case "3": //Lista as moedas que já foram adicionadas, depois, volta a exibir o menu principal.
				System.out.println("Moedas Listadas: ");
				cofrinho.listarMoedas();
				exibirMenu();
				break;
				
			case "4": //Converte o valor das moedas. Foi criada a String format valorTotalConvertido para que exiba apenas 2 números depois da vírgula.
				double valorTotalConvertido = cofrinho.totalConvertido();
				String valorConvertidoTotal = String.format("%.2f", valorTotalConvertido);
				System.out.println("Valor total convertido em Reais: " + valorConvertidoTotal);
				exibirMenu(); //Exibe o menu principal novamente
				break;
			
			case "2": //Irá exibir o menu de remoção das moedas e, depois, irá exibir novamente o menu principal.
				exibirSubMenuRemoverMoedas();
				break;
				
			default: //caso o usuário escolha uma opção diferente das citadas no menu.
				System.out.println("Opcao invalida!");
				exibirMenu();
				break;
		}
		
	}
	
	
	private void exibirSubMenuAdicionarMoedas() { 		//Menu de adição das moedas.
		System.out.println("Escolha a Moeda: ");
		System.out.println("1-Real");
		System.out.println("2-Dolar");
		System.out.println("3-Euro");
		
		int tipoMoeda = sc.nextInt();
		
		System.out.println("Digite o valor: ");
		
		String valorTextoMoeda = sc.next() ;
		valorTextoMoeda = valorTextoMoeda.replace("," , "." ); 	//Caso o usuário digite vírgula, o programa irá substituir a vírgula para ponto, evitando erro.
		
		double valorMoeda = Double.valueOf(valorTextoMoeda); 	//Transforma a String valorTextoMoeda para double. 
		
		if(tipoMoeda == 1) { 		//Conversão da moeda (de 1 para 1) e, em seguida, sua adição no cofrinho.
			Real moeda = new Real(valorMoeda);
			cofrinho.adicionar(moeda);
		}
		
		else if(tipoMoeda == 2) { 		//Conversão da moeda e, em seguida, sua adição no cofrinho.
			Dolar moeda = new Dolar(valorMoeda);
			cofrinho.adicionar(moeda);
		}
		
		else if(tipoMoeda == 3) { 		//Conversão da moeda e, em seguida, sua adição no cofrinho.
			Euro moeda = new Euro(valorMoeda);
			cofrinho.adicionar(moeda);
		}
		
		else { 			//Caso a moeda escolhida seja diferente das opções apresentadas.
			System.out.println("Moeda inexistente!");
			exibirMenu();
		}
		
		System.out.println("Moeda adicionada!");  //Ao final das conversões, aparece a mensagem de confirmação a adição.

	}
	
	private void exibirSubMenuRemoverMoedas() { 			//Menu de remoção das moedas.
		System.out.println("Escolha a moeda que deseja REMOVER: ");
		System.out.println("1-Real");
		System.out.println("2-Dolar");
		System.out.println("3-Euro");
		
		
		int tipoMoeda = sc.nextInt();
		
		System.out.println("Digite o valor: ");
		
		String valorTextoMoeda = sc.next() ;
		valorTextoMoeda = valorTextoMoeda.replace("," , "." );			//Caso o usuário digite vírgula, o programa irá substituir a vírgula para ponto, evitando erro.
		
		double valorMoeda = Double.valueOf(valorTextoMoeda);			//Transforma a String valorTextoMoeda para double.
		
		if(tipoMoeda == 1) {						//Conversão da moeda e, em seguida, sua remoção do cofrinho.
			Real moeda = new Real(valorMoeda);
			if(cofrinho.remover(moeda)) {
				System.out.println("Moeda removida!");
			}
			else {											//Caso usuário tente remover um valor que não tenha sido adicionado.
				System.out.println("Nenhuma moeda com esse valor foi encntrado.");
			}
		}
		
		else if(tipoMoeda == 2) {			//Conversão da moeda e, em seguida, sua remoção do cofrinho.
			Dolar moeda = new Dolar(valorMoeda);
			if(cofrinho.remover(moeda)) {
				System.out.println("Moeda removida!");
			}
			else {							//Caso usuário tente remover um valor que não tenha sido adicionado.
				System.out.println("Nenhuma moeda com esse valor foi encntrado.");
			}
		}
		
		else if(tipoMoeda == 3) {				//Conversão da moeda e, em seguida, sua remoção do cofrinho.
			Euro moeda = new Euro(valorMoeda);
			if(cofrinho.remover(moeda)) {
				System.out.println("Moeda removida!");
			}
			else {								//Caso usuário tente remover um valor que não tenha sido adicionado.
				System.out.println("Nenhuma moeda com esse valor foi encntrado.");
			}		}
		
		else {									//Caso usuário tente remover uma moeda diferente das opções citadas.
			System.out.println("Moeda inexistente!");
			exibirMenu();
		}
		
		//Volta a exibir o menu principal ao final de cada remoção.
		exibirMenu();
	}
}
