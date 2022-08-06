package co.dev.playlistapp.controlers;

import co.dev.playlistapp.model.entity.PlayList;

import co.dev.playlistapp.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

//@RefreshScope
@RestController
public class PlaylistController {
    Logger log = LoggerFactory.getLogger( PlaylistController.class );
    private Map<String, Object> responseError;

   @Autowired
    private PlayListService playListService;

    @GetMapping("/listar")
    @CrossOrigin(origins = "http://localhost:3000/")
    public ResponseEntity<?> listar() {
        try {
            return new ResponseEntity<>(playListService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            responseError = new HashMap<>();
            responseError.put("error", e.getMessage().concat(" :: ").concat(e.getLocalizedMessage()));
            responseError.put("message", e.getMessage());
            return new ResponseEntity<>(responseError, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/ver/{name}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<?> ver(@PathVariable String name) {
        PlayList playList;
        try {
            return new ResponseEntity<>(playListService.findByNombre(name), HttpStatus.OK);
        }catch (Exception e) {
            responseError = new HashMap<>();
            responseError.put("error", e.getMessage().concat(" :: ").concat(e.getLocalizedMessage()));
            responseError.put("message", "Error al ver ingreso para el id :: " + name);
            return new ResponseEntity<>(responseError, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/agregar")
    @CrossOrigin(origins = "*")
    public ResponseEntity<?> agregar(@RequestBody PlayList playList) {
        try {
            return new ResponseEntity<>(playListService.save(playList), HttpStatus.CREATED);
        } catch (Exception e) {
            responseError = new HashMap<>();
            responseError.put("error", e.getMessage().concat(" :: ").concat(e.getLocalizedMessage()));
            responseError.put("message", e.getMessage());
            return new ResponseEntity<>(responseError, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/eliminar/{id}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<?> eliminar( @PathVariable Long id) {
        try {
            playListService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            responseError = new HashMap<>();
            responseError.put("error", e.getMessage().concat(" :: ").concat(e.getLocalizedMessage()));
            responseError.put("message", "Error al eliminar ingreso para el id :: " + id);
            return new ResponseEntity<>(responseError, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
