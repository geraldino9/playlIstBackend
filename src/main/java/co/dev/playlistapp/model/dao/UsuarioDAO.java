package co.dev.playlistapp.model.dao;


import co.dev.usuarios.commons.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource( path = "usuarios")
public interface UsuarioDAO extends PagingAndSortingRepository<Usuario,Long> {
    @RestResource( path = "findUsername")
    public Usuario findByUsername(@Param("nombre") String username);

    @Query( "Select u from Usuario u where u.username=?1")
    public Usuario obtenerPorNombre(String nombre);
}
