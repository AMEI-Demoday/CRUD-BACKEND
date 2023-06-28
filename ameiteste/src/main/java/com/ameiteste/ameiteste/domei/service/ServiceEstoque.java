package com.ameiteste.ameiteste.domei.service;

import com.ameiteste.ameiteste.domei.exeption.NegocioExeption;
import com.ameiteste.ameiteste.domei.model.Estoque;
import com.ameiteste.ameiteste.domei.model.Mensagens;
import com.ameiteste.ameiteste.domei.repository.RepositorioEstoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceEstoque {

    @Autowired
    private RepositorioEstoque repositorioEstoque;

    @Autowired
    private Mensagens mensagens;

    // metodo para listar os produtos

    public Iterable<Estoque> listarEstoque(){
        return repositorioEstoque.findAll();
    }

    public Estoque findByIdEstoque(Long id_estoque) {
        Estoque estoque = repositorioEstoque.findById(id_estoque).orElseThrow(()-> new NegocioExeption(id_estoque));
        return estoque;
    }

    public ResponseEntity<?> cadastrarAlterar (Estoque estoque, String acao){
        if(acao.equals("cadastar")){
            return new ResponseEntity<Estoque>(repositorioEstoque.save(estoque),HttpStatus.CREATED);
        } else {
            return new ResponseEntity<Estoque>(repositorioEstoque.save(estoque), HttpStatus.OK);
        }
    }

    public ResponseEntity<Mensagens> removerEstoque (Long id_estoque){
        repositorioEstoque.deleteById(id_estoque);
        mensagens.setMensagem("O Produto foi removido com sucesso");
        return new ResponseEntity<Mensagens>(mensagens, HttpStatus.OK);
    }

}
