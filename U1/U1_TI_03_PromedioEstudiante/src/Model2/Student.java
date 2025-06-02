package Model2;

public class Student {
    private String nombres;
    private String matricula;
    private double[] notas = new double[5];
    
    public void setNombre(String nombres){
        this.nombres = nombres;
    }
    public String getNombre(){
        return this.nombres;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }

    public double getNota(int i) {
        return notas[i];
    }

    public void setNota(int i, double nota) {
        this.notas[i]=nota;
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
