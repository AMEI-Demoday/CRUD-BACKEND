package com.ameiteste.ameiteste.api.controller;

import com.ameiteste.ameiteste.domei.model.Mensagens;
import com.ameiteste.ameiteste.domei.model.Usuario;
import com.ameiteste.ameiteste.domei.service.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuario")

public class ControllerUsuario {

    @Autowired
    private ServiceUsuario serviceUsuario;

    // Post, Get, Delete, Put de Usuarios

    // Cadastro de usuario
    @PostMapping ("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody Usuario usuario){
        return serviceUsuario.cadastrarAlterar(usuario, "cadastrar");
    }

    // Listar Usuarios
    @GetMapping("/listar")
    public Iterable<Usuario> listarUsuarios(){
        return serviceUsuario.listar();
    }
    @GetMapping("/listar/{id_usuario}")
    public Usuario listarUsuarioUnico(@PathVariable(value="id_usuario") Long id_usuario){
        return serviceUsuario.findById(id_usuario);
    }

    // remover usuarios
    @DeleteMapping ("/remover/{id_usuario}")
    public ResponseEntity<Mensagens> removerUsuario(@PathVariable Long id_usuario){
        return serviceUsuario.remover(id_usuario);
    }

    //Alterar Usuario
    @PutMapping ("/alterar")
    public ResponseEntity<?> alterar(@RequestBody Usuario usuario){
        return serviceUsuario.cadastrarAlterar(usuario, "alterar");
    }


    //teste
    @GetMapping ("/")
    public String rota(){
        return "Api esta funcionando";
    }
}
