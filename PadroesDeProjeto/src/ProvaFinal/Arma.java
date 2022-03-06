package ProvaFinal;


	/*Niveis de dano das armas: 
	 * 1: Bronze
	 * 2: Prata
	 * 3: Ouro
	 * 4: Platina
	 * 5: Diamante
	 */
public abstract class Arma {
	int dano;
	String nome;
	
	int getDano() {
		return dano;
	}
	
	String getNome() {
		return nome;
	}
}
