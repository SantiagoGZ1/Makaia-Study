package claseAbstracta;

public class Cuadrado extends FiguraGeometrica {

    private final int numLados = 4;
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }



    //-----
    @Override
    public double calcularArea() {
        double area = Math.pow(lado, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = lado* numLados;
        return perimetro;
    }
    
    
}
