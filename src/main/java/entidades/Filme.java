package entidades;

import services.AluguelService;

public class Filme {

	private int estoque;
	private int preco;

	public void setEstoque(int arg1) {
		this.estoque = arg1;
		
	}
	
	public void setPreco(int arg1) {
		this.preco = arg1;
	}

	public int getPreco() {
		return preco;
	}

	public int getEstoque() {
		return estoque;
	}
	
	
	
}
