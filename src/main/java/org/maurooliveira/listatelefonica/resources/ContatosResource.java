package org.maurooliveira.listatelefonica.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.maurooliveira.listatelefonica.model.Contato;
import org.maurooliveira.listatelefonica.services.ContatosService;

@Path("contatos")
public class ContatosResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contato> Get() {
		return ContatosService.GetContatos();
	}
}
