package br.com.sigen.elaw.cliente;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.sigen.elaw.entity.Municipio;
import br.com.sigen.elaw.entity.UF;

@Path("/clienteservice")
public class ClienteService {

	@GET
	@Path("/search")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Cliente> search() {
		List<Cliente> list = new ArrayList<Cliente>();

		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setCodigo("001");
		cliente.setNome("Banco do Brasil");

		Municipio municipio = new Municipio();
		municipio.setDescricao("Aracaju");
		cliente.setMunicipio(municipio);

		UF uf = new UF();
		uf.setDescricao("SE");
		cliente.setUf(uf);

		for (int i = 0; i < 20; i++) {
			list.add(cliente);
		}

		return list;
	}

	@POST
	@Path("/create")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Cliente create(Cliente cliente) {
		return cliente;
	}
}
