package Exemplo_Loja;
import java.util.Random;
/*
um código para o produto, o nome do produto, marca do produto, a quantidade armazenada (em
estoque) e o preço unitário. */

public class Produto {
	private Random codigoProduto = new Random();
	private String nomeProduto;
	private String marcaProduto;
	private int qtdArmazenada;
	private double precoUnitario;
	
	public Produto () {	
	}
	
	public Produto (String nomeProduto, String marcaProduto, int qtdArmazenada, double precoUnitario) {
		this.nomeProduto=nomeProduto;
		this.marcaProduto=marcaProduto;
		this.qtdArmazenada=qtdArmazenada;
		this.precoUnitario=precoUnitario;	
	}

	public int getCodigoproduto() {
		return codigoProduto.nextInt();
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public int getQtdArmazenada() {
		return qtdArmazenada;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}
	
	public int retirarDoEstoque (int quantidade) {
		if (qtdArmazenada>quantidade) {
			qtdArmazenada=quantidade - qtdArmazenada;
		}else {
			System.out.println("Quantidade retirada: "+qtdArmazenada+" produtos. No qual,"
					+ " a quantidade solicitada é maior que a do estoque.");
		}
		return qtdArmazenada;	
	}
	
	public void colocarEmEstoque (int quantidade) {
		qtdArmazenada=qtdArmazenada + quantidade;
		System.out.println("Estoque atual: "+qtdArmazenada);
	}

	@Override
	public String toString() {
		return "Produto [gerador=" + codigoProduto.nextInt(500) + ", "
				+ "\nNome do Produto=" + nomeProduto + "; "
				+ "\nMarca do Produto=" + marcaProduto
				+ ",\nQtd Armazenada=" + qtdArmazenada + ", "
				+ "\nPreco Unitario=" + precoUnitario + ".]";
	}
}
