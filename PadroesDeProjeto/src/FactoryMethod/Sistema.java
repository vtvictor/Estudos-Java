package FactoryMethod;

public class Sistema {

	public static void main(String[] args) {
		
		Medico med = new Medico();
		med.setNome("Victor");
		med.setCRM(18031997);
		med.emitExame("Hemograma");
		System.out.println(med.toString());
		
		//Aplicando Factory:
		MedicoFactory medicoFactory = new MedicoFactory();
		DocenteFactory docenteFactory = new DocenteFactory();
		ResidenteFactory residenteFactory = new ResidenteFactory();
		//
		
		System.out.println(" ");
		
		Docentes doc = new Docentes();
		doc.setNome("Fernanda");
		doc.setTitulacao("Doutora");
		doc.setCRM(16012003);
		doc.emitPedido("Exame de sangue");
		doc.revisarLaudo();
		System.out.println(doc.toString());
		
		System.out.println(" ");
		
		Residentes res = new Residentes();
		res.setNome("Luiz");
		res.setTitulacao("Estudante do quinto periodo");
		res.setCRM(18032021);
		res.emitLaudo();
		res.emitExame("Hemograma");
		System.out.println(res.toString());
		
		System.out.println(" ");
		
		PedidoExame exame = new PedidoExame();
		
		exame.setDiagnostico("Diagnostico por imagem");
		exame.setTipoExame("Raio X");
		exame.setDataExame("10/10/2021");
		System.out.println(exame.toString());
		
		System.out.println(" ");
		
		Paciente pa = new Paciente();
		
		pa.setNome("Carlos");
		pa.setCor("Moreno");
		pa.setSexo("Masculino");
		pa.idadeCalculo(1997);
		System.out.println(pa.toString());
	}

}
