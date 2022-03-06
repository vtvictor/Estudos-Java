package Gerenciamento_Museu;
/*
c�digo (int), ano de aquisi��o da obra(int), t�tulo (String), t�cnica
utilizada(String), autor (Artista).
 */
public class Obra {
	private int codigo;
	private int anoAquisicaoObra;
	private String titulo;
	private String tecnica;
	private Artista autor;
	
	public Obra(int codigo, int anoAquisicaoObra, String titulo, String tecnica, Artista autor) {
		this.codigo=codigo;
		this.anoAquisicaoObra=anoAquisicaoObra;
		this.titulo=titulo;
		this.tecnica=tecnica;
		this.autor=autor;
	}
	
	public Obra() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}
	
	public int getAnoAquisicaoObra() {
		return anoAquisicaoObra;
	}
	public void setAnoAquisicaoObra(int anoAquisicaoObra) {
		this.anoAquisicaoObra=anoAquisicaoObra;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public String getTecnica() {
		return tecnica;
	}
	public void setTecnica(String tecnica) {
		this.tecnica=tecnica;
	}
	
	public Artista getAutor() {
		return autor;
	}
	public void setAutor(Artista autor) {
		this.autor=autor;
	}
	
	public void imprimirDados() {
		System.out.println("Informa��es da obra:");
		System.out.println("C�digo: "+codigo);
		System.out.println("Ano de aquisi��o: "+anoAquisicaoObra);
		System.out.println("Titulo: "+titulo);
		System.out.println("Tecnica utilizada: "+tecnica);
	}
}
