package devandroid.lucas.applista.model;

public class Curso {

    private String CursoDesejado;

    public Curso(String cursoDesejado) {
        this.CursoDesejado = cursoDesejado;
    }


    public String getCursoDesejado() {
        return CursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        CursoDesejado = cursoDesejado;
    }
}
