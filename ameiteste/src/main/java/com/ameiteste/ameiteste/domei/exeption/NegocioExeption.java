package com.ameiteste.ameiteste.domei.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class NegocioExeption extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public NegocioExeption(String message) {
        super(message);
    }

    public NegocioExeption(Long id) {
        this(String.format("Não foi possivel encontrar o usuário de Id: %d", id));
    }
}
