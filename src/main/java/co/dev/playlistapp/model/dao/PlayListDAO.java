package co.dev.playlistapp.model.dao;


import co.dev.usuarios.commons.models.entity.PlayList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PlayListDAO extends PagingAndSortingRepository<PlayList, Long> {

//    @Query(
//            value = "select * playlist where nombre = ?1 order by nombre",
//            nativeQuery = true
//    )
    List<PlayList> findByNombre(String nombre);
}
