package PadraoPrototype;

public class Residentes extends ResidentesPapeisPrototype{

	protected String titulacao;
	private int anoDaResidencia;
	
	public Residentes() {
		
	}

	public Residentes(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public int getAnoDaResidencia() {
		return anoDaResidencia;
	}
	
	public void setAnoDaResidencia (int anoDaResidencia) {
		this.anoDaResidencia=anoDaResidencia;
	}
	
	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public void emitLaudo() {
		
	}
	
	
	@Override
	public String toString() {
		return "Residentes [titulacao=" + titulacao + ", anoDaResidencia=" + anoDaResidencia + "]";
	}
	
	//UTILIZANDO O PROTOTYPE
	@Override
	ResidentesPapeisPrototype clonar() {
		// TODO Auto-generated method stub
		return new Residentes();
	}
	
}
