package com.combo;

public class Burguer implements Produto {
	private String descricao;
	private double preco;
	private int gramas;

	public Burguer(String desc, double preco, int gramas) {
		this.descricao = desc;
		this.preco = preco;
		this.gramas = gramas;
	}
	
	@Override
	public String getDescricao() {
		return descricao + " (" + gramas + "g)";
	}

	@Override
	public double getPreco() {
		return preco;
	}
}