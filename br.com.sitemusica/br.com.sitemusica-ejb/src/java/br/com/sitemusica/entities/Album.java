package br.com.sitemusica.entities;

import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Album {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdAlbum;
    
    @NotNull
    private String titulo;

    @OneToMany(mappedBy = "album")
    private List<Musica> musicas;
    
}
