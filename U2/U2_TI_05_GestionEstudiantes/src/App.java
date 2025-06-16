import Model.Curso;
import Model.Estudiante;
import Model.Persona;
import Model.Profesor;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso("CC10", "Programacion Orienteada a Objetos", 3);

        Persona profesor = new Profesor();
        profesor.setNombre("Eliel Rodriguez");
        profesor.setEmail("elielrodriguez@utez.edu.mx");

        Persona estudiante1 = new Estudiante();
        estudiante1.setNombre("Juan Salgado");
        estudiante1.setEmail("20243ds085@utez.edu.mx");
        ((Estudiante) estudiante1).setPromedio(9);
        Persona estudiante2 = new Estudiante();
        estudiante2.setNombre("Daniel Hernandez");
        estudiante2.setEmail("20243ds1234@utez.edu.mx");
        ((Estudiante) estudiante2).setPromedio(7);
        Persona estudiante3 = new Estudiante();
        estudiante3.setNombre("Alberto Peralta");
        estudiante3.setEmail("20243ds1234@utez.edu.mx");
        ((Estudiante) estudiante3).setPromedio(8);

        curso.inscribir((Estudiante) estudiante1);
        curso.inscribir((Estudiante) estudiante2);
        curso.inscribir((Estudiante) estudiante3);

        System.out.println("Profesor del grupo: "+profesor.getNombre() + "    Correo del profesor: "+profesor.getEmail());
        System.out.println("Nombre del curso: "+curso.getNombre()+ "    Salon del curso: "+curso.getCodigo());
        System.out.println("Promedio del curso: " + curso.calcularPromedioGrupo());
        System.out.println("Situacion: ");
        if(curso.calcularPromedioGrupo()<8){
            System.out.println("El grupo no esta aprobado");
        }else{
            System.out.println("El grupo esta aprobado");
        }

    }
}