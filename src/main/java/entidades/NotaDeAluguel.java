package entidades;

import java.util.Date;

public class NotaDeAluguel {

	private int precoAluguel;
	private Date dataEntrega;

	public int getPrecoAluguel() {
		return precoAluguel;
	}

	public void setPrecoAluguel(int precoAluguel) {
		this.precoAluguel = precoAluguel;
	}

	public Date getDataEntrega() {
		
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
}
