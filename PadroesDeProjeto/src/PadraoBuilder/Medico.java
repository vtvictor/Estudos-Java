package PadraoBuilder;

public class Medico{
    
    protected String nome;
    protected int crm;
          
    public Medico(){
        
    }
    private Medico(String nome, int crm) {
        this.nome = nome;
    	this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public void consultaExame() {
    }
    
    public void imprimirExame() {
    }

    public boolean emitirExame() {
        return false;
    }


    public String toString() {
        return "(Nome: "+this.getNome()+", " + "Crm: "+this.getCrm()+")";
    }
}
