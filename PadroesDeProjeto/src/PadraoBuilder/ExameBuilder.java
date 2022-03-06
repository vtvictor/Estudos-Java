package PadraoBuilder;

public abstract class ExameBuilder {

    protected ExameProduct solicitacao;

    public ExameBuilder() {
        solicitacao = new ExameProduct();
    }
    
    public abstract void buildExame();
    public abstract void buildRecomendacao();
    public abstract void buildData();
    public abstract void buildPaciente();
    public abstract void buildMedico();

    public ExameProduct getSolicitacao() {
        return solicitacao;
    }
}
