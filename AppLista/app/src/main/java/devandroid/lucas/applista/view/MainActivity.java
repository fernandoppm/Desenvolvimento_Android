package devandroid.lucas.applista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import devandroid.lucas.applista.R;
import devandroid.lucas.applista.controller.CursoController;
import devandroid.lucas.applista.controller.PessoaController;
import devandroid.lucas.applista.model.Curso;
import devandroid.lucas.applista.model.Pessoa;

public class MainActivity extends AppCompatActivity {


    PessoaController controller;
    CursoController cursoController;
    Pessoa pessoa;
    List<String> nomesDoCursos;


    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editNomedoCurso;
    EditText editTelefonedeContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        controller = new PessoaController(MainActivity.this);
        controller.toString();

        cursoController = new CursoController();
        nomesDoCursos = cursoController.dadosParaSpinner();

         pessoa = new Pessoa();

       controller.buscar(pessoa);

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editNomedoCurso = findViewById(R.id.editNomedoCurso);
        editTelefonedeContato = findViewById(R.id.editTelefonedeContato);
        spinner = findViewById(R.id.spinner);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSobrenome());
        editNomedoCurso.setText(pessoa.getCursoDesejado());
        editTelefonedeContato.setText(pessoa.getTelefoneContato());

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,
        cursoController.dadosParaSpinner());

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        spinner.setAdapter(adapter);


        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editPrimeiroNome.setText("");
                editSobrenome.setText("");
                editNomedoCurso.setText("");
                editTelefonedeContato.setText("");

                controller.limpar();

            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Muito Obrigado, Volte Sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobrenome(editSobrenome.getText().toString());
                pessoa.setCursoDesejado(editNomedoCurso.getText().toString());
                pessoa.setTelefoneContato(editTelefonedeContato.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo" + pessoa.toString(), Toast.LENGTH_LONG).show();


                controller.salvar(pessoa);
            }
        });

        Log.i("POOAndroid", pessoa.toString());
    }
}