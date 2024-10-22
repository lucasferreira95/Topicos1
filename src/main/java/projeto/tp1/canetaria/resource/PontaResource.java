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
import projeto.tp1.canetaria.dto.PontaRequestDTO;
import projeto.tp1.canetaria.dto.PontaResponseDTO;
import projeto.tp1.canetaria.service.PontaService;

@Path("/Ponta")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PontaResource {
    
    @Inject
    public PontaService pontaService;

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") Long id) {
       return Response.ok(PontaResponseDTO.valueOf(pontaService.findById(id))).build();
   }

    @GET
    @Path("/search/{espessura}")
    public Response findByEspessura(@PathParam("espessura") Float espessura) {
    return Response.ok(pontaService.findByEspessura(espessura).stream().map(o -> PontaResponseDTO.valueOf(o)).toList()).build();
    }

    @GET
    public Response findAll() {
    return Response.ok(pontaService.findAll().stream().map(o -> PontaResponseDTO.valueOf(o)).toList()).build();
    }

  @POST
   public Response create(@Valid PontaRequestDTO dto) {
      return Response.status(Status.CREATED).entity(PontaResponseDTO.valueOf(pontaService.create(dto))).build();
    
    }

   @PUT
   @Path("/{id}")
   public Response update(@PathParam("id") Long id, @Valid PontaRequestDTO dto) {
      pontaService.update(id, dto);
      return Response.noContent().build();
    }

   @DELETE
   @Path("/{id}")
   public Response delete(@PathParam("id") Long id) {
      pontaService.delete(id);
      return Response.noContent().build();
        }

}
