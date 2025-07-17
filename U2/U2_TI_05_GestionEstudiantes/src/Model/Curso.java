package Model;

public class Curso {
    private String codigo;
    private String nombre;
    private Estudiante[] inscritos;

    public Curso(String codigo, String nombre, int capacidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.inscritos = new Estudiante[capacidad];
    }

    public boolean inscribir(Estudiante e) {
        for (int i = 0; i < inscritos.length; i++) {
            if (inscritos[i] == null) {
                inscritos[i] = e;
                return true;
            }
        }
        return false;
    }

    public double calcularPromedioGrupo() {
        double suma = 0;
        for (Estudiante e : inscritos) {  
            if (e != null) {
                suma += e.getPromedio();
            }
        }
    
        return suma/inscritos.length;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Estudiante[] getInscritos() {
        return inscritos;
    }
    public void setInscritos(Estudiante[] inscritos) {
        this.inscritos = inscritos;
    }
}
