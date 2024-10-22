package projeto.tp1.canetaria.resource;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import projeto.tp1.canetaria.dto.UsuarioWebRequestDTO;
import projeto.tp1.canetaria.dto.UsuarioWebResponseDTO;
import projeto.tp1.canetaria.service.UsuarioWebService;

@Path("/UsuariosWeb")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioWebResource {

   @Inject
   public UsuarioWebService usuarioWebService;
   
   @GET
   @Path("/{id}")
   public Response findById(@PathParam("id") Long id) {
      return Response.ok(UsuarioWebResponseDTO.valueOf(usuarioWebService.findById(id))).build();
   }

  @GET
  @Path("/search/{login}")
  public Response findByLogin(@PathParam("login") String login) {
   return Response.ok(usuarioWebService.findByLogin(login).stream().map(o -> UsuarioWebResponseDTO.valueOf(o)).toList()).build();
   }

  @GET
  public Response findAll() {
   return Response.ok(usuarioWebService.findAll().stream().map(o -> UsuarioWebResponseDTO.valueOf(o)).toList()).build();
  }

  @POST
   public Response create(@Valid UsuarioWebRequestDTO dto) {
      return Response.status(Status.CREATED).entity(UsuarioWebResponseDTO.valueOf(usuarioWebService.create(dto))).build();
    
    }

   @PUT
   @Path("/{id}")
   public Response update(@PathParam("id") Long id, @Valid UsuarioWebRequestDTO dto) {
      usuarioWebService.update(id, dto);
      return Response.noContent().build();
    }

   @DELETE
   @Path("/{id}")
   public Response delete(@PathParam("id") Long id) {
      usuarioWebService.delete(id);
      return Response.noContent().build();
        }

}
