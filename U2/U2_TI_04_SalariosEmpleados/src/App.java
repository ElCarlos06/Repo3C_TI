public class App {
    public static void main(String[] args) throws Exception {
        Empleado EmpleadoTiempoCompleto = new EmpleadoTiempoCompleto("20243ds085", "Carlos", 650, "Incluye seguro");
        System.out.println("Id del emplado de tiempo completo: "+EmpleadoTiempoCompleto.getId());
        System.out.println("nombre del Emplado de tiempo completo: "+EmpleadoTiempoCompleto.getNombre());
        System.out.println("Salario del Empleado Tiempo Completo: "+EmpleadoTiempoCompleto.calcularSalario());
        System.out.println("Beneficios: "+ ((EmpleadoTiempoCompleto) EmpleadoTiempoCompleto).getBeneficios());
        System.out.println("\"No le pagan lo suficiente\"");
        System.out.println("---------------------------------");
        
        Empleado EmpleadoPorHoras = new EmpleadoPorHoras("243ds075", "Daniel", 25, 12);
        System.out.println("Id del emplado por Horas: "+EmpleadoPorHoras.getId());
        System.out.println("Nombre del emplado por Horas: "+EmpleadoPorHoras.getNombre());
        System.out.println("Pago por hora del Empleado: "+EmpleadoPorHoras.getSalarioBase());
        System.out.println("Horas trabajadas del Empleado: "+((EmpleadoPorHoras) EmpleadoPorHoras).getHorasTrabajadas());
        System.out.println("Salario del Empleado: "+EmpleadoPorHoras.calcularSalario());
        System.out.println("\"Su salario vale lo de un pollo asado\"");

    }
}