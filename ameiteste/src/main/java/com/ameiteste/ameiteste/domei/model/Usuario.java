package com.ameiteste.ameiteste.domei.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    private String usuario;
    private String password;
    private String tipo_perfil;
}
