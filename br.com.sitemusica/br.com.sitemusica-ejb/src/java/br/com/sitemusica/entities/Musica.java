package br.com.sitemusica.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
public class Musica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdMusica;
    
    @NotNull
    private String titulo;
    
    @NotNull
    private String ano;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date duracao;
    
    private String url;
    
    @ManyToOne
    @JoinColumn(name = "IdAlbum")
    private Album album;
    
    @OneToOne(mappedBy = "musica")
    private Letra letra;
    
    @ManyToOne
    @JoinColumn(name = "IdCategoria")
    private Categoria categoria;
    
    @ManyToMany
    @JoinTable(name = "MusicaPlaylist", 
               joinColumns = @JoinColumn(name = "IdMusica"),
               inverseJoinColumns = @JoinColumn(name = "IdPlaylist"))
    private List<Playlist> musicaplaylists;
    
    @ManyToMany
    @JoinTable(name = "MusicaArtista", 
               joinColumns = @JoinColumn(name = "IdMusica"),
               inverseJoinColumns = @JoinColumn(name = "IdArtista"))
    private List<Artista> musicaartistas;
}
