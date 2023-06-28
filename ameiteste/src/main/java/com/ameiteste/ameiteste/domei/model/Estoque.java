package com.ameiteste.ameiteste.domei.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "UsuarioEstoque")
public class Estoque {

    @Id
    private Long id_usuario_estoque;
    private String data;
    private String unidade;
    private String produto;


}
