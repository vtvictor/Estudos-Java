package PadraoPrototype;

public class MedicoPrototype extends MedicoPapeisPrototype{

	protected static String nome;
	protected static int CRM;
	
	public MedicoPrototype () {
		
	}
	
	public static MedicoPrototype instanciar;
	
	public MedicoPrototype (String nome, int CRM) {
		this.nome=nome;
		this.CRM=CRM;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static int getCRM() {
		return CRM;
	}

	public void setCRM(int cRM) {
		CRM = cRM;
	}	
	
	public String emitExame(String tipoExame) {
		return tipoExame;
	}
	
	//UTILIZANDO O PROTOTYPE
	public MedicoPrototype(MedicoPrototype medicoPrototype) {
		// TODO Auto-generated constructor stub
		this.nome=MedicoPrototype.getNome();
		this.CRM=MedicoPrototype.getCRM();
	}
	
	@Override
	public MedicoPapeisPrototype clonar() {
		return new MedicoPrototype(this);
	}
	
	@Override
	public String toString() {
		return "Medico [nome=" + nome + ", CRM=" + CRM + "]";
	}
	
	
	@Override
	public boolean emitirExame() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
