package PadraoPrototype;

public class Sistema {

	public static void main(String[] args) {
		MedicoPrototype med = new MedicoPrototype();
		
		MedicoPapeisPrototype medicoNovo = med.clonar();
		medicoNovo.setNome("Victor");
		
		MedicoPapeisPrototype medicoUsado = med.clonar();
		medicoUsado.setNome("Luiz");
		
		System.out.println(medicoNovo.toString());
		System.out.println(medicoUsado.toString());
	}

}
