package br.com.sitemusica.entities;

import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Playlist {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdPlaylist;
    
    @NotNull
    private String nomePlaylist;
    
    @ManyToOne
    @JoinColumn(name = "IdUsuario")
    private Usuario usuario;
    
    @ManyToMany(mappedBy = "musicaplaylists")
    private List<Musica> playlistmusicas;
}
