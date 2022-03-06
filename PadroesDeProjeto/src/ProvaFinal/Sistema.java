package ProvaFinal;

public class Sistema {

	public static void main(String[] args) {
		
		System.out.println("[Criação do personagem] ");
		CriarPersonagemSingleton personagem1 = CriarPersonagemSingleton.getInstancia();
		CriarPersonagemSingleton personagem2 = CriarPersonagemSingleton.getInstancia();
		
		System.out.println();
		
		System.out.println("Digite o nome do personagem: "+personagem1.getInstancia());		
		     
	}

}
