package PadraoBuilder;

public class Residente extends Medico {

    private int ano_residencia;

    public Residente() {

    }

    public Residente(int crm, String nome,int ano_residencia) {
        this.ano_residencia = ano_residencia;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno_residencia() {
        return ano_residencia;
    }

    public void setAno_residencia(int ano_residencia) {
        this.ano_residencia = ano_residencia;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }
    
    
    public void emitirLaudo() {
    }

    public boolean registroExame() {
        return false;
    }

    
    public String toString() {
        return "(Nome:"+this.getNome()+", " + "(CRM: "+this.getCrm()+", "
        		+ ""+"Ano Residencia="+this.getAno_residencia()+")";
    }
}
