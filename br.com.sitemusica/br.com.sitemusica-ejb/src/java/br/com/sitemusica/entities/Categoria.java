package br.com.sitemusica.entities;

import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdCategoria;
    
    @NotNull
    private String descricao;
    
    @OneToMany(mappedBy = "categoria")
    private List<Musica> musicas;
}
