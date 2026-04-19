package com.jaranine.roots.model;

import com.jaranine.roots.model.enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "Usuario")
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    Long id;

    private String nombre;
    private String email;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipo;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Perfil perfil;

    @OneToMany(mappedBy = "usuarioCreador")
    private List<Evento> eventosCreados;

    @OneToMany(mappedBy = "usuarioVoluntario")
    private List<Evento> eventosVoluntariado;

   public Usuario() {}
}
