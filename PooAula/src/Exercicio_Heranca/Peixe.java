package Exercicio_Heranca;

public class Peixe extends Animal{
	private String caracteristicas;

	public Peixe(String nome, float comprimento, int num_patas, String cor, String ambiente,
			float velocidade, String caracteristicas) {
		super(nome, comprimento, num_patas, cor, ambiente, velocidade);
		this.caracteristicas=caracteristicas;
		
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristiccas(String caracteristicas) {
		this.caracteristicas=caracteristicas;
	}
	
	public void dadosPeixe() {
		System.out.println("Nome: "+this.nome+", Comprimento: "+this.comprimento+", Número de patas: "+this.num_patas+", "
				+ "Cor: "+this.cor+", Ambiente: "+this.ambiente+" e Velocidade: "+this.velocidade);
		System.out.println("Caractetisticas: "+this.caracteristicas);
	}
	
}
