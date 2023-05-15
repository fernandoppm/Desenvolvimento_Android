package devandroid.lucas.applista.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.lucas.applista.model.Curso;

public class CursoController {

    public List listCurso;

    public List getListaDeCursos(){

         listCurso = new ArrayList<Curso>();

         listCurso.add(new Curso());
         listCurso.add(new Curso());
         listCurso.add(new Curso());
         listCurso.add(new Curso());
         listCurso.add(new Curso());
         listCurso.add(new Curso());

         return listCurso;
    }
}
