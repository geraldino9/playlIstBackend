package co.dev.playlistapp.service;

import co.dev.usuarios.commons.models.entity.PlayList;
import org.springframework.context.annotation.Bean;


import java.util.List;

public interface PlayListService {
    List<PlayList> findAll() throws Exception;
    List<PlayList> findByNombre( String  name ) throws Exception;
    PlayList save( PlayList playList );
    void deleteById( Long id) throws Exception;
}
