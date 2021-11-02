package polimorfismo;

import java.util.Calendar;

public class Pessoa {
	protected String nome;
	protected int nasc;
	protected String morada;
	protected String profissao;

	// GET&SET NOME
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	// GET&SET DATA NASCIMENTO
	public int getNasc() {
		return nasc;
	}

	public void setNasc(int nasc) {
		this.nasc = nasc;
	}

	
	// GET&SET MORADA
	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	
	// GET&SET PROFISSAO
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	//CONSTRUTOR
	public Pessoa(String nome, int nasc, String morada, String profissao) {
		this.nome = nome;
		this.nasc = nasc;
		this.morada = morada;
		this.profissao = profissao;
	}

	//METODO IDADE
	public void idade() {
		Calendar c = Calendar.getInstance();
		int ano = c.get(Calendar.YEAR) - this.nasc;

		System.out.println(ano + " anos");
	}

	//METODO MOSTRAR DADOS
	public void mostrarDados() {
		System.out.println("******************************");
		System.out.println("Nome: " + nome);
		System.out.println("Ano de nascimento: " + nasc);
		System.out.println("Morada: " + morada);
		System.out.println("Profissão: " + profissao);
		System.out.println("******************************");
	}

}
