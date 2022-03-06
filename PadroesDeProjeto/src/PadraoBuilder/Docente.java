package PadraoBuilder;

public class Docente extends Medico {
    private String titulacao;

    public Docente() {

    }

    public Docente(int crm, String nome,String titulacao){
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void revisaoLaudos() {
    }

    public boolean emitirExame() {
        return false;
    }

	public String toString() {
		return "Docente (Nome=" + nome + ", CRM:" + crm + ", Titulacao:" + titulacao+")";
	}
    
    
}
