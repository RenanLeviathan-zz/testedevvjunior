/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renanduarte.testedevjunior;

import java.util.function.BiConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Renan Duarte
 */
@RestController
public class UsuarioController {
    
    @Autowired
    private UsuarioRepository _usuarioRepository;
    
    @RequestMapping(value = "/usuario", method =  RequestMethod.POST)
    public Usuario Post(@RequestBody MultiValueMap paramMap)
    {
        Usuario user = new Usuario(paramMap.getFirst("nome").toString(), paramMap.getFirst("email").toString(), paramMap.getFirst("telefone").toString());
        return _usuarioRepository.save(user);
    }
    public String usuario() {
        return "usuario";
    }
    
}
