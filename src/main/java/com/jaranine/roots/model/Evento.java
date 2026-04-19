package com.jaranine.roots.model;

import com.jaranine.roots.model.enums.Estado;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Evento")
@Getter
@Setter
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    Long id;

    String titulo;

    @Column(length = 500)
    String descripcion;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @ManyToOne
    private Usuario usuarioCreador;

    @ManyToOne
    private Usuario usuarioVoluntario;

    public Evento() {}
}
