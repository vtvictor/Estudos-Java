package ProvaFinal;

public class Diamante extends ArmaDecorator{

	public Diamante(Arma umaArma) {
		super(umaArma);
		// TODO Auto-generated constructor stub
		nome = "Diamante";
		dano = arma.getDano() + 5;
	}
	

}
