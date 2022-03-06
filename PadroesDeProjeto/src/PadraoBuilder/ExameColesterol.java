package PadraoBuilder;

public class ExameColesterol extends ExameBuilder{

	@Override
	public void buildExame() {
		// TODO Auto-generated method stub
		solicitacao.exame="Exame de Colesterol";
	}

	@Override
	public void buildRecomendacao() {
		solicitacao.recomendacao="Manter a dieta habitual nos cinco dias "
				+ "que antecedem a realização deste exame";
		
	}

	@Override
	public void buildData() {
		// TODO Auto-generated method stub
		solicitacao.data="18/03/2020";
	}

	@Override
	public void buildPaciente() {
		// TODO Auto-generated method stub
		solicitacao.paciente="Luiz";
		
	}

	@Override
	public void buildMedico() {
		// TODO Auto-generated method stub
		solicitacao.medico="Victor";
		
	}
	

}
