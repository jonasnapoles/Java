package polimorfismo;

public class teste {

	public static void main(String[] args) {
		Pessoa p0 = new Pessoa("Ana Gomes", 1966, "Avenida Y", "Médica");
		Portugues p1 = new Portugues("Paulo Silva", 1974, "Rua X", "Canalizador", false, 2);
		
		p0.setProfissao("Auxiliar");
		p0.idade();
		p0.mostrarDados();

		p1.setNasc(1980);
		p1.setNome("Paulo Costa");
		p1.mostrarDados();
		


	}

}
