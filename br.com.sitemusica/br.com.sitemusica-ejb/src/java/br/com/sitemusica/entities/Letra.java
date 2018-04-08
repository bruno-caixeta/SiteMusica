package br.com.sitemusica.entities;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Letra {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String IdLetra;
    
    @NotNull
    private String letra;
    
    @OneToOne
    @JoinColumn(name = "IdMusica")
    private Musica musica;
}
