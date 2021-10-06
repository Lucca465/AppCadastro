package com.example.appcadastro.repositories;

import com.example.appcadastro.models.Usuario;

public class UsuarioRepository {

    public Boolean verificarEmailExistente(String email){
        if ("a@email.com".equals(email)){
            return true;
        } else {
            return false;
        }
    }

    public Usuario cadastrar(Usuario usuario){
        if (!verificarEmailExistente(usuario.getEmail())){
            usuario.setId(1);
            return usuario;
        }
        return null;
    }
}
