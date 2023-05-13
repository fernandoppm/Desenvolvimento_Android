package devandroid.lucas.applista.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.lucas.applista.model.Pessoa;
import devandroid.lucas.applista.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor lista;

    public static final String NOME_PREFERENCES = "pref_lista";


    public PessoaController(MainActivity mainActivity) {
        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        lista = preferences.edit();

    }

    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_Controller", "Controller Iniciada...");
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {

        Log.d("MVC_Controller", "salvo: " + pessoa.toString());

        lista.putString("primeiroNome", pessoa.getPrimeiroNome());
        lista.putString("Sobrenome", pessoa.getSobrenome());
        lista.putString("nomeCurso", pessoa.getCursoDesejado());
        lista.putString("telefoneContato", pessoa.getTelefoneContato());
        lista.apply();

    }

    public Pessoa buscar(Pessoa pessoa) {

        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", ""));
        pessoa.setSobrenome(preferences.getString("Sobrenome", ""));
        pessoa.setCursoDesejado(preferences.getString("nomeCurso", ""));
        pessoa.setTelefoneContato(preferences.getString("telefoneContato", ""));

        return pessoa;

    }

    public void limpar() {

        lista.clear();
        lista.apply();


    }

}
