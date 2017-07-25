package org.maurooliveira.listatelefonica.database;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.maurooliveira.listatelefonica.model.Contato;
import org.maurooliveira.listatelefonica.model.Operadora;;


public class DataBase {
	
	private static List<Contato> contatos = null;
	private static List<Operadora> operadoras = null;
	
	public static List<Contato> getContatos() {
		if (contatos == null) {
			contatos = new ArrayList<Contato>();
			
			List<Operadora> listaOperadoras = DataBase.getOperadoras();
			
			contatos.add(new Contato(123456, "Pedro", "9999-8888", new Date(), listaOperadoras.get(0)));
			contatos.add(new Contato(234567, "Ana", "9999-8877", new Date(), listaOperadoras.get(1)));
			contatos.add(new Contato(891234, "Maria", "9999-8866", new Date(), listaOperadoras.get(2)));
			contatos.add(new Contato(923450, "Antonio Java", "9999-2888", new Date(), listaOperadoras.get(3)));
			contatos.add(new Contato(934560, "Anada Spring Framework", "9999-8872", new Date(), listaOperadoras.get(0)));
			contatos.add(new Contato(991230, "Rubens Pojo", "9999-8826", new Date(),listaOperadoras.get(0)));		
			
		}
		return contatos;
	}
	
	public static List<Operadora> getOperadoras() {
		if (operadoras == null) {
			
			operadoras = new ArrayList<Operadora>();	
			operadoras.add(new Operadora("Oi", 14, "Celular", 2.0));
			operadoras.add(new Operadora("Tim", 15, "Celular", 2.1));
			operadoras.add(new Operadora("Vivo", 41, "Celular", 2.2));
			operadoras.add(new Operadora("GVT", 25, "Fixo", 2.3));
			operadoras.add(new Operadora("Embratel", 21, "Fixo", 2.4));			
			
		}
		return operadoras;
	}
	
}
