package com.ameiteste.ameiteste.domei.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "dados_usuario")
public class DadosUsuario {

    @Id
    private Long id_dados_usuario;
    private String nome_completo;
    private String data_nascimento;
    private String cnpj;
    private String rg;
    private String uf;
    private String celular;
    private String email;

    // Dados do endereço
    private String logradouro;
    private String cidade;
    private String bairro;
    private String complemento;
    private String numero;
    private String cep;
}
