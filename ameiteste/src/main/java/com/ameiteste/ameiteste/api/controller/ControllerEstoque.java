package com.ameiteste.ameiteste.api.controller;

import com.ameiteste.ameiteste.domei.model.Estoque;
import com.ameiteste.ameiteste.domei.model.Mensagens;
import com.ameiteste.ameiteste.domei.service.ServiceEstoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/estoque")

public class ControllerEstoque {

    @Autowired
    private ServiceEstoque serviceEstoque;

    // Post, Get, Delete, Put do estoque

    // Cadastro do estoque

    @PostMapping ("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody Estoque estoque){
        return serviceEstoque.cadastrarAlterar(estoque, "cadastrar");
    }

    // Listar Produto
    @GetMapping ("/listar")
    public Iterable<Estoque> listarEstoque(){
        return serviceEstoque.listarEstoque();
    }

    @GetMapping("/listar/{id_estoque}")
    public Estoque listarEstoqueUsuario(@PathVariable(value = "id_estoque") Long id_estoque){
        return serviceEstoque.findByIdEstoque(id_estoque);
    }

    //Alterar Produto
    @PutMapping ("/alterar")
    public ResponseEntity<?> alterarEstoque(@RequestBody Estoque estoque){
        return serviceEstoque.cadastrarAlterar(estoque, "alterar");
    }

    @DeleteMapping ("/remover/{id_estoque}")
    public ResponseEntity<Mensagens> removerProduto(@PathVariable Long id_estoque){
        return serviceEstoque.removerEstoque(id_estoque);
    }

    //teste
    @GetMapping("/")
    public String rota(){
        return "API do estoque está funcionando";
    }

}
