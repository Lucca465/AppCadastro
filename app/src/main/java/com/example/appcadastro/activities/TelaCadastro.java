package com.example.appcadastro.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.appcadastro.R;
import com.example.appcadastro.models.Usuario;
import com.example.appcadastro.viewmodels.TelaCadastroViewModel;

public class TelaCadastro extends AppCompatActivity {

    private TelaCadastroViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        ViewModelProvider vmp = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory());
        viewModel = vmp.get(TelaCadastroViewModel.class);
    }

    public void botaoCadastrarClick(View view) {

        String email = ((TextView) findViewById(R.id.txtEmailCadastro)).getText().toString();
        String senha = ((TextView) findViewById(R.id.txtSenhaCadastro)).getText().toString();

        Usuario usuario = new Usuario(email, senha);
        viewModel.cadastrar(usuario);
    }
}