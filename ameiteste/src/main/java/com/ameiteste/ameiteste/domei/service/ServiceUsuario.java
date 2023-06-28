package com.ameiteste.ameiteste.domei.service;

import com.ameiteste.ameiteste.domei.exeption.NegocioExeption;
import com.ameiteste.ameiteste.domei.model.Mensagens;
import com.ameiteste.ameiteste.domei.model.Usuario;
import com.ameiteste.ameiteste.domei.repository.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ServiceUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;
    @Autowired
    private Mensagens mensagens;

    // Metodo para listar todos os dados do usuarios

    public Iterable<Usuario> listar(){
        return repositorioUsuario.findAll();
    }
    public Usuario findById(long id_usuario) {
        Usuario usuario = repositorioUsuario.findById(id_usuario).orElseThrow(()-> new NegocioExeption(id_usuario));
        return usuario;
    }
    public ResponseEntity<?> cadastrarAlterar (Usuario usuario, String acao){
        if(usuario.getUsuario().equals("") && usuario.getPassword().equals("")){
            mensagens.setMensagem ("Todos os dados são obrigatório");
            return new ResponseEntity<Mensagens>(mensagens, HttpStatus.BAD_REQUEST);
        } else {
            if (acao.equals("cadastrar")) {
                return new ResponseEntity<Usuario>(repositorioUsuario.save(usuario), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<Usuario>(repositorioUsuario.save(usuario), HttpStatus.OK);
            }
        }
    }

    public ResponseEntity<Mensagens> remover (Long id_usuario){
        repositorioUsuario.deleteById(id_usuario);
        mensagens.setMensagem("O Usuario foi removido com sucesso");
        return new ResponseEntity<Mensagens>(mensagens, HttpStatus.OK);
    }

}
