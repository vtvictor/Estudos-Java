package Gerenciamento_Museu;
import java.util.Scanner;

public class Programa_museu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Museu mus = new Museu("Museu da Gente Sergipana", "Av. Ivo do Prado, 398", "79999631551");
		int opc;
		String nome;
		do {
			System.out.println("Menu: ");
			System.out.println("1. Cadastrar obra;");
			System.out.println("2. Listar obras de um artista;");
			System.out.println("3. Listas informações;");
			System.out.println("4. Sair do Sistema.");
			opc=leia.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Informe o nome do artista e os seus devidos dados(codigo, ano, titulo, tecnica): ");
				nome=leia.next();
				//buscar o artista se foi cadastrado
				Artista b = mus.buscarArtista(nome);
				if (b==null) { //se não estiver cadastrado,, vamos criar ele e cadastrar a obra
					System.out.println("Digite a nacionalidade do artista: ");
					Artista a = new Artista();
					a.setNacionalidade(leia.next());
					a.setNome(nome);
					System.out.println("Código: "+mus.cadastrarObra(a));
				}else { //se não estiver cadastrado basta apenas chamar o cadastro da obra
					System.out.println("Código: "+mus.cadastrarObra(b));
				}
				/*a.setNome(leia.next());
				b.setCodigo(leia.nextInt());
				b.setAnoAquisicaoObra(leia.nextInt());
				b.setTitulo(leia.next());
				b.setTecnica(leia.next());
				a.addObras(b);
				System.out.println("Informações da obra: ");
				b.imprimirDados();
				mus.cadastrarArtista(a);*/
				break;
			case 2:
				System.out.println("Informe o nome do artista: ");
				nome=leia.next();
				//buscar se o artista ta cadastrado
				Artista c = mus.buscarArtista(nome);
				if (c==null) { //se retorna null é pq não está cadastrado
					System.out.println("Artista não cadastrado!");
				}else { //caso esteja cadastrado vou acessar a Lista de Obras do artista
					for(Obra elemento: c.getListaDeObras()) {
						elemento.imprimirDados();
					}	
				}
				break;
				
			case 3:
				for (Artista elemento: mus.getListaDeArtista()) {
					elemento.imprimir();
				}			
				break;
				
			case 4:
				System.out.println("Fim do programa.");
				
				break;
			}
		}while (opc!=4);
	}

}
