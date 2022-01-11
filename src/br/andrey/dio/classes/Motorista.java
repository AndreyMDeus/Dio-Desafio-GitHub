package br.andrey.dio.classes;

import java.util.Objects;

public class Motorista {

	private String nome;
	private Integer idade;
	private Boolean carteira;

	public Motorista() {
	}

	public Motorista(String nome, Integer idade, Boolean carteira) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.carteira = carteira;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Boolean getCarteira() {
		return carteira;
	}

	public void setCarteira(Boolean carteira) {
		this.carteira = carteira;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carteira, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorista other = (Motorista) obj;
		return Objects.equals(carteira, other.carteira) && Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Motorista [nome=" + nome + ", idade=" + idade + ", carteira=" + carteira + "]";
	}

}
