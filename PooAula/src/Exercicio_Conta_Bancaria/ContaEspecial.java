package Exercicio_Conta_Bancaria;

public class ContaEspecial extends ContaBancaria {
	private double limite;

	public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite=limite;
	}

}
