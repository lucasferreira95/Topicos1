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
import projeto.tp1.canetaria.dto.EnderecoRequestDTO;
import projeto.tp1.canetaria.dto.EnderecoResponseDTO;
import projeto.tp1.canetaria.service.EnderecoService;

@Path("/Endereco")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EnderecoResource {
    
    @Inject
    public EnderecoService enderecoService;

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") Long id) {
       return Response.ok(EnderecoResponseDTO.valueOf(enderecoService.findById(id))).build();
   }

    @GET
    @Path("/search/{cep}")
    public Response findByCep(@PathParam("cep") String cep) {
    return Response.ok(enderecoService.findByCep(cep).stream().map(o -> EnderecoResponseDTO.valueOf(o)).toList()).build();
    }

    @GET
    public Response findAll() {
    return Response.ok(enderecoService.findAll().stream().map(o -> EnderecoResponseDTO.valueOf(o)).toList()).build();
    }

  @POST
   public Response create(@Valid EnderecoRequestDTO dto) {
      return Response.status(Status.CREATED).entity(EnderecoResponseDTO.valueOf(enderecoService.create(dto))).build();
    
    }

   @PUT
   @Path("/{id}")
   public Response update(@PathParam("id") Long id, @Valid EnderecoRequestDTO dto) {
      enderecoService.update(id, dto);
      return Response.noContent().build();
    }

   @DELETE
   @Path("/{id}")
   public Response delete(@PathParam("id") Long id) {
      enderecoService.delete(id);
      return Response.noContent().build();
        }

}
