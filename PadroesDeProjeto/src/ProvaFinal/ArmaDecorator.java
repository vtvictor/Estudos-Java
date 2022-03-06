package ProvaFinal;

public abstract class ArmaDecorator extends Arma{
	
	Arma arma;
	
	public ArmaDecorator(Arma umaArma) {
		arma = umaArma;
	}
	

	@Override
	int getDano() {
		// TODO Auto-generated method stub
		return arma.getDano() + dano;
	}

	@Override
	String getNome() {
		// TODO Auto-generated method stub
		return arma.getNome()+ " + "+ nome;
	}
	
}
