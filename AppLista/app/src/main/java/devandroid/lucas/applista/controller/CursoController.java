package devandroid.lucas.applista.controller;

import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import devandroid.lucas.applista.model.Curso;

public class CursoController {

    private List listCurso;

    public List getListaDeCursos(){

         listCurso = new ArrayList<Curso>();

         listCurso.add(new Curso("Medicina"));
         listCurso.add(new Curso("Diretiro"));
         listCurso.add(new Curso("Análise e desenvolvimento de sistema"));
         listCurso.add(new Curso("Odontologia"));
         listCurso.add(new Curso("Engenharia"));
         listCurso.add(new Curso("Ciência da informação"));

         return listCurso;
    }

    public ArrayList<String> dadosParaSpinner(){

        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListaDeCursos().size(); i++) {

            Curso objeto = (Curso) getListaDeCursos().get(i);
            dados.add(objeto.getCursoDesejado());
        }
        return dados;
    }
}
