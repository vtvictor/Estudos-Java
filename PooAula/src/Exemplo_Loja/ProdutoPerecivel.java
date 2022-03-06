package Exemplo_Loja;

public class ProdutoPerecivel extends Produto {
	private int validade;
	
	
	public ProdutoPerecivel() {
		
	}
	
	
	public ProdutoPerecivel(String nomeProduto, String marcaProduto, int qtdArmazenada, double precoUnitario, int validade) {
		super(nomeProduto, marcaProduto, qtdArmazenada, precoUnitario);
		this.validade=validade;
	}

	public int getValidade() {
		return validade;
	}
	
	
	
	public int retirarDoEstoque (int quantidade, int dataDc) {
		if (dataDc>=quantidade) {
			super.retirarDoEstoque(super.getQtdArmazenada());
		} else {
			super.retirarDoEstoque(quantidade);
			
		}
		return super.getQtdArmazenada();
		
	}
	
	public void colocarEmEstoque (int quantidade) {
		if (super.getQtdArmazenada()==0) {
			System.out.println("O estoque está zerado."); //caso esteja zerado será possível adicionar.
			super.colocarEmEstoque(quantidade);
		}else {
			System.out.println("O estoque não está zerado.");
		}
	}

	@Override
	public String toString() {
		return "Produto_Perecível [validade=" + validade + "]";
	}
	
	
}
