package com.example.appcadastro.viewmodels;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.appcadastro.models.Usuario;
import com.example.appcadastro.repositories.UsuarioRepository;

public class TelaCadastroViewModel extends ViewModel {

    private UsuarioRepository repositorio;

    public TelaCadastroViewModel() {
        this.repositorio = new UsuarioRepository();
    }

    public void cadastrar(Usuario usuario) {
        Log.i(getClass().getName(), "cadastrar usuario de email " + usuario.getEmail());

        Usuario u = new Usuario();
        u = repositorio.cadastrar(usuario);

        if(u != null){
            Log.i(getClass().getName(), "Usuario Cadastrado " + usuario.getId());
        } else {
            Log.i(getClass().getName(), "Usuario não Cadastrado " + usuario.getId());
        }
    }
}
