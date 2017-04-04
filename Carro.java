package quest4;

public class Carro {
	long codigoCarro;
	String nome;
	String estilo;
	int ano;
	
	public Carro(long codigoCarro, String nome, String estilo, int ano) {
		super();
		this.codigoCarro = codigoCarro;
		this.nome = nome;
		this.estilo = estilo;
		this.ano = ano;
	}
	public long getCodigoCarro() {
		return codigoCarro;
	}
	public void setCodigoCarro(long codigoCarro) {
		this.codigoCarro = codigoCarro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
