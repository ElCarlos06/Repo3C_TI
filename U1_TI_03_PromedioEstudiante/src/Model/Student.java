package Model;

public class Student {
    private String nombre;
    private String matricula;
    private double[] notas = new double[5];

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }

    public double getNota(int i) {
        if (i >= 0 && i < notas.length) {
            return notas[i];
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    public void setNota(int i, double n) {
        if (i >= 0 && i < notas.length) {
            notas[i] = n;
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    public double calcularPromedio(){
        double suma = 0;
        for(double nota : notas){
            suma += nota;
        }
        return suma/notas.length;

    }

    public boolean aprobado(){
        boolean aprobado = false;
        if (calcularPromedio()>=70){
            aprobado = true;
            System.out.println("Esta aprobado");
        }
        else{
            System.out.println("No esta aprobado");
        }
        return aprobado;
    }

}
