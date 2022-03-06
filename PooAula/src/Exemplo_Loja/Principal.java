package Exemplo_Loja;
import java.util.Scanner;

import Gerenciamento_Museu.Artista;
import Gerenciamento_Museu.Obra;

public class Principal {

	public static void main(String[] args) {
		String nome, marca, lojas, auxProduto;
		int qtd,validade, auxNum, codigo, auxNum2;
		double valorUnit;
		
		Scanner dados = new Scanner(System.in);
		Distribuidora dist1 = new Distribuidora ("Loja DF - Lagarto", 19);
		Distribuidora dist2 = new Distribuidora ("Loja DF - Aracaju", 200);

		
		int opc=0;
		do {
			System.out.print("Digite qual loja quer fazer o acesso: ");
			System.out.println("lagarto ou aracaju.");
			lojas=dados.next();
			System.out.println("Menu: ");
			System.out.println("1. Cadastrar um produto;");
			System.out.println("2. Atualizar estoque de um produto;");
			System.out.println("3. Relatórios;");
			System.out.println("4. Sair do Sistema.");
			opc=dados.nextInt();
			switch (opc) {
			case 1:
				switch(lojas) {
					case "lagarto":
					System.out.println("Digite o nome do produto: ");
					nome=dados.next();
					System.out.println("Digite a marca do produto: ");
					marca=dados.next();
					System.out.println("A quantidade a ser armazenada do produto:");
					qtd=dados.nextInt();
					System.out.println("Digite o valor unitário do produto:");
					valorUnit=dados.nextDouble();
					
					System.out.println("O produto é Perecível?(sim ou nao)");
					auxProduto=dados.next();
					if(auxProduto.equalsIgnoreCase("nao")) {
						Produto lojaLagarto = new Produto (nome, marca, qtd, valorUnit);
						dist1.cadastrarProduto(lojaLagarto);	
					}else {
						System.out.println("Qual a validade do produto: ");
						validade=dados.nextInt();
						Produto lojaLagarto = new ProdutoPerecivel(nome, marca, qtd, valorUnit, validade);
						dist1.cadastrarProduto(lojaLagarto);
					}
					break;
					case "aracaju":
						System.out.println("Digite o nome do produto: ");
						nome=dados.next();
						System.out.println("Digite a marca do produto: ");
						marca=dados.next();
						System.out.println("A quantidade a ser armazenada do produto:");
						qtd=dados.nextInt();
						System.out.println("Digite o valor unitário do produto:");
						valorUnit=dados.nextDouble();
						
						System.out.println("O produto é Perecível?(sim ou nao)");
						auxProduto=dados.next();
						if(auxProduto.equalsIgnoreCase("nao")) {
							Produto lojaAracaju = new Produto (nome, marca, qtd, valorUnit);
							dist2.cadastrarProduto(lojaAracaju);	
						}else {
							System.out.println("Qual a validade do produto: ");
							validade=dados.nextInt();
							Produto lojaAracaju = new ProdutoPerecivel(nome, marca, qtd, valorUnit, validade);
							dist2.cadastrarProduto(lojaAracaju);
					
				}
						break;
				}
				break;
			case 2:
				switch(lojas) {
					case "lagarto":
						System.out.println("Digite como quer atualizar o estoque do produto: ");
						System.out.println("1. Por Nome;");
						System.out.println("2. Por Codigo");
						auxNum=dados.nextInt();
						if (auxNum==1) {
							System.out.println("Digite o nome do produto: ");
							nome=dados.next();
							System.out.println("Digite 1 para adicionar ao estoque;");
							System.out.println("Digite 2 para remover do estoque.");
							auxNum=dados.nextInt();
							if(auxNum==1) {
								dist1.buscarProduto(nome);
								for(Produto elemento:dist1.getListaDeProdutos()) {
									if(elemento.getNomeProduto().equalsIgnoreCase(nome)) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.colocarEmEstoque(qtd);
										break;
									}
								}
								for(ProdutoPerecivel elemento:dist1.getListaDeProdutosPerecivel()) {
									if(elemento.getNomeProduto().equalsIgnoreCase(nome)) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.colocarEmEstoque(qtd);
										break;
									}
								}
							
							}else {
								dist1.buscarProduto(nome);
								for (Produto elemento:dist1.getListaDeProdutos()) {
									if(elemento.getNomeProduto().equalsIgnoreCase(nome)) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.retirarDoEstoque(qtd);
										break;
									}
								}
								for (Produto elemento:dist1.getListaDeProdutos()) {
									if(elemento.getNomeProduto().equalsIgnoreCase(nome)) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.retirarDoEstoque(qtd);
										break;
									}
								}
								
							}
						}else {
							System.out.println("Digite o codigo do produto: ");
							codigo=dados.nextInt();
							System.out.println("Digite 1 para adicionar ao estoque;");
							System.out.println("Digite 2 para remover do estoque.");
							auxNum=dados.nextInt();
							if(auxNum==1) {
								dist1.buscarProduto(codigo, " ");
								for(Produto elemento:dist1.getListaDeProdutos()) {
									if(elemento.getCodigoproduto()==codigo) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.colocarEmEstoque(qtd);
										break;
									}
								}
								for(ProdutoPerecivel elemento:dist1.getListaDeProdutosPerecivel()) {
									if(elemento.getCodigoproduto()==codigo) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.colocarEmEstoque(qtd);
										break;
									}
								}
							
							}else {
								dist1.buscarProduto(codigo, "");
								for (Produto elemento:dist1.getListaDeProdutos()) {
									if(elemento.getCodigoproduto()==codigo) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.retirarDoEstoque(qtd);
										break;
									}
								}
								for (Produto elemento:dist1.getListaDeProdutos()) {
									if(elemento.getCodigoproduto()==codigo) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.retirarDoEstoque(qtd);
										break;
									}
								}
								
							}
							
							
						}
					break;
					case "aracaju":
						System.out.println("Digite como quer atualizar o estoque do produto: ");
						System.out.println("1. Por Nome;");
						System.out.println("2. Por Codigo");
						auxNum=dados.nextInt();
						if (auxNum==1) {
							System.out.println("Digite o nome do produto: ");
							nome=dados.next();
							System.out.println("Digite 1 para adicionar ao estoque;"
									+ "Digite 2 para remover do estoque.");
							auxNum=dados.nextInt();
							if(auxNum==1) {
								dist1.buscarProduto(nome);
								for(Produto elemento:dist2.getListaDeProdutos()) {
									if(elemento.getNomeProduto().equalsIgnoreCase(nome)) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.colocarEmEstoque(qtd);
										break;
									}
								}
								for(ProdutoPerecivel elemento:dist2.getListaDeProdutosPerecivel()) {
									if(elemento.getNomeProduto().equalsIgnoreCase(nome)) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.colocarEmEstoque(qtd);
										break;
									}
								}
							
							}else {
								dist1.buscarProduto(nome);
								for (Produto elemento:dist2.getListaDeProdutos()) {
									if(elemento.getNomeProduto().equalsIgnoreCase(nome)) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.retirarDoEstoque(qtd);
										break;
									}
								}
								for (Produto elemento:dist2.getListaDeProdutos()) {
									if(elemento.getNomeProduto().equalsIgnoreCase(nome)) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.retirarDoEstoque(qtd);
										break;
									}
								}
								
							}
						}else {
							System.out.println("Digite o codigo do produto: ");
							codigo=dados.nextInt();
							System.out.println("Digite 1 para adicionar ao estoque;");
							System.out.println("Digite 2 para remover do estoque.");
							auxNum=dados.nextInt();
							if(auxNum==1) {
								dist1.buscarProduto(codigo, " ");
								for(Produto elemento:dist2.getListaDeProdutos()) {
									if(elemento.getCodigoproduto()==codigo) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.colocarEmEstoque(qtd);
										break;
									}
								}
								for(ProdutoPerecivel elemento:dist2.getListaDeProdutosPerecivel()) {
									if(elemento.getCodigoproduto()==codigo) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.colocarEmEstoque(qtd);
										break;
									}
								}
							
							}else {
								dist1.buscarProduto(codigo, "");
								for (Produto elemento:dist2.getListaDeProdutos()) {
									if(elemento.getCodigoproduto()==codigo) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.retirarDoEstoque(qtd);
										break;
									}
								}
								for (Produto elemento:dist2.getListaDeProdutos()) {
									if(elemento.getCodigoproduto()==codigo) {
										System.out.println("Digite a quantidade para adicionar: ");
										qtd=dados.nextInt();
										elemento.retirarDoEstoque(qtd);
										break;
									}
								}
								
							}														
						}											
					break;
				}
								
				break;
			case 3:
				switch(lojas) {
					case "lagarto":
						System.out.println("Relatorio da loja de Lagarto: ");
						System.out.println("1. Por completo;");
						System.out.println("2. Por tipo de produto;");
						System.out.println("3. Por produto(Buscar por nome, código ou marca do produto)");
						auxNum2 = dados.nextInt();
						switch (auxNum2) {
							case 1:
								for (Produto elemento:dist1.getListaDeProdutos()) {
									System.out.println(elemento.toString());
								}
								for (ProdutoPerecivel elemento:dist1.getListaDeProdutosPerecivel()) {
									System.out.println(elemento.toString());
								}
								break;
								
							case 2:
								System.out.println("Digite qual o tipo de produto:");
								System.out.println("1. Normal;");
								System.out.println("2. Perecivel.");
								auxNum=dados.nextInt();
								if(auxNum==1) {
									for(Produto elemento:dist1.getListaDeProdutos()) {
										System.out.println(elemento.toString());
									}
								}else {
									for (ProdutoPerecivel elemento:dist1.getListaDeProdutosPerecivel()) {
										System.out.println(elemento.toString());
									}
								}
								break;
							case 3:
								System.out.println("Digite uma das opções: ");
								System.out.println("1. Por nome;");
								System.out.println("2. Por código;");
								System.out.println("3. por marca.");
								auxNum=dados.nextInt();
								if (auxNum==1) {
									System.out.println("Digite o nome do produto: ");
									nome=dados.next();
									for(Produto elemento:dist1.getListaDeProdutos()) {
										if(elemento.getNomeProduto().equalsIgnoreCase(nome)) {
											System.out.println(elemento.toString());
											break;
										}
									}
									for (ProdutoPerecivel elemento:dist1.getListaDeProdutosPerecivel()) {
										if (elemento.getNomeProduto().equalsIgnoreCase(nome)) {
											System.out.println(elemento.toString());
										}
									}
								}else {
									if(auxNum==2) {
										System.out.println("Digite o código do produto: ");
										codigo=dados.nextInt();
										for(Produto elemento:dist1.getListaDeProdutos()) {
											if(elemento.getCodigoproduto()==codigo) {
												System.out.println(elemento.toString());
												break;
											}
										}
										for (Produto elemento:dist1.getListaDeProdutosPerecivel()) {
											if (elemento.getCodigoproduto()==codigo) {
												System.out.println(elemento.toString());
												break;
										}								
									}

								}else {
									System.out.println("Digite a marca do produto: ");
									marca=dados.next();
									for(Produto elemento:dist1.getListaDeProdutos()) {
										if(elemento.getMarcaProduto().equalsIgnoreCase(marca)){
											System.out.println(elemento.toString());
											break;
										}
									}
									for (Produto elemento:dist1.getListaDeProdutosPerecivel()) {
										if (elemento.getMarcaProduto().equalsIgnoreCase(marca)) {
											System.out.println(elemento.toString());
											break;
									}
									
								}
								}	
								}
								
						}		
					break;
					case "aracaju":
						System.out.println("Relatorio da loja de Lagarto: ");
						System.out.println("1. Por completo;");
						System.out.println("2. Por tipo de produto;");
						System.out.println("3. Por produto(Buscar por nome, código ou marca do produto).");
						auxNum2 = dados.nextInt();
						switch (auxNum2) {
							case 1:
								for (Produto elemento:dist2.getListaDeProdutos()) {
									System.out.println(elemento.toString());
								}
								for (ProdutoPerecivel elemento:dist2.getListaDeProdutosPerecivel()) {
									System.out.println(elemento.toString());
								}
								break;
								
							case 2:
								System.out.println("Digite qual o tipo de produto:");
								System.out.println("1. Normal;");
								System.out.println("2. Perecivel.");
								auxNum=dados.nextInt();
								if(auxNum==1) {
									for(Produto elemento:dist2.getListaDeProdutos()) {
										System.out.println(elemento.toString());
									}
								}else {
									for (ProdutoPerecivel elemento:dist2.getListaDeProdutosPerecivel()) {
										System.out.println(elemento.toString());
									}
								}
								break;
							case 3:
								System.out.println("Digite uma das opções: ");
								System.out.println("1. Por nome;");
								System.out.println("2. Por código;");
								System.out.println("3. por marca.");
								auxNum=dados.nextInt();
								if (auxNum==1) {
									System.out.println("Digite o nome do produto: ");
									nome=dados.next();
									for(Produto elemento:dist2.getListaDeProdutos()) {
										if(elemento.getNomeProduto().equalsIgnoreCase(nome)) {
											System.out.println(elemento.toString());
											break;
										}
									}
									for (ProdutoPerecivel elemento:dist2.getListaDeProdutosPerecivel()) {
										if (elemento.getNomeProduto().equalsIgnoreCase(nome)) {
											System.out.println(elemento.toString());
										}
									}
								}else {
									if(auxNum==2) {
										System.out.println("Digite o código do produto: ");
										codigo=dados.nextInt();
										for(Produto elemento:dist2.getListaDeProdutos()) {
											if(elemento.getCodigoproduto()==codigo) {
												System.out.println(elemento.toString());
												break;
											}
										}
										for (Produto elemento:dist2.getListaDeProdutosPerecivel()) {
											if (elemento.getCodigoproduto()==codigo) {
												System.out.println(elemento.toString());
												break;
										}								
									}

								}else {
									System.out.println("Digite a marca do produto: ");
									marca=dados.next();
									for(Produto elemento:dist2.getListaDeProdutos()) {
										if(elemento.getMarcaProduto().equalsIgnoreCase(marca)){
											System.out.println(elemento.toString());
											break;
										}
									}
									for (Produto elemento:dist2.getListaDeProdutosPerecivel()) {
										if (elemento.getMarcaProduto().equalsIgnoreCase(marca)) {
											System.out.println(elemento.toString());
											break;
									}
									
								}
								}	
								}		
						}	
					break;
				}
				break;
			case 4:
				System.out.println("Fim do programa.");
				
				break;
			}
		}while (opc!=4);		
	}
}
