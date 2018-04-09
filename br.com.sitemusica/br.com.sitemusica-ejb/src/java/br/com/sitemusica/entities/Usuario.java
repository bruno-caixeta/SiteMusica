package br.com.sitemusica.entities;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdUsuario;
    
    @NotNull
    private String nomeUsuario;
    
    @NotNull
    private String senha;
    
    @NotNull
    private String email;
    
    @NotNull
    private String nomeReal;
    
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dataNascimento;
    
    @OneToMany(mappedBy = "usuario")
    private List<Playlist> playlists;
}
