package ProvaFinal;

public class Platina extends ArmaDecorator{

	public Platina(Arma umaArma) {
		super(umaArma);
		// TODO Auto-generated constructor stub
		nome = "Platina";
		dano= arma.getDano() + 4;
	}
	

}
