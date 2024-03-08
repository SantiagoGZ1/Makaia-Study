package claseGenerica;

public class DemoOperaciones {
    public static void main(String[] args) {
        Operaciones<Integer> opI = new Operaciones<Integer>(); //Instancia
        //integer = indicamos que tipo de dato le vamos a pasar

        System.out.println("La suma es: " +  opI.suma(3));
        System.out.println("La suma es: " +  opI.resta(3));
        System.out.println("La suma es: " +  opI.multiplicacion(3));
        System.out.println("La suma es: " +  opI.division(3));
        
        Operaciones<Double> opD = new Operaciones<Double>();
        System.out.println("La suma es: " +  opD.suma(12.22));
    }
}
