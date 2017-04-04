package quest4;

import java.util.ArrayList;

public class Pessoa {
	long codigoPessoa;
	String nome;
	ArrayList<Carro> carros;
	
	public Pessoa(long codigoPessoa, String nome, ArrayList<Carro> carros) {
		super();
		this.codigoPessoa = codigoPessoa;
		this.nome = nome;
		this.carros = carros;
	}
	
	public long getCodigoPessoa() {
		return codigoPessoa;
	}
	public void setCodigoPessoa(long codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Carro> getCarros() {
		return carros;
	}
	public void setCarros(ArrayList<Carro> carros) {
		this.carros = carros;
	}
}
