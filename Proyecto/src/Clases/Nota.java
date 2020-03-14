package Clases;

public class Nota {
    float nota;

    public Nota(float nota) {
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void Validar(float nota)  throws InvalidNotaException {
        if (nota <= 5.0) {
            System.out.println("Guardado");
        } else {
            throw new InvalidNotaException("Error, la nota maxima es 5.0");
        }
    }

}
