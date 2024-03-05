package ClasesObjetos;
import java.util.Scanner;

public class AppPersonas {
    public static void main(String[] args) {
        //Crear objeto tipo scaner
        Scanner consola = new Scanner(System.in);

        //Crear instacia de tipo persona
        Persona individuo = new Persona();
        
        //Dar valores a los distintps atributos
        System.out.println("Introduce name: ");
        individuo.setName(consola.next());

        System.out.println("Introduce surname");
        individuo.setFirstSurname(consola.next());

        System.out.println("Introduce second surname");
        individuo.setSecondSurname(consola.next());

        System.out.println("Introduce dni");
        individuo.setDni(consola.nextInt());

        System.out.println("Introduce age");
        individuo.setAge(consola.nextInt());

        //Mostrar info del objeto

        System.out.println(individuo);
    }
}
