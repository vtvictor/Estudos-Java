package PadraoSingleton;

public class Docentes extends IMedico{

	private String titulacao;
	private String nome;
	private int CRM;
	
	public Docentes() {
		
	}
	
	public Docentes (String nome, int CRM, String titulacao) { 
		this.nome=nome;
		this.CRM=CRM;
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

	@Override
	public IMedico criar() {
		Docentes docente = new Docentes ("Luiz", 9876, "Aluno");
		return docente;
	}
	

}
