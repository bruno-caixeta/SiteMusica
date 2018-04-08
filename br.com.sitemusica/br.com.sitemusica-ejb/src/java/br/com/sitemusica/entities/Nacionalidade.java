package br.com.sitemusica.entities;

import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Nacionalidade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdNacionalidade;
    
    @NotNull
    private String descricao;
    
    @OneToMany(mappedBy = "nacionalidade")
    private List<Artista> artistas;
}
