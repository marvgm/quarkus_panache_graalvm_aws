package curso.projeto;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/categoria")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CategoriaResource {
	
	
	  @Inject private CategoriaRepository categoriaRepository;
	 

	/*
	 * @GET public List<Categoria> listarTodasCategorias() { Categoria cate = new
	 * Categoria(); return cate.listarTodasCategorias(); }
	 */
    
	@GET
	public List<Categoria> listarTodasCategoriasRepository() {
		return categoriaRepository.listAll();
	}
	 
	@POST
	@Transactional
	public Categoria SalvarCategoria(@Valid Categoria categoria) {
		categoria.persist();
		return categoria;
	}
	 
}