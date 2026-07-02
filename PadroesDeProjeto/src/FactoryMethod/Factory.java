package FactoryMethod;

/**
 * { - classe de exemplo.
 */

public abstract class Factory {
	
	public abstract IMedico getMedico (String nome);
	
	public IMedico criar(String nome) {
		IMedico novoMedico = this.getMedico(nome);
		return novoMedico;
	}
}
