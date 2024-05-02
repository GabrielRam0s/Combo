package com.combo;

public class Combo {
	private Produto burguer;
	private Produto sobremesa;
	private Produto bebida;

	public void criarCombo(int tipo) {
		switch (tipo) {
		case 1:
			burguer = new Burguer("Burguer Master", 15.50, 250);
			sobremesa = new Sobremesa("Bolo de chocolate", 12.00, "Grande");
			bebida = new Bebida("Coca-Cola", 5.00, 500);
			break;
		case 2:
			burguer = new Burguer("Burguer Double", 14.00, 220);
			sobremesa = new Sobremesa("Torta de banana", 10.00, "Grande");
			bebida = new Bebida("Coca-Cola", 5.00, 500);
			break;
			default:
			break;
		}
	}

	@Override
	public String toString() {
		return "Combo inclui: " + burguer.getDescricao() + ", " + sobremesa.getDescricao() + ", "
				+ bebida.getDescricao();
	}
}