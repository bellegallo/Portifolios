package empresa;

public class Dolar extends Moeda {
	
	public Dolar(double valorInicial) {
		this.valor = valorInicial; 
	}

	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
		
	}

	@Override 		//Conversão do Dolar para Real
	public double converter() {
		return this.valor * 4.85;
	}
	
	@Override 		//remove adequadamente os valores que o usuário quer
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
		return false;
		}
		
		Dolar objetoDolar = (Dolar) objeto;
		
		if(this.valor != objetoDolar.valor) {
			return false;
	}
		
		return true;
	}

}
