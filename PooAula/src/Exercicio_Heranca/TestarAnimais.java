package Exercicio_Heranca;

public class TestarAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero camelo = new Mamifero ("Camelo", 150, 4, "Amarelo", "Terra", 2, "Vegetação");
		//camelo.dados();
		camelo.dadosMamifero();
		System.out.println(" ");
		Peixe tubarao = new Peixe ("Tubarão", 300, 0, "Cinzento", "Mar", (float)1.5, "Barbatanas e caldas");
		tubarao.dadosPeixe();
		System.out.println(" ");
		Mamifero ursocanada = new Mamifero ("Urso-do-Canada", 180, 4, "Vermelho", "Terra", (float)0.5, "Mel");
		ursocanada.dadosMamifero();
	}

}
