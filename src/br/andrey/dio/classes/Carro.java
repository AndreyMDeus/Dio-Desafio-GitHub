package br.andrey.dio.classes;

import java.util.Objects;

public class Carro {

	private String nome;
	private Integer ano;

	public Carro() {
	}

	public Carro(String nome, Integer ano) {
		super();
		this.nome = nome;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ano, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(ano, other.ano) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", ano=" + ano + "]";
	}

}
