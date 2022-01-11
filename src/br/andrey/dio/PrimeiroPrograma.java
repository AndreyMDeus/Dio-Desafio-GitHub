package br.andrey.dio;

import br.andrey.dio.classes.Carro;
import br.andrey.dio.classes.Motorista;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		Integer a = 5;
		Integer b = 7;
		System.out.println("Primeiro programa java na DIO!!! " + (a + b));

		Carro carro = new Carro();
		Motorista motorista = new Motorista();
		Montadora montadora = new Montadora();

		carro.setNome("Picasso");
		carro.setAno(2002);

		motorista.setNome("Fulano de Tal");
		motorista.setIdade(57);
		motorista.setCarteira(true);

		montadora.setNome("Citroen");
		montadora.setPais("França");

		System.out.println(carro);
		System.out.println(montadora);
		System.out.println(motorista);

	}

}

class Montadora {

	/* Aqui é um exemplo de classe declarada dentro de outra classe */

	private String nome;
	private String pais;

	public Montadora() {

	}

	public Montadora(String nome, String pais) {
		super();
		this.nome = nome;
		this.pais = pais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Montadora [nome=" + nome + ", pais=" + pais + "]";
	}

}
