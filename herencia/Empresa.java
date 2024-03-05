package herencia;

public class Empresa {
    public static void main(String[] args) {
        //Crear una instacia tipo Empleado
        Empleado empleado = new Empleado();
        empleado.setName("Rebeca");
        empleado.setFirstSurname("Velasco");
        empleado.setSecondSurname("Garcia");
        empleado.setDni(123456789);
        empleado.setAge(22);
        empleado.setAntiguedad(2);
        empleado.setSalario(10000);
        empleado.setPuesto("jefe");

        System.out.println(empleado);

        empleado.actualizarSalario(150.0);
        
        System.out.println(empleado);
    }
}
