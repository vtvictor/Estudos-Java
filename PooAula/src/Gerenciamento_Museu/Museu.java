package Gerenciamento_Museu;
import java.util.ArrayList;
import java.util.Scanner;

public class Museu {
	private String nome;
	private String endereco;
	private String telefone;
	private ArrayList <Obra> listaDeObras = new ArrayList<Obra>();
	private ArrayList <Artista> listaDeArtista = new ArrayList<Artista>();
	/*private Artista[] listaDeArtistas = new Artista[50];*/
	private static int codigoObra=0; //usado para gerar o codigo da obra
	
	public Museu(String nome, String endereco, String telefone) {
		this.nome=nome;
		this.endereco=endereco;
		this.telefone=telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	
	public String setTelefone() {
		return telefone;
	}
	public void getTelefone(String telefone) {
		this.telefone=telefone;
	}
	
	public ArrayList<Obra> getListaDeObras(){
		return listaDeObras;
	}
	
	public ArrayList<Artista> getListaDeArtista(){
		return listaDeArtista;
	}
	
	public Artista buscarArtista (String nome) {
		for (Artista elemento:listaDeArtista) { //percorrendo o arrayList com a lista de artistas
			if (elemento!=null) //se houver artista naquele elemento
				if(elemento.getNome().equalsIgnoreCase(nome)) {
					return elemento;
				}	
			}
			return null;
		}
	
	public void cadastrarArtista (Artista a) {
		Artista b=buscarArtista(a.getNome()); //buscar artista na base;
		if (b!=null) {
			System.out.println("Artista já está cadastrado!");
		}else { //se n foi nulo, quer dizer que não está cadastrado e agora vai ser cadastrado
			listaDeArtista.add(a); //adiciona no arraylist	
		}
	}
	
	public int cadastrarObra (Artista a) {
		Scanner dados=new Scanner (System.in);
		Obra x = new Obra();
		//como especificado, antes de cadastrar a obra tenho que cadastrar o artista
		this.cadastrarArtista(a);
		System.out.println("Digite o título da obra: ");
		x.setTitulo(dados.next());
		
		for(Obra elemento: this.listaDeObras) {//verificando nas obras do museu se a obra já foi cadastrada
			//foi usado o artista e o titulo como parametro de busca
			if((elemento.getAutor()==a)&&(elemento.getTitulo().equalsIgnoreCase(x.getTitulo()))){
				System.out.println("Obra já cadastrada no acervo");
				return elemento.getCodigo(); //retorna o codigo se já foi cadastrado
			}
			
		}
		//só chegara a esse ponto caso nao execute o if, por causa do return dentro do if
		codigoObra++;
		x.setCodigo(codigoObra);
		//os outros codigo da obra agora
		System.out.println("Digite o ano de aquisição: ");
		x.setAnoAquisicaoObra(dados.nextInt());
		System.out.println("Digite a tecnica utilizada: ");
		x.setTecnica(dados.next());
		x.setAutor(a);//sei que o artista a é o autor da obra
		a.addObras(x);//adiciono a obra na lista de obras do artista
		this.listaDeObras.add(x);//adiciono a obra na lista de obras do museu
		System.out.println("Obra adicionada com sucesso!");
		return x.getCodigo();//retorno o código da obra
	}	
}
