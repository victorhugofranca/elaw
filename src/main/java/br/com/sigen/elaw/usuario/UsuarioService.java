package br.com.sigen.elaw.usuario;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/usuarioservice")
public class UsuarioService {

	@GET
	@Path("/search")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Usuario> search() {
		List<Usuario> list = new ArrayList<Usuario>();

		Usuario usuario = new Usuario();
		usuario.setId(1);

		list.add(usuario);

		return list;
	}

}
