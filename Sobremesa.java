package com.combo;

public class Sobremesa implements Produto {
	private String descricao;
	private double preco;
	private String tamanho;

	public Sobremesa(String desc, double preco, String tamanho) {
		this.descricao = desc;
		this.preco = preco;
		this.tamanho = tamanho;
	}

	@Override
	public String getDescricao() {
		return descricao + " - " + tamanho;
	}

	@Override
	public double getPreco() {
		return preco;
	}
}