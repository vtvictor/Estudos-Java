package PadraoBuilder;

import java.time.LocalDate;

public class Paciente{

    private String nome, cor, sexo;
    private int idade;

    public Paciente() {

    }
    public Paciente(String nome, String cor, String sexo, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int calculoIdade(int data) {
        this.setIdade((LocalDate.now().getYear() - data));
        return this.getIdade();
    }
    
    public String toString() {
        return "(Nome: " + this.getNome()+", " + "Sexo: " + this.getSexo()+", " + 
        		"Cor: " + this.getCor()+", " + "Idade: " + this.getIdade()+")";
    }
}
