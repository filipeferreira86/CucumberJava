package services;

import java.util.Calendar;

import entidades.Filme;
import entidades.NotaDeAluguel;

public class AluguelService {

	private Filme filme;
	
	public NotaDeAluguel alugar(Filme filme) {
		NotaDeAluguel nota = new NotaDeAluguel();
		nota.setPrecoAluguel(filme.getPreco());
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		nota.setDataEntrega(cal.getTime());
		filme.setEstoque(filme.getEstoque() - 1);
		return nota;
	}
	
}
