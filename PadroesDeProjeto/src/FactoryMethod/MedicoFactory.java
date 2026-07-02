package FactoryMethod;

/**
 * extends - classe de exemplo.
 */

public class MedicoFactory extends Factory{
	
	@Override
	public IMedico getMedico(String nome) {
		// TODO Auto-generated method stub
		return new Medico();
	}

}
