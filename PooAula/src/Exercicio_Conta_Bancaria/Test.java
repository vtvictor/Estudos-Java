package Exercicio_Conta_Bancaria;

public class Test {

	public static void main(String[] args) {
		System.out.println("Conta simples");
		
		ContaPoupanca clientePoupanca = new ContaPoupanca ();
		
		clientePoupanca.setNomeCliente("Victor");
		clientePoupanca.setNumConta("1235");
		clientePoupanca.setDiaRendimento(4);
		clientePoupanca.depositar(100);
		clientePoupanca.sacar(450);
		clientePoupanca.sacar(100);
		
		if(clientePoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Novo rendimento aplicado, novo salvo é de = "+clientePoupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado.");
		}
		
		System.out.println(clientePoupanca);
	}

}
