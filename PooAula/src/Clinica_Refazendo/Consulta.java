package Clinica_Refazendo;

public class Consulta {
	private int codConsulta;
	private Nutricionista nutriResponsavel;
	
	public int getCodConsulta() {
		return codConsulta;
	}

	public void setCodConsulta(int codConsulta) {
		this.codConsulta = codConsulta;
	}

	public Nutricionista getNutriResponsavel() {
		return nutriResponsavel;
	}

	public void setNutriResponsavel(Nutricionista nutriResponsavel) {
		this.nutriResponsavel = nutriResponsavel;
	}

	public Consulta (int codConsulta, Nutricionista nutriResponsavel) {
		this.codConsulta=codConsulta;
		this.nutriResponsavel=nutriResponsavel;
	}

	public Consulta() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
