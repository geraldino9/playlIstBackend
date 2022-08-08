package co.dev.playlistapp.service.impl;

import co.dev.playlistapp.model.dao.PlayListDAO;
import co.dev.usuarios.commons.models.entity.PlayList;
import co.dev.playlistapp.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlayListServiceImpl implements PlayListService {

    @Autowired
    PlayListDAO playListDAO;

    @Override
    public List<PlayList> findAll() throws Exception {
        return (List<PlayList>) playListDAO.findAll();
    }

    @Override
    public List<PlayList> findByNombre(String name) throws Exception {
        return (List<PlayList>) playListDAO.findByNombre(name);
    }

    @Override
    public PlayList save(PlayList playList) {
        return playListDAO.save(playList);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        playListDAO.deleteById(id);
    }


}
