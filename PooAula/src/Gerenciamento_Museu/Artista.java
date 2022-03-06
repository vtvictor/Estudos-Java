package Gerenciamento_Museu;
import java.util.ArrayList;
import java.util.Random;

public class Artista {
	private int registro;
	private String nome;
	private String nacionalidade;
	private ArrayList <Obra> listaDeObras = new ArrayList <Obra>();
	private Random rand = new Random();
	private static  int cont =0;
	
	
	public Artista (String nome, String nacionalidade, int registro) {
		cont++;
		this.nome=nome;
		this.nacionalidade=nacionalidade;
		this.registro=rand.nextInt();
	}
	public Artista() {
		// TODO Auto-generated constructor stub
	}
	/*public boolean addObras(Obra x) {
		boolean obra = false;
		for (int i=0;i<listaDeObras.length;i++) {
			if (listaDeObras[i]==null) {
				listaDeObras[i]=x;
				obra=true;
				System.out.println("Obra adicionada!");
				break;
			}
		}
		return obra;
		
	}
	*/
	public void imprimirDados() {
		System.out.println("Nome: "+nome+", Registro: "+cont+", Nacionalidade: "+nacionalidade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro=registro;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade=nacionalidade;
	}
	
	public ArrayList<Obra> getListaDeObras(){
		return listaDeObras;
	}
	public void setListaDeObras (ArrayList <Obra> listaDeObras) {
		this.listaDeObras = listaDeObras;
	}
	
	public void addObras (Obra x) {
		this.listaDeObras.add(x);
	}
	public void imprimir() {
		// TODO Auto-generated method stub
		
	}
	
	/*public Obra[] getListaDeObras(){
		return listaDeObras;
	}
	public void setListaDeObras(Obra[] listaDeObras) {
		this.listaDeObras=listaDeObras;
		
	}*/
	
	

}
