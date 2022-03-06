package PadraoSingleton;

public class Sistema {

	public static void main(String[] args) {
		
		Medico med = Medico.getInstance();
		med.setNome("Victor");
		med.setCRM(18031997);
		med.emitExame("Hemograma");
		System.out.println(med.toString());
		
		Medico med1 = Medico.getInstance();
		System.out.println("Medico: "+ med1.criar());
		

}
}
