package devandroid.lucas.applista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.lucas.applista.R;
import devandroid.lucas.applista.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Lucas");
        pessoa.setSobrenome("Fernando");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("81-940028922");


        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Maria");
        outraPessoa.setSobrenome("Fatima");
        outraPessoa.setCursoDesejado("Python");
        outraPessoa.setTelefoneContato("81-77567788");

        dadosPessoa = "Primeiro nome: ";
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
        dadosOutraPessoa += outraPessoa.getTelefoneContato();



    }
}