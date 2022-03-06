package ProvaFinal;

public class Ouro extends ArmaDecorator{

	public Ouro(Arma umaArma) {
		super(umaArma);
		// TODO Auto-generated constructor stub
		nome = "Ouro";
		dano = arma.getDano() + 3;
	}
	

}
