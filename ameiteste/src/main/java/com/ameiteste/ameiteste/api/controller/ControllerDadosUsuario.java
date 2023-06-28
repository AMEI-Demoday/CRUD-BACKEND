package com.ameiteste.ameiteste.api.controller;

import com.ameiteste.ameiteste.domei.model.DadosUsuario;
import com.ameiteste.ameiteste.domei.service.ServiceDadosUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/dados")

public class ControllerDadosUsuario {

    @Autowired
    private ServiceDadosUsuario serviceDadosUsuario;

    // Post, Get, Delete, Put de Usuarios

    // Cadastro dos dados
    @PostMapping ("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody DadosUsuario dadosUsuario){
        return serviceDadosUsuario.cadastrarAlterar(dadosUsuario, "cadastrar");
    }

    // Listar Usuarios
    @GetMapping("/listar")
    public Iterable<DadosUsuario> listarDados(){
        return serviceDadosUsuario.listar();
    }
    @GetMapping("/listar/{id_dados_usuario}")
    public DadosUsuario listarDadosUsuario(@PathVariable(value="id_dados_usuario") Long id_dados_usuario){
        return serviceDadosUsuario.findById(id_dados_usuario);
    }


    //teste
    @GetMapping ("/")
    public String rota(){
        return "Api esta funcionando";
    }
}
