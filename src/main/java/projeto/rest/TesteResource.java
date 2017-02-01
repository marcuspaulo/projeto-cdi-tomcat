package projeto.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/testando")
public class TesteResource {
	
//	@Inject
//	TesteBean testeBean;

	@GET
	@Path("/oi")
//	@Produces(MediaType.APPLICATION_JSON)
	public Response oi() {
		System.out.println(" ================================== ");
//		testeBean.setMensagem("oi mundo");
//		return Response.ok(testeBean).build();
		return Response.ok().build();
	}

}
