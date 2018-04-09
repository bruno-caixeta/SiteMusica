package br.com.sitemusica.entities;

import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Artista {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdArtista;
    
    @NotNull
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "IdNacionalidade")
    private Nacionalidade nacionalidade;
    
    @ManyToMany(mappedBy = "musicaartistas")
    private List<Musica> artistamusicas;
}
