package Exercises;

public class Estudiantes{
    private String name;
    private int edad;
    private double promedio;

    public Estudiantes(String name, int edad, double promedio) {
        this.name = name;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public static void main(String[] args) {
        //Instacia
        Estudiantes estudiantes = new Estudiantes("Santiago", 23, 85.3);
        
        System.out.println("Name: " + estudiantes.getName());
        System.out.println("Name: " + estudiantes.getEdad());
        System.out.println("Name: " + estudiantes.getPromedio());

        //Mod name
        estudiantes.setName("Maria");
        System.out.println("Name2" + estudiantes.getName());
    }
    
}