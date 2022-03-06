package Exercicio_Heranca;

public class Mamifero extends Animal {
	private String alimento;
	public Mamifero(String nome, float comprimento, int num_patas, String cor, String ambiente, float velocidade, String alimento) {
		super(nome, comprimento, num_patas, cor, ambiente, velocidade);
		this.alimento=alimento;
	}
	
	public String getAlimento() {
		return alimento;
	}
	public void setAlimento(String alimento) {
		this.alimento=alimento;
	}
	
	public void dadosMamifero() {
		super.dados();
		System.out.println("alimento: "+this.alimento);
		/*Ou (pode usar o super.nome ou this.nome: 
		 * System.out.println("Nome: "+super.nome+", Comprimento: "+super.comprimento+", Número de patas: "+this.num_patas+", "
				+ "Cor: "+this.cor+", Ambiente: "+this.ambiente+", Velocidade: "+this.velocidade+", alimento: "+this.alimento);*/
		
	}

}
