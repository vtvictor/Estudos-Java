package EstudandoAula2;

public class UmaClasse {
	private String nome;
	public String sobrenome;
	protected Number idade;
	        
	 

	public UmaClasse(String nome, String sobrenome, int idade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}



	public int getIdade() {
		return (int) idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
