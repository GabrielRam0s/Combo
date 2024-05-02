package com.combo;

public class Bebida implements Produto {
	private String descricao;
	private double preco;
	private int ml;

	public Bebida(String desc, double preco, int ml) {
		this.descricao = desc;
		this.preco = preco;
		this.ml = ml;
	}

	@Override
	public String getDescricao() {
		return descricao + " - " + ml + "ml";
	}

	@Override
	public double getPreco() {
		return preco;
	}
}