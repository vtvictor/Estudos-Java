package ProvaFinal;

public class Prata extends ArmaDecorator{

	public Prata(Arma umaArma) {
		super(umaArma);
		// TODO Auto-generated constructor stub
		nome = "Prata";
		dano = arma.getDano() + 2;
	}

}
