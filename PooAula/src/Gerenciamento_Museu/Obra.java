package Gerenciamento_Museu;
/*
código (int), ano de aquisição da obra(int), título (String), técnica
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
		System.out.println("Informações da obra:");
		System.out.println("Código: "+codigo);
		System.out.println("Ano de aquisição: "+anoAquisicaoObra);
		System.out.println("Titulo: "+titulo);
		System.out.println("Tecnica utilizada: "+tecnica);
	}
}
