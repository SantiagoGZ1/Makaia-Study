package arraylists; /*
El error que estás viendo sugiere que hay un problema con la resolución de la clase java.util.AbstractList, que es una clase en el paquete java.util del JDK estándar de Java. Este error indica que tu entorno de desarrollo no puede encontrar esta clase, a pesar de que debería estar disponible en cualquier instalación estándar de Java.

*/

import java.util.ArrayList;
import java.util.List;
public class pruebaArrayList {
    public static void main(String[] args) {
        //Creando personas 
        List<Persona> lista = new ArrayList<Persona> ();
        lista.add(new Persona(1, "Santiago", 23));
        lista.add(new Persona(2, "Mariana", 21));
        lista.add(new Persona(3, "Deisy", 12));
        lista.add(new Persona(4, "Jose", 77));

        //Recorridos
        System.out.println("---For---");
        for (int i = 0; i<lista.size(); i++){
            System.out.println("Prueba: "+ lista.get(i).getName());
        }
        System.out.println("---For each---");
        //Recorrer elemento por elemento (sin el indice)
        //por cada Persona perso (cariable auxiliar), dentro de la lista
        for(Persona perso:lista){
            System.out.println("Prueba: " + perso.getName());
        }
    }
}
