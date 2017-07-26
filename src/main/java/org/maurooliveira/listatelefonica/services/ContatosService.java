package org.maurooliveira.listatelefonica.services;

import java.util.List;

import org.maurooliveira.listatelefonica.database.DataBase;
import org.maurooliveira.listatelefonica.model.Contato;

public class ContatosService {
	public static List<Contato> GetContatos() {
		return DataBase.getContatos();
	}
	 
	public static Contato GetContato(int serial) {
		return DataBase.getContatos()
				.stream()
				.filter(item -> item.getserial() == serial)
				.findAny()
				.orElse(null);
	}
	
	public static void addContato(Contato contato) {
		DataBase.getContatos().add(contato);
	}
	
	public static boolean deleteContato(int serial) {
		List<Contato> contatos = DataBase.getContatos();
		
		Contato contatoProcurado = contatos
				.stream()
				.filter(item -> item.getserial() == serial)
				.findAny()
				.orElse(null);
		
		if (contatoProcurado == null) {
			return false;
		}
		
		return contatos.remove(contatoProcurado);
	}

}
