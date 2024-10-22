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
import projeto.tp1.canetaria.dto.CanetaRequestDTO;
import projeto.tp1.canetaria.dto.CanetaResponseDTO;
import projeto.tp1.canetaria.service.CanetaService;

@Path("/Caneta")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CanetaResource {
    
    @Inject
    public CanetaService canetaService;

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") Long id) {
       return Response.ok(CanetaResponseDTO.valueOf(canetaService.findById(id))).build();
   }

    @GET
    @Path("/search/{nome}")
    public Response findByNome(@PathParam("nome") String nome) {
    return Response.ok(canetaService.findByNome(nome).stream().map(o -> CanetaResponseDTO.valueOf(o)).toList()).build();
    }

    @GET
    public Response findAll() {
    return Response.ok(canetaService.findAll().stream().map(o -> CanetaResponseDTO.valueOf(o)).toList()).build();
    }

  @POST
   public Response create(@Valid CanetaRequestDTO dto) {
      return Response.status(Status.CREATED).entity(CanetaResponseDTO.valueOf(canetaService.create(dto))).build();
    
    }

   @PUT
   @Path("/{id}")
   public Response update(@PathParam("id") Long id, @Valid CanetaRequestDTO dto) {
      canetaService.update(id, dto);
      return Response.noContent().build();
    }

   @DELETE
   @Path("/{id}")
   public Response delete(@PathParam("id") Long id) {
      canetaService.delete(id);
      return Response.noContent().build();
        }

}
