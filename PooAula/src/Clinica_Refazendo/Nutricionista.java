package Clinica_Refazendo;

public class Nutricionista {
	private int crn;
	private String nome;
	private double valorConsulta;
	
	public Nutricionista(int crn, String nome, double valorConsulta) {
		this.crn=crn;
		this.nome=nome;
		this.valorConsulta=valorConsulta;
	}
	
	public Nutricionista() {
		// TODO Auto-generated constructor stub
	}

	public double calcularValorConsulta(int tempo) {
		return tempo*(valorConsulta)/60;
	}

	public int getCrn() {
		return crn;
	}

	public void setCrn(int crn) {
		this.crn = crn;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	

}
