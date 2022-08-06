package co.dev.playlistapp.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "playlistsongs")
public class PlayListSongs implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "plso_id", nullable = false)
    private Long id;

    @Column(name = "playlist_id")
    private Long playlistId;
    @Column(name = "song_id")
    private Long songId;


    @JsonIgnoreProperties({"playlistsongs", "hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "song_id", insertable = false, updatable = false)
    private Songs songs;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Long playlistId) {
        this.playlistId = playlistId;
    }

    public Long getSongId() {
        return songId;
    }

    public void setSongId(Long songId) {
        this.songId = songId;
    }

//    public Songs getSongs() {
//        return songs;
//    }

    public void setSongs(Songs songs) {
        this.songs = songs;
    }
}
