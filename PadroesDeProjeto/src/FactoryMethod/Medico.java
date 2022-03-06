package FactoryMethod;

public class Medico implements IMedico{

	protected String nome;
	protected int CRM;
	
	public Medico () {
		
	}
	
	public static Medico instanciar;
	
	public Medico (String nome, int CRM) {
		this.nome=nome;
		this.CRM=CRM;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCRM() {
		return CRM;
	}

	public void setCRM(int cRM) {
		CRM = cRM;
	}	
	
	public String emitExame(String tipoExame) {
		return tipoExame;
	}
	
	public static Medico getInstanciar() {
		if(instanciar==null) {
			instanciar = new Medico();
		}
		return instanciar;	
	}
	
	public String toString() {
		return "Medico [nome=" + nome + ", CRM=" + CRM + "]";
	}
	

}
