package Exemplo_Loja;

import java.util.ArrayList;

public class Distribuidora {
	private String nomeEstabelecimento;
	private int numLoja;
	private ArrayList <Produto> listaDeProdutos = new ArrayList <Produto>();
	private ArrayList <ProdutoPerecivel> listaDeProdutosPerecivel= new ArrayList <ProdutoPerecivel>();
	
	public Distribuidora (String nomeEstabelecimento, int numLoja) {
		this.nomeEstabelecimento=nomeEstabelecimento;
		this.numLoja=numLoja;
	}
	
	
	public ArrayList<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}

	public ArrayList<ProdutoPerecivel> getListaDeProdutosPerecivel() {
		return listaDeProdutosPerecivel;
	}

	
	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}


	public int getNumLoja() {
		return numLoja;
	}


	public Produto buscarProduto (String nome) {
		for (Produto elemento:listaDeProdutos) {
			if (elemento.getNomeProduto().equalsIgnoreCase(nome)) {
				System.out.println("O produto"+ elemento.getNomeProduto()+" j� est� cadastrado.");
				return elemento;
			}
		}
		return null;
	}

	public Produto buscarProduto (int codigoProduto, String marcaProduto) {
		for(Produto elemento:listaDeProdutos) {
			if (elemento.getCodigoproduto() == codigoProduto) {
				System.out.println("O produto "+elemento.getCodigoproduto()+" j� est� cadastrado.");
				return elemento;
			}else {
				if(elemento.getMarcaProduto().equalsIgnoreCase(marcaProduto)) {
					return elemento;
				}
			}	
			}
		return null;
		}		
	
	
	public void cadastrarProduto (Produto x) {
		Produto pdto = new Produto();
		pdto=buscarProduto(x.getNomeProduto());
		
		if (pdto!=null) {
			System.out.println("O produto j� est� cadastrado.");
		}else {
			listaDeProdutos.add(x);
			System.out.println("O produto est� cadastrado.");
		}
	}
		
	public void cadastrarProduto (ProdutoPerecivel x) {
		Produto pdto = new Produto();
		pdto=buscarProduto(x.getNomeProduto());
			
		if (pdto!=null) {
			System.out.println("O produto j� est� cadastrado.");
		}else {
			listaDeProdutos.add(x);
			System.out.println("O produto est� cadastrado.");
		}		
	}
}
