package com.ameiteste.ameiteste.domei.service;

import com.ameiteste.ameiteste.domei.exeption.NegocioExeption;
import com.ameiteste.ameiteste.domei.model.DadosUsuario;
import com.ameiteste.ameiteste.domei.model.Mensagens;
import com.ameiteste.ameiteste.domei.model.Usuario;
import com.ameiteste.ameiteste.domei.repository.RepositorioDadosUsuario;
import com.ameiteste.ameiteste.domei.repository.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceDadosUsuario {

    @Autowired
    private RepositorioDadosUsuario repositorioDadosUsuario;
    @Autowired
    private Mensagens mensagens;

    // Metodo para listar todos os dados do usuarios

    public Iterable<DadosUsuario> listar(){
        return repositorioDadosUsuario.findAll();
    }
    public DadosUsuario findById(long id) {
        DadosUsuario dadosUsuario = repositorioDadosUsuario.findById(id).orElseThrow(()-> new NegocioExeption(id));
        return dadosUsuario;
    }
    public ResponseEntity<?> cadastrarAlterar (DadosUsuario dadosUsuario, String acao){
        if(dadosUsuario.getNome_completo().equals("") && dadosUsuario.getData_nascimento().equals("")){
            mensagens.setMensagem ("Todos os dados são obrigatório");
            return new ResponseEntity<Mensagens>(mensagens, HttpStatus.BAD_REQUEST);
        } else {
            if (acao.equals("cadastrar")) {
                return new ResponseEntity<DadosUsuario>(repositorioDadosUsuario.save(dadosUsuario), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<DadosUsuario>(repositorioDadosUsuario.save(dadosUsuario), HttpStatus.OK);
            }
        }
    }

    public ResponseEntity<Mensagens> remover (Long id_dados_usuario){
        repositorioDadosUsuario.deleteById(id_dados_usuario);
        mensagens.setMensagem("O Usuario foi removido com sucesso");
        return new ResponseEntity<Mensagens>(mensagens, HttpStatus.OK);
    }

}
