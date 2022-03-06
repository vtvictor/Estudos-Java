package Exercicio_Conta_Bancaria;

public class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public ContaBancaria (String nomeCliente, String numConta, double saldo) {
		this.nomeCliente=nomeCliente;
		this.numConta=numConta;
		this.saldo=saldo;
	}

	public ContaBancaria() {
		// TODO Auto-generated constructor stub
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

	public void depositar (double valorDeposito) {
		saldo+=valorDeposito;
	}
	
	public boolean sacar (double valorSaque) {
		if ((saldo-valorSaque)<=0) {
			saldo-=valorSaque;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}

	
	
	
}
