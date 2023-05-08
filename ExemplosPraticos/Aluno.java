package Exemplos;

import java.util.Scanner;

public class Aluno {
	private String nome;
	private int idade;
	private String matricula;
	
	public Aluno(String nome, int idade, String matricula) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void exibirDados() {
		System.out.println("Nome :"+ nome);
		System.out.println("Idade: "+ idade);
		System.out.println("Matricula: "+ matricula);
		
	}

	public class CadastroAluno{
		
		public static void main(String[] args) {
			
			Scanner ler = new Scanner (System.in);
			System.out.println("Digite o nome do aluno: ");
			String nome = ler.nextLine();
			System.out.println("Digite a Idade do Aluno: ");
			int idade = ler.nextInt();
			System.out.println("Digite a Matricula do aluno: ");
			String matricula = ler.next();
			
			Aluno aluno = new Aluno(nome, idade, matricula);
			
			aluno.exibirDados();
		  }	
	}
}


