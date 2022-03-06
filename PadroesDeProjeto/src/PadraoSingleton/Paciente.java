package PadraoSingleton;
import java.time.LocalDate;

public class Paciente {

	private String nome, sexo, cor;
	private int idade;
	
	public Paciente() {
		
	}
	
	private static Paciente instancePaciente;
	
	public Paciente(String nome, String sexo, String cor, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.cor = cor;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}	
	
	//Utilizando o padrão Singleton
	public static Paciente getInstancePaciente() {
		if(instancePaciente==null) {
			instancePaciente = new Paciente("Joao", "M", "Pardo", 20);
		}
		return instancePaciente;	
	}

	public int idadeCalculo(int dataPaciente) {
		this.setIdade((LocalDate.now().getYear()-dataPaciente));
		return this.getIdade();
	}
	
	public String toString() {
		return "Paciente [nome=" + nome + ", sexo=" + sexo + ", cor=" + cor + ", idade=" + idade + "]";
	}
	
	

}
