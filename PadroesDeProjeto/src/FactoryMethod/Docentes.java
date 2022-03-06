package FactoryMethod;

public class Docentes extends Medico{

	private String titulacao;
	
	public Docentes() {
		
	}
	
	public Docentes (String titulacao) {
		this.titulacao=titulacao;
	}
	
	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public String emitPedido (String tipoPedido) {
		return tipoPedido;
	}
	
	public void revisarLaudo() {
		
	}
	
	public String toString() {
		return "Docente [titulacao=" + titulacao + ", nome=" + nome + ", CRM=" + CRM + "]";
	}
	

}
