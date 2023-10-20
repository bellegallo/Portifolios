package empresa;

public class Euro extends Moeda {
	public Euro(double valorInicial) {
		this.valor = valorInicial; 
	}

	@Override
	public void info() {
		System.out.println("Euro - " + valor);
		
	}

	@Override
	public double converter() {		//Conversão do Euro para Real
		return this.valor * 5.26;
	}
	
	@Override		//remove adequadamente os valores que o usuário quer
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
		return false;
		}
		
		Euro objetoEuro = (Euro) objeto;
		
		if(this.valor != objetoEuro.valor) {
			return false;
	}
		
		return true;
	}


}
