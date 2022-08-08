package co.dev.playlistapp.model.dao;

import co.dev.usuarios.commons.models.entity.Songs;
import co.dev.usuarios.commons.models.entity.Usuario;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource( path = "songs")
public interface SongsDAO extends PagingAndSortingRepository<Songs,Long> {
    @RestResource( path = "findTitulo")
    @CrossOrigin(origins = "*")
    public List<Songs> findByTitulo(@Param("titulo") String titulo);
}
