package PadraoBuilder;

public class PrepararExameDirector {
	protected ExameBuilder prepararExame;
	
	public PrepararExameDirector(ExameBuilder prepararExame) {
		this.prepararExame=prepararExame;
	}
	
	public void construirExame() {
		prepararExame.buildMedico();
		prepararExame.buildData();
		prepararExame.buildExame();
		prepararExame.buildPaciente();
		prepararExame.buildRecomendacao();
	}

    public ExameProduct getSolicitacao() {
        return prepararExame.getSolicitacao();
    }
    

}
