package polimorfismo;

public class Portugues extends Pessoa {
	private boolean emprego;
	private int nfilhos;

	//CONSTRUTOR PORTUGUES
	public Portugues(String nome, int nasc, String morada, String profissao,boolean emprego, int nfilhos) {
		super(nome, nasc, morada, profissao);
			this.emprego = emprego;
			this.nfilhos = nfilhos;
			}

	//GET&SET EMPREGO
	public boolean isEmprego() {
		return emprego;
	}

	public void setEmprego(boolean emprego) {
		this.emprego = emprego;
	}
	
	
	//GET&SET NUM FILHOS
	public int getNfilhos() {
		return nfilhos;
	}

	public void setNfilhos(int nfilhos) {
		this.nfilhos = nfilhos;
	}
	
	
	//GET&SET DATA NASCIMENTO
	public int getNasc() {
		return nasc;
	}

	public void setNasc(int nasc) {
		this.nasc = nasc;
	}
	
	
	//GET&SET NOME
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//METODO MOSTRAR DADOS
	public void mostrarDados() {
		System.out.println("******************************");
		System.out.println("Nome: "+ nome);
		System.out.println("Ano de nascimento: "+ nasc);
		System.out.println("Morada: "+ morada);
		System.out.println("Profissão: "+ profissao);
		if(this.emprego == false)
		{
			System.out.println("Estado do emprego: Desempregado");
		}
		else {
			System.out.println("Estado do emprego: Empregado");
		}
		System.out.println("Número de filhos: "+ nfilhos);
		System.out.println("******************************");
	}

}
