package org.maurooliveira.listatelefonica.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.maurooliveira.listatelefonica.model.Contato;
import org.maurooliveira.listatelefonica.model.response.DeleteResponse;
import org.maurooliveira.listatelefonica.services.ContatosService;

@Path("contatos")
public class ContatosResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contato> GetContatos() {
		return ContatosService.GetContatos();
	}
	
	@GET
	@Path("/{serial}")
	@Produces(MediaType.APPLICATION_JSON)	
	public Response GetContato(@PathParam("serial") int serial) {
		
		Contato contatoProcurado = ContatosService.GetContato(serial);
		
		Status status = (contatoProcurado != null) ? Status.OK : Status.NOT_FOUND;
		
		return Response
				.status(status)
				.entity(contatoProcurado)
				.build();
	}	
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Contato AddContato(Contato contato) {
		ContatosService.addContato(contato);
		return contato;
	}
	
	@DELETE
	@Path("/{serial}")
	@Produces(MediaType.APPLICATION_JSON)
	public DeleteResponse deleteContato(@PathParam("serial") int serial) {
		DeleteResponse deleteresponse = new DeleteResponse();
		
		deleteresponse.setDeleted(ContatosService.deleteContato(serial));
		
		return deleteresponse;
	}
}
