package com.ameiteste.ameiteste.domei.repository;

import com.ameiteste.ameiteste.domei.model.DadosUsuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioDadosUsuario extends CrudRepository<DadosUsuario,Long> {

}
