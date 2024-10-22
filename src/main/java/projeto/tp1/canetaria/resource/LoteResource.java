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
import projeto.tp1.canetaria.dto.LoteRequestDTO;
import projeto.tp1.canetaria.dto.LoteResponseDTO;
import projeto.tp1.canetaria.service.LoteService;

@Path("/Lote")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LoteResource {

    @Inject
    public LoteService loteService;

    @GET
   @Path("/{id}")
   public Response findById(@PathParam("id") Long id) {
      return Response.ok(LoteResponseDTO.valueOf(loteService.findById(id))).build();
   }

  @GET
  @Path("/search/{codigo}")
  public Response findByCodigo(@PathParam("codigo") String codigo) {
   return Response.ok(loteService.findByCodigo(codigo).stream().map(o -> LoteResponseDTO.valueOf(o)).toList()).build();
   }

  @GET
  public Response findAll() {
   return Response.ok(loteService.findAll().stream().map(o -> LoteResponseDTO.valueOf(o)).toList()).build();
  }

  @POST
   public Response create(@Valid LoteRequestDTO dto) {
      return Response.status(Status.CREATED).entity(LoteResponseDTO.valueOf(loteService.create(dto))).build();
    
    }

   @PUT
   @Path("/{id}")
   public Response update(@PathParam("id") Long id, @Valid LoteRequestDTO dto) {
      loteService.update(id, dto);
      return Response.noContent().build();
    }

   @DELETE
   @Path("/{id}")
   public Response delete(@PathParam("id") Long id) {
      loteService.delete(id);
      return Response.noContent().build();
        }

    
}
