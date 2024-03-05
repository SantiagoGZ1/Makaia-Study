package claseAbstracta;

public class Calculo {
    private final static double ladoCuadrado = 2.0;
    public static void main(String[] args) {
        //Crear instacia de tipo cuadrado
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(ladoCuadrado);
        System.out.println("el area del cuadrado es: "+ cuadrado.calcularArea());
        System.out.println("El perimetro es:" + cuadrado.calcularPerimetro());
    }
}
