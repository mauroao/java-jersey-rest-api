package org.maurooliveira.listatelefonica.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.maurooliveira.listatelefonica.model.Operadora;
import org.maurooliveira.listatelefonica.services.OperadorasService;

@Path("operadoras")
public class OperadorasResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Operadora> Get() {
		return OperadorasService.getOperadoras();
	}
}
