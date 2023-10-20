package empresa;

public class Real extends Moeda{
	
	public Real(double valorInicial) {
		this.valor = valorInicial; 
	}

	@Override
	public void info() {
		System.out.println("Real - " + valor);
		
	}

	@Override
	public double converter() {		//Conversão
		return this.valor;
	}
	
	@Override		//remove adequadamente os valores que o usuário quer
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
		return false;
		}
		
		Real objetoReal = (Real) objeto;
		
		if(this.valor != objetoReal.valor) {
			return false;
	}
		
		return true;
	}
	

}
