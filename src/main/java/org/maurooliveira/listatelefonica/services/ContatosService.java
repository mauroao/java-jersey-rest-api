package org.maurooliveira.listatelefonica.services;

import java.util.List;

import org.maurooliveira.listatelefonica.database.DataBase;
import org.maurooliveira.listatelefonica.model.Contato;

public class ContatosService {
	public static List<Contato> GetContatos() {
		return DataBase.getContatos();
	}

}
