package PadraoSingleton;

public class Medico extends IMedico{

	private String nome;
	private int CRM;
	private int ano_residencia;
	
	private Medico () {
		
	}
	
	private static Medico instance;
	
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
	
	//Utilizando o padrão Singleton
	public static Medico getInstance() {
		if(instance==null) {
			instance = new Medico("Luiz", 8888);
			
		}
		return instance;	
	}
	
	protected Medico(int crm, String nome) {
		this.CRM=CRM;
		this.nome=nome;
	}
	
	public String toString() {
		return "Medico [nome=" + nome + ", CRM=" + CRM + "]";
	}

	@Override
	public IMedico criar() {
		Medico medico = new Medico ("Victor", 1234); 
		return medico;
	}
	
}