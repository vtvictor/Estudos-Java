package Clinica_Refazendo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Estabelecimento {
	private String nomeEstabelecimento;
	private String endereco;
	private ArrayList <Nutricionista> listaNutri = new ArrayList <Nutricionista>();
	private ArrayList <Consulta> listaConsultas = new ArrayList <Consulta>();
	int cont=1;
	
	public Estabelecimento (String nomeEstabelecimennto, String endereco) {
		this.nomeEstabelecimento=nomeEstabelecimento;
		this.endereco=endereco;
	}

	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}

	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Nutricionista> getListaNutri() {
		return listaNutri;
	}

	public void setListaNutri(ArrayList<Nutricionista> listaNutri) {
		this.listaNutri = listaNutri;
	}

	public ArrayList<Consulta> getListaConsultas() {
		return listaConsultas;
	}

	public void setListaConsultas(ArrayList<Consulta> listaConsultas) {
		this.listaConsultas = listaConsultas;
	}
	
	
	
	public Nutricionista buscarNutri (int pCRN) {
		for (Nutricionista elemento:listaNutri) {
			if(elemento!=null)
				if(elemento.getCrn()==pCRN){
					return elemento;
				}
		}
		return null;
	}
	
	public void contratarNutri (Nutricionista pNutri) {
		Nutricionista n = buscarNutri(pNutri.getCrn());
		if (n!=null) {
			System.out.println("Nutricionista já cadastrado!");
		}else {
			listaNutri.add(pNutri);
		}		
	}
	
	public int marcarConsulta(Nutricionista nutri) {
		int codigoConsulta=Calendar.getInstance().get(Calendar.YEAR)+cont;
		cont++;
		for(Consulta elemento:listaConsultas) {
			if(elemento!=null) {
				Consulta c = new Consulta();
				listaConsultas.add(c);
				break;
			}
		}
		return codigoConsulta;
	}
	
	public double pagarConsulta(int pCodConsulta) {
		Scanner dados = new Scanner (System.in);
		for (Consulta elemento: this.listaConsultas) {
			if (listaConsultas!=null){
				if (elemento.getCodConsulta()==pCodConsulta) {
					System.out.println("Informe o tempo da consulta: ");
					return elemento.getNutriResponsavel().calcularValorConsulta(dados.nextInt());
				}				
			}
		}	
		System.out.println("A consulta não foi encontrada");
		return 0;
	}
	
	
	
}
