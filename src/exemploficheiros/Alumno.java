package exemploficheiros;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Alumno {
    private String nome;
    private String telefono;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nome, String telefono, int nota) {
        this.nome = nome;
        this.telefono = telefono;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", telefono=" + telefono + ", nota=" + nota + '}';
    }
    
    
}
