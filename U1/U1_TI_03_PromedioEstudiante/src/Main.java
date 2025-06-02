import Model.Student;

// Clase principal
public class Main {
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.setMatricula("20243ds075");
        st1.setNombre("Daniel");
        st1.setNota(0, 69.65);
        st1.setNota(1, 67.45);
        st1.setNota(2, 60.90);
        st1.setNota(3, 71.45);
        st1.setNota(4, 75);
        Student st2 = new Student();
        st2.setNombre("Carlos");
        st2.setMatricula("20243ds085");
        st2.setNota(0, 90);
        st2.setNota(1, 90);
        st2.setNota(2, 90);
        st2.setNota(3, 85);
        st2.setNota(4, 75);
        Student st3 = new Student();
        st3.setNombre("Antonio");
        st3.setMatricula("20243ds076");
        st3.setNota(0, 90);
        st3.setNota(1, 60);
        st3.setNota(2, 60);
        st3.setNota(3, 85);
        st3.setNota(4, 60);
        Student st4 = new Student();
        st4.setNombre("Alberto");
        st4.setMatricula("20243ds086");
        st4.setNota(0, 75);
        st4.setNota(1, 65);
        st4.setNota(2, 84.6);
        st4.setNota(3, 79.8);
        st4.setNota(4, 64);
        Student st5 = new Student();
        st5.setNombre("Santiago");
        st5.setMatricula("20243ds095");
        st5.setNota(0, 70.6);
        st5.setNota(1, 58.8);
        st5.setNota(2, 60);
        st5.setNota(3, 75);
        st5.setNota(4, 70);

        System.out.println("Nombre: "+ st1.getNombre());
        System.out.println("Matricula: "+ st1.getMatricula());
        System.out.println("Promedio: "+ st1.calcularPromedio());
        System.out.println(st1.aprobado() + "\n");
        System.out.println("Nombre: "+ st2.getNombre());
        System.out.println("Matricula: "+ st2.getMatricula());
        System.out.println("Promedio: "+ st2.calcularPromedio());
        System.out.println(st2.aprobado() + "\n");
        System.out.println("Nombre: "+ st3.getNombre());
        System.out.println("Matricula: "+ st3.getMatricula());
        System.out.println("Promedio: "+ st3.calcularPromedio());
        System.out.println(st3.aprobado() + "\n");
        System.out.println("Nombre: "+ st4.getNombre());
        System.out.println("Matricula: "+ st4.getMatricula());
        System.out.println("Promedio: "+ st4.calcularPromedio());
        System.out.println(st4.aprobado() + "\n");
        System.out.println("Nombre: "+ st5.getNombre());
        System.out.println("Matricula: "+ st5.getMatricula());
        System.out.println("Promedio: "+ st5.calcularPromedio());
        System.out.println(st5.aprobado());
    }
}