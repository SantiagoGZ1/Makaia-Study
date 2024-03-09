package ClasesObjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listadoPersonas {
    //Instancias de personas para la lista
    public static void main(String[] args) {
        Persona alex = new Persona ("Alex", "Muñoz", "Velasco", 12223, 23);
        Persona Ana = new Persona ("Ana", "Zapata", "Barrios", 4444, 20);
        Persona Luis = new Persona ("Luis", "Garcia", "Velasco", 1234, 18);

        //Creación de lista
        List<Persona> listadoPersonas = new ArrayList<Persona>();
        listadoPersonas.add(alex);
        listadoPersonas.add(Ana);
        listadoPersonas.add(Luis);

        //Mostrar la lista sin ordenar
        System.out.println("Sin orden");
        for (Persona persona : listadoPersonas) {
            System.out.println(persona);
        }

        //Ordenar lista
        System.out.println("Con orden");
        Collections.sort(listadoPersonas);
        for (Persona persona : listadoPersonas) {
            System.out.println(persona);
        }
    }
}
