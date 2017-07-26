package org.maurooliveira.listatelefonica.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.maurooliveira.listatelefonica.model.Operadora;
import org.maurooliveira.listatelefonica.services.OperadorasService;

@Path("operadoras")
public class OperadorasResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Operadora> GetOperadoras() {
		return OperadorasService.getOperadoras();
	}

	@GET
	@Path("/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)	
	public Operadora GetOperadora(@PathParam("codigo") int codigo) {
		return OperadorasService.getOperadora(codigo);
	}
	
}
