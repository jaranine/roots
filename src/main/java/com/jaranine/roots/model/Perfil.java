package com.jaranine.roots.model;

import com.jaranine.roots.model.enums.Disponibilidad;
import com.jaranine.roots.model.enums.Intereses;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    Long id;

    @Column(length = 500)
    String descripcion;

    @Enumerated(EnumType.STRING)
    private Intereses intereses;

    @Enumerated(EnumType.STRING)
    private Disponibilidad disponibilidad;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Perfil() {}
}
