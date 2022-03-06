package ProvaFinal;

public class CriarPersonagemSingleton {

	private int danoInicial = 10; //Dano inicial do personagem
	private Arma armaAtual;
	private String nomePersonagem;
	
	
	
	public static CriarPersonagemSingleton instancia;
	
	private CriarPersonagemSingleton() {
		
	}

	protected int getDanoInicial() {
		return danoInicial;
	}

	protected void setDanoInicial(int danoInicial) {
		this.danoInicial = danoInicial;
	}

	protected Arma getArmaAtual() {
		return armaAtual;
	}

	protected void setArmaAtual(Arma armaAtual) {
		this.armaAtual = armaAtual;
		System.out.println(armaAtual);
	}

	protected String getNomePersonagem() {
		return nomePersonagem;
	}

	protected void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}
	
	private CriarPersonagemSingleton (int danoInicial, String nomePersonagem, Arma armaAtual) {
		this.danoInicial=danoInicial;
		this.nomePersonagem=nomePersonagem;
		this.armaAtual=armaAtual;
		
		
	}
	
	
	public void equiparArma (Arma arma) {
		this.armaAtual = arma;
	}
	
	public int getDanoDeAtaque() {
		return danoInicial + armaAtual.getDano();
	}
	
	//Singleton
	public static CriarPersonagemSingleton getInstancia() {
		if (instancia == null) {
			instancia = new CriarPersonagemSingleton();
		}
		return instancia;
	}
	
	@Override
	public String toString() {
		return "CriarPersonagemSingleton [danoInicial=" + danoInicial + ", armaAtual=" + armaAtual + ", nomePersonagem="
				+ nomePersonagem + "]";
	}
}