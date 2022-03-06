package ProvaFinal;

public class Bronze extends ArmaDecorator {

	public Bronze(Arma umaArma) {
		super(umaArma);
		// TODO Auto-generated constructor stub
		nome="Bronze";
		dano= arma.getDano() + 1;
	}

}
