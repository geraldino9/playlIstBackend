package co.dev.playlistapp.model.dao;

import co.dev.playlistapp.model.entity.PlayList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayListDAO extends CrudRepository<PlayList, Long> {

//    @Query(
//            value = "select * playlist where nombre = ?1 order by nombre",
//            nativeQuery = true
//    )
    List<PlayList> findByNombre(String nombre);
}
