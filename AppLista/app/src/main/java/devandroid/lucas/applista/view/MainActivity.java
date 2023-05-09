package devandroid.lucas.applista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.lucas.applista.R;
import devandroid.lucas.applista.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    View view2;

    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editNomedoCurso;
    EditText editTelefonedeContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();

        //pessoa.setPrimeiroNome("Lucas");
        //pessoa.setSobrenome("Fernando");
        //pessoa.setCursoDesejado("Android");
        //pessoa.setTelefoneContato("81-940028922");


        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Maria");
        outraPessoa.setSobrenome("Fatima");
        outraPessoa.setCursoDesejado("Python");
        outraPessoa.setTelefoneContato("81-77567788");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editNomedoCurso = findViewById(R.id.editNomedoCurso);
        editTelefonedeContato = findViewById(R.id.editTelefonedeContato);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);


        editPrimeiroNome.setText(outraPessoa.getPrimeiroNome());
        editSobrenome.setText(outraPessoa.getSobrenome());
        editNomedoCurso.setText(outraPessoa.getCursoDesejado());
        editTelefonedeContato.setText(outraPessoa.getTelefoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editPrimeiroNome.setText("");
                editSobrenome.setText("");
                editNomedoCurso.setText("");
                editTelefonedeContato.setText("");
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


                Toast.makeText(MainActivity.this, "Salvo"+pessoa.toString(), Toast.LENGTH_LONG).show();

            }
        });




        /* dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobrenome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobrenome();
        dadosOutraPessoa += " Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone de Contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato(); */


        Log.i("POOAndroid", pessoa.toString());
        Log.i("POOAndroid", outraPessoa.toString());
    }
}