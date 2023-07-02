package com.ameiteste.ameiteste.domei.repository;

import com.ameiteste.ameiteste.domei.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends CrudRepository<Usuario,Long> {
}
