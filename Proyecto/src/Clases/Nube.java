package Clases;

import java.util.List;

public class Nube {
    public Estudiante estudiantes;
    public Materia materias;
    public Nota notas;

    public Nube() {
    }

    public Nube(Estudiante estudiantes, Materia materias, Nota notas) {
        this.estudiantes = estudiantes;
        this.materias = materias;
        this.notas = notas;
    }

    public Estudiante getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Materia getMaterias() {
        return materias;
    }

    public void setMaterias(Materia materias) {
        this.materias = materias;
    }

    public Nota getNotas() {
        return notas;
    }

    public void setNotas(Nota notas) {
        this.notas = notas;
    }
}
