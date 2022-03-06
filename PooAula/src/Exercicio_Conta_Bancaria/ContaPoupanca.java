package Exercicio_Conta_Bancaria;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
	private int diaRendimento;
	
	public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento=diaRendimento;
		
	}

	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
			Calendar hoje = Calendar.getInstance();
			if (diaRendimento==hoje.get(Calendar.DAY_OF_MONTH)){
				//saldo+=saldo*taxaRendimento;
				this.setSaldo(this.getSaldo() + this.getSaldo()*taxaRendimento);
				return true;
			}
			return false;	
	}

	@Override
	public String toString() {
		return "ContaPoupanca [diaRendimento=" + diaRendimento + "]";
	}
	
	

}
