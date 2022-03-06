package Exercicio_Heranca;

public class Animal {
	protected String nome;
	protected float comprimento;
	protected int num_patas;
	protected String cor;
	protected String ambiente;
	protected float velocidade;
	
	public Animal (String nome, float comprimento, int num_patas, String cor, String ambiente, float velocidade) {
		this.nome=nome;
		this.comprimento=comprimento;
		this.num_patas=num_patas;
		this.cor=cor;
		this.ambiente=ambiente;
		this.velocidade=velocidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void SetNome(String nome) {
		this.nome=nome;
	}
	
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento (float comprimento) {
		this.comprimento=comprimento;
	}
	
	public int num_patas () {
		return num_patas;
	}
	public void setNum_patas(int num_patas) {
		this.num_patas=num_patas;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor=cor;
	}

	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente=ambiente;
	}
	
	public float getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		this.velocidade=velocidade;
	}
	
	public void dados() {
		System.out.println("Nome: "+this.nome+", Comprimento: "+this.comprimento+", Número de patas: "+this.num_patas+", "
				+ "Cor: "+this.cor+", Ambiente: "+this.ambiente+" e Velocidade: "+this.velocidade);
	}
	
	
	/*utilizando o generate
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getNum_patas() {
		return num_patas;
	}

	public void setNum_patas(int num_patas) {
		this.num_patas = num_patas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	*/
	

	
}
