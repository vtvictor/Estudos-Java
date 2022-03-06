package FactoryMethod;

public class PedidoExame {

	private String diagnostico, tipoExame, dataExame;
	
	public PedidoExame() {
		
	}

	public PedidoExame(String diagnostico, String tipoExame, String dataExame) {
		this.diagnostico = diagnostico;
		this.tipoExame = tipoExame;
		this.dataExame = dataExame;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}

	public String getDataExame() {
		return dataExame;
	}

	public void setDataExame(String dataExame) {
		this.dataExame = dataExame;
	}
	
	public Paciente registPaciente() {
		return null;
	}
	
	public String emitExame(String tipoExame) {
		return tipoExame;
	}
	
	public void exibirInfo() {
		
	}
	
	public String toString() {
		return "PedidoExame [diagnostico=" + diagnostico + ", tipoExame=" + tipoExame + ", dataExame=" + dataExame
				+ "]";
	}
	
}
