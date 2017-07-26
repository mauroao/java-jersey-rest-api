package org.maurooliveira.listatelefonica.services;

import java.util.List;

import org.maurooliveira.listatelefonica.database.DataBase;
import org.maurooliveira.listatelefonica.model.Operadora;

public class OperadorasService {
	public static List<Operadora> getOperadoras() {
		return DataBase.getOperadoras();
	}
	
	public static Operadora getOperadora(int codigo) {
		return DataBase.getOperadoras()
				.stream()
				.filter(item -> item.getcodigo() == codigo)
				.findAny().orElse(null);
	}
}
