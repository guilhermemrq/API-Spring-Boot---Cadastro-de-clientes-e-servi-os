package io.github.guilhermem.clientes.rest;

import io.github.guilhermem.clientes.exception.UsuarioCadastradoException;
import io.github.guilhermem.clientes.model.entity.Usuario;
import io.github.guilhermem.clientes.model.repository.UsuarioRepository;
import io.github.guilhermem.clientes.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
//@RequiredArgsConstructor
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody @Valid Usuario usuario){
        try{
            System.out.println(usuario);
            usuarioService.salvar(usuario);
        }catch(UsuarioCadastradoException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }
}
