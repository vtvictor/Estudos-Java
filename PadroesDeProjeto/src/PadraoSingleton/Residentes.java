package PadraoSingleton;

public class Residentes extends IMedico{

	private String titulacao, nome;
	private int ano_residencia;
	private int CRM;
	
	private static Residentes instanceResidente;
	
	public Residentes() {
		
	}

	public Residentes(String titulacao, int CRM, int ano_residencia, String nome) {
		this.nome=nome;
		this.CRM=CRM;
		this.titulacao=titulacao;
		this.ano_residencia=ano_residencia;
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

	@Override
	public IMedico criar() {
		Residentes residente = new Residentes ("Fernanda", 5678, 2020, "Professora");
		return residente;
	}
	
}
