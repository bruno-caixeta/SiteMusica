package br.com.sitemusica.entities;

import java.util.Date;
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
    
    @ManyToOne
    @JoinColumn(name = "IdAlbum")
    private Album album;
    
    @OneToOne(mappedBy = "musica")
    private Letra letra;
}
