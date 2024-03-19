package Exercises.GetySet;

public class EasyCode {
    private String name = ("Jose");
    private int age = (12);
    
    public static void main(String[] args) {
        EasyCode code = new EasyCode();
        if (code.age > 12) {
            System.out.println("Hola");
        }else
        System.out.println("hola2");
    }
}

// Hay dos formas de hacer este código:
//1. Creando una instancia
//2. Sin instancia pero con las variables static

// public class Product {
//     private static String name = "Jose";
//     private static int age = 12;
    
//     public static void main(String[] args) {
//         if (age > 12) {
//             System.out.println("Hola");
//         } else {
//             System.out.println("hola2");
//         }
//     }
// }
