package PadraoPrototype;

public class Docentes extends DocentesPapeisPrototype{

	private String titulacao;
	private String nome;
	private int CRM;
	
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
	
	@Override
	public String toString() {
		return "Docente [titulacao=" + titulacao + ", nome=" + nome + ", CRM=" + CRM + "]";
	}

	@Override
	public DocentesPapeisPrototype clonar() {
		// TODO Auto-generated method stub
		return new Docentes();
	}
	

}
