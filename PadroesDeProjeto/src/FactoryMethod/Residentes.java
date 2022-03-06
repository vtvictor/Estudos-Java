package FactoryMethod;

public class Residentes extends Medico{

	protected String titulacao;
	
	public Residentes() {
		
	}

	public Residentes(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public void emitLaudo() {
		
	}
	
	public String toString() {
		return "Residentes [titulacao=" + titulacao + ", nome=" + nome + ", CRM=" + CRM + "]";
	}
	
}
